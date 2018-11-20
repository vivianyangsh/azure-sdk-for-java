/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for UsagePermissionType.
 */
public final class UsagePermissionType extends ExpandableStringEnum<UsagePermissionType> {
    /** Static value Default for UsagePermissionType. */
    public static final UsagePermissionType DEFAULT = fromString("Default");

    /** Static value Deny for UsagePermissionType. */
    public static final UsagePermissionType DENY = fromString("Deny");

    /** Static value Allow for UsagePermissionType. */
    public static final UsagePermissionType ALLOW = fromString("Allow");

    /**
     * Creates or finds a UsagePermissionType from its string representation.
     * @param name a name to look for
     * @return the corresponding UsagePermissionType
     */
    @JsonCreator
    public static UsagePermissionType fromString(String name) {
        return fromString(name, UsagePermissionType.class);
    }

    /**
     * @return known UsagePermissionType values
     */
    public static Collection<UsagePermissionType> values() {
        return values(UsagePermissionType.class);
    }
}
