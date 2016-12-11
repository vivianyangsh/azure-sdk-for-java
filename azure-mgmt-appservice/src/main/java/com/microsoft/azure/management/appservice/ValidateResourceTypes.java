/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ValidateResourceTypes.
 */
public final class ValidateResourceTypes {
    /** Static value ServerFarm for ValidateResourceTypes. */
    public static final ValidateResourceTypes SERVER_FARM = new ValidateResourceTypes("ServerFarm");

    /** Static value Site for ValidateResourceTypes. */
    public static final ValidateResourceTypes SITE = new ValidateResourceTypes("Site");

    private String value;

    /**
     * Creates a custom value for ValidateResourceTypes.
     * @param value the custom value
     */
    public ValidateResourceTypes(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateResourceTypes)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ValidateResourceTypes rhs = (ValidateResourceTypes) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}