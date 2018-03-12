/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.implementation;

import com.microsoft.azure.management.advisor.SkuName;
import com.microsoft.azure.management.advisor.SkuTier;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SKU of the cognitive services account.
 */
public class SkuInner {
    /**
     * Gets or sets the sku name. Required for account creation, optional for
     * update. Possible values include: 'F0', 'P0', 'P1', 'P2', 'S0', 'S1',
     * 'S2', 'S3', 'S4', 'S5', 'S6'.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /**
     * Gets the sku tier. This is based on the SKU name. Possible values
     * include: 'Free', 'Standard', 'Premium'.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private SkuTier tier;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the SkuInner object itself.
     */
    public SkuInner withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public SkuTier tier() {
        return this.tier;
    }

}
