
package com.ryada.erp_inventory.models.branches;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Plan {

    @Expose
    private Long planId;
    @Expose
    private Object planName;

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Object getPlanName() {
        return planName;
    }

    public void setPlanName(Object planName) {
        this.planName = planName;
    }

}
