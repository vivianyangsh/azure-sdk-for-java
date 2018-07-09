/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_05_31_preview.implementation;

import com.microsoft.azure.management.billing.v2018_05_31_preview.BillingAccount;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.billing.v2018_05_31_preview.Enrollment;

class BillingAccountImpl extends WrapperImpl<BillingAccountInner> implements BillingAccount {
    private final BillingManager manager;
    BillingAccountImpl(BillingAccountInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public String accountType() {
        return this.inner().accountType();
    }

    @Override
    public String address() {
        return this.inner().address();
    }

    @Override
    public String agreements() {
        return this.inner().agreements();
    }

    @Override
    public List<BillingProfileInner> billingProfiles() {
        return this.inner().billingProfiles();
    }

    @Override
    public String company() {
        return this.inner().company();
    }

    @Override
    public String country() {
        return this.inner().country();
    }

    @Override
    public String defaultCurrency() {
        return this.inner().defaultCurrency();
    }

    @Override
    public List<DepartmentInner> departments() {
        return this.inner().departments();
    }

    @Override
    public List<EnrollmentAccountInner> enrollmentAccounts() {
        return this.inner().enrollmentAccounts();
    }

    @Override
    public Enrollment enrollmentDetails() {
        return this.inner().enrollmentDetails();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<ProjectInner> projects() {
        return this.inner().projects();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}