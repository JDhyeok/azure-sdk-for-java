// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.remoterendering.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RemoteRenderingsGetConversionHeaders model. */
@Fluent
public final class RemoteRenderingsGetConversionHeaders {
    /*
     * The Retry-After property.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /*
     * The MS-CV property.
     */
    @JsonProperty(value = "MS-CV")
    private String msCV;

    /**
     * Get the retryAfter property: The Retry-After property.
     *
     * @return the retryAfter value.
     */
    public Integer getRetryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the retryAfter property: The Retry-After property.
     *
     * @param retryAfter the retryAfter value to set.
     * @return the RemoteRenderingsGetConversionHeaders object itself.
     */
    public RemoteRenderingsGetConversionHeaders setRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

    /**
     * Get the msCV property: The MS-CV property.
     *
     * @return the msCV value.
     */
    public String getMsCV() {
        return this.msCV;
    }

    /**
     * Set the msCV property: The MS-CV property.
     *
     * @param msCV the msCV value to set.
     * @return the RemoteRenderingsGetConversionHeaders object itself.
     */
    public RemoteRenderingsGetConversionHeaders setMsCV(String msCV) {
        this.msCV = msCV;
        return this;
    }
}