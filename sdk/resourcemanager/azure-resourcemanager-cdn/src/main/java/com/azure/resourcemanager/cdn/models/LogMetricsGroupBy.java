// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LogMetricsGroupBy. */
public final class LogMetricsGroupBy extends ExpandableStringEnum<LogMetricsGroupBy> {
    /** Static value httpStatusCode for LogMetricsGroupBy. */
    public static final LogMetricsGroupBy HTTP_STATUS_CODE = fromString("httpStatusCode");

    /** Static value protocol for LogMetricsGroupBy. */
    public static final LogMetricsGroupBy PROTOCOL = fromString("protocol");

    /** Static value cacheStatus for LogMetricsGroupBy. */
    public static final LogMetricsGroupBy CACHE_STATUS = fromString("cacheStatus");

    /** Static value country for LogMetricsGroupBy. */
    public static final LogMetricsGroupBy COUNTRY = fromString("country");

    /** Static value customDomain for LogMetricsGroupBy. */
    public static final LogMetricsGroupBy CUSTOM_DOMAIN = fromString("customDomain");

    /**
     * Creates or finds a LogMetricsGroupBy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LogMetricsGroupBy.
     */
    @JsonCreator
    public static LogMetricsGroupBy fromString(String name) {
        return fromString(name, LogMetricsGroupBy.class);
    }

    /** @return known LogMetricsGroupBy values. */
    public static Collection<LogMetricsGroupBy> values() {
        return values(LogMetricsGroupBy.class);
    }
}