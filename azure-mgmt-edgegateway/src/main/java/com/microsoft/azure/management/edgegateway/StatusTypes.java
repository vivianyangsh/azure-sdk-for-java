/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StatusTypes.
 */
public final class StatusTypes extends ExpandableStringEnum<StatusTypes> {
    /** Static value Untracked for StatusTypes. */
    public static final StatusTypes UNTRACKED = fromString("Untracked");

    /** Static value AwaitingFulfilment for StatusTypes. */
    public static final StatusTypes AWAITING_FULFILMENT = fromString("AwaitingFulfilment");

    /** Static value AwaitingPreparation for StatusTypes. */
    public static final StatusTypes AWAITING_PREPARATION = fromString("AwaitingPreparation");

    /** Static value AwaitingShipment for StatusTypes. */
    public static final StatusTypes AWAITING_SHIPMENT = fromString("AwaitingShipment");

    /** Static value Shipped for StatusTypes. */
    public static final StatusTypes SHIPPED = fromString("Shipped");

    /** Static value Arriving for StatusTypes. */
    public static final StatusTypes ARRIVING = fromString("Arriving");

    /** Static value Delivered for StatusTypes. */
    public static final StatusTypes DELIVERED = fromString("Delivered");

    /** Static value ReplacementRequested for StatusTypes. */
    public static final StatusTypes REPLACEMENT_REQUESTED = fromString("ReplacementRequested");

    /** Static value LostDevice for StatusTypes. */
    public static final StatusTypes LOST_DEVICE = fromString("LostDevice");

    /** Static value Declined for StatusTypes. */
    public static final StatusTypes DECLINED = fromString("Declined");

    /** Static value ReturnInitiated for StatusTypes. */
    public static final StatusTypes RETURN_INITIATED = fromString("ReturnInitiated");

    /** Static value AwaitingReturnShipment for StatusTypes. */
    public static final StatusTypes AWAITING_RETURN_SHIPMENT = fromString("AwaitingReturnShipment");

    /** Static value ShippedBack for StatusTypes. */
    public static final StatusTypes SHIPPED_BACK = fromString("ShippedBack");

    /** Static value CollectedAtMicrosoft for StatusTypes. */
    public static final StatusTypes COLLECTED_AT_MICROSOFT = fromString("CollectedAtMicrosoft");

    /**
     * Creates or finds a StatusTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding StatusTypes
     */
    @JsonCreator
    public static StatusTypes fromString(String name) {
        return fromString(name, StatusTypes.class);
    }

    /**
     * @return known StatusTypes values
     */
    public static Collection<StatusTypes> values() {
        return values(StatusTypes.class);
    }
}
