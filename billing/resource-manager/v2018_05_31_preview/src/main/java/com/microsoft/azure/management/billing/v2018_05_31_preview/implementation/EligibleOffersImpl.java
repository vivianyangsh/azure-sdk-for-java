/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2018_05_31_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_05_31_preview.EligibleOffers;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_05_31_preview.EligibleOfferListResult;
import com.microsoft.azure.management.billing.v2018_05_31_preview.EligibleOffer;

class EligibleOffersImpl extends WrapperImpl<EligibleOffersInner> implements EligibleOffers {
    private final BillingManager manager;

    EligibleOffersImpl(BillingManager manager) {
        super(manager.inner().eligibleOffers());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<EligibleOfferListResult> listByBillingAccountIdAsync(String billingAccountId) {
        EligibleOffersInner client = this.inner();
        return client.listByBillingAccountIdAsync(billingAccountId)
        .map(new Func1<EligibleOfferListResultInner, EligibleOfferListResult>() {
            @Override
            public EligibleOfferListResult call(EligibleOfferListResultInner inner) {
                return new EligibleOfferListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EligibleOffer> getByIdAsync(String billingAccountId, String eligibleOfferId, String projectId) {
        EligibleOffersInner client = this.inner();
        return client.getByIdAsync(billingAccountId, eligibleOfferId, projectId)
        .map(new Func1<EligibleOfferInner, EligibleOffer>() {
            @Override
            public EligibleOffer call(EligibleOfferInner inner) {
                return new EligibleOfferImpl(inner, manager());
            }
        });
    }

}
