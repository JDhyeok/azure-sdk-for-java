// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Properties required to create or update an endpoint. */
@JsonFlatten
@Fluent
public class AfdEndpointUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdEndpointUpdateParameters.class);

    /*
     * Endpoint tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Send and receive timeout on forwarding request to the origin. When
     * timeout is reached, the request fails and returns.
     */
    @JsonProperty(value = "properties.originResponseTimeoutSeconds")
    private Integer originResponseTimeoutSeconds;

    /*
     * Whether to enable use of this rule. Permitted values are 'Enabled' or
     * 'Disabled'
     */
    @JsonProperty(value = "properties.enabledState")
    private EnabledState enabledState;

    /**
     * Get the tags property: Endpoint tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Endpoint tags.
     *
     * @param tags the tags value to set.
     * @return the AfdEndpointUpdateParameters object itself.
     */
    public AfdEndpointUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the originResponseTimeoutSeconds property: Send and receive timeout on forwarding request to the origin. When
     * timeout is reached, the request fails and returns.
     *
     * @return the originResponseTimeoutSeconds value.
     */
    public Integer originResponseTimeoutSeconds() {
        return this.originResponseTimeoutSeconds;
    }

    /**
     * Set the originResponseTimeoutSeconds property: Send and receive timeout on forwarding request to the origin. When
     * timeout is reached, the request fails and returns.
     *
     * @param originResponseTimeoutSeconds the originResponseTimeoutSeconds value to set.
     * @return the AfdEndpointUpdateParameters object itself.
     */
    public AfdEndpointUpdateParameters withOriginResponseTimeoutSeconds(Integer originResponseTimeoutSeconds) {
        this.originResponseTimeoutSeconds = originResponseTimeoutSeconds;
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @return the enabledState value.
     */
    public EnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @param enabledState the enabledState value to set.
     * @return the AfdEndpointUpdateParameters object itself.
     */
    public AfdEndpointUpdateParameters withEnabledState(EnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}