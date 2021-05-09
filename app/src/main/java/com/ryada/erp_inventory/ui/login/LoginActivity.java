package com.ryada.erp_inventory.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ryada.erp_inventory.R;
import com.ryada.erp_inventory.databinding.ActivityLoginBinding;
import com.ryada.erp_inventory.models.JsonResponse;
import com.ryada.erp_inventory.other.CheckInternet;
import com.ryada.erp_inventory.ui.companies.CompaniesActivity;
import com.ryada.erp_inventory.ui.foundations.FoundationsActivity;

import static com.ryada.erp_inventory.other.StaticVariables.USER_TOKEN;

public class LoginActivity extends AppCompatActivity {

    LoginViewModel loginViewModel;
    private static final String TAG = "LoginActivity";

    public static final String USER_TOKEN_INTENT = "com.ryada.erp_inventory.ui.login.userToken";
    public static final String FOUNDATION_ID_INTENT = "com.ryada.erp_inventory.ui.login.foundation_id";
    private ActivityLoginBinding binding;

    private String userName;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        LoginViewModelFactory factory = new LoginViewModelFactory(getApplication());
        loginViewModel = new ViewModelProvider(this, factory)
                .get(LoginViewModel.class);

        binding.loginBtn.setOnClickListener(view -> {
            userName = String.valueOf(binding.userName.getText());
            password = String.valueOf(binding.password.getText());
            checkLoginInfo(userName, password);
        });

    }

    private boolean userAlreadyExist() {
        return (USER_TOKEN != null);
    }
    String userRole = null;

    private void checkLoginInfo(String userName, String password) {
        //Administrator, FoundationAdmin,
        boolean isOnline = new CheckInternet(this).isInternetConnected();
        if (isInputValid() && isOnline) {
            binding.progressBar.setVisibility(View.VISIBLE);
            loginViewModel.checkUserIdentity(userName, password);
            loginViewModel.jsonResponseMutableLiveData.observe(LoginActivity.this,
                    response -> {
                        if (response != null) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                userRole = String.join("," , response.getUserRoles());
                            }
                            getResponse(response, userRole);

                        } else {
                            Toast.makeText(this, getString(R.string.not_signed), Toast.LENGTH_SHORT).show();
                            binding.progressBar.setVisibility(View.GONE);
                        }
            });
        } else {
            if (!isOnline) {
                Toast.makeText(this, getString(R.string.no_internet), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, getString(R.string.unexpected_error), Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void getResponse(JsonResponse response, String userRole) {
        if (userRole.contains("FoundationAdmin"))
            startActivity(new Intent(this, CompaniesActivity.class)
                    .putExtra(USER_TOKEN_INTENT, response.getToken())
                    .putExtra(FOUNDATION_ID_INTENT, response.getFoundationId()));

        else if (userRole.contains("Administrator"))
            startActivity(new Intent(this, FoundationsActivity.class)
                    .putExtra(USER_TOKEN_INTENT, response.getToken()));

        else if (userRole.contains("CompanyAdmin"))
            startActivity(new Intent(this, CompaniesActivity.class)
                    .putExtra(USER_TOKEN_INTENT, response.getToken())
                    .putExtra(FOUNDATION_ID_INTENT, response.getCompanyId()));
    }

    private boolean isInputValid() {
        if (userName.isEmpty()) {

            binding.userName.setError(getString(R.string.user_name_empty));
            return false;
        } else if (password.isEmpty()) {

            binding.password.setError(getString(R.string.user_name_empty));
            return false;
        } else {
            return true;
        }
    }

    @Override
    protected void onPause() {
        binding.progressBar.setVisibility(View.GONE);
        super.onPause();
    }
}