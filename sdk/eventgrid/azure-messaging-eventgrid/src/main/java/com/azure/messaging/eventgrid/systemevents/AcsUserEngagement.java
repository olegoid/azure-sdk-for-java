// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AcsUserEngagement. */
public final class AcsUserEngagement extends ExpandableStringEnum<AcsUserEngagement> {
    /** Static value view for AcsUserEngagement. */
    public static final AcsUserEngagement VIEW = fromString("view");

    /** Static value click for AcsUserEngagement. */
    public static final AcsUserEngagement CLICK = fromString("click");

    /**
     * Creates or finds a AcsUserEngagement from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AcsUserEngagement.
     */
    @JsonCreator
    public static AcsUserEngagement fromString(String name) {
        return fromString(name, AcsUserEngagement.class);
    }

    /**
     * Gets known AcsUserEngagement values.
     *
     * @return known AcsUserEngagement values.
     */
    public static Collection<AcsUserEngagement> values() {
        return values(AcsUserEngagement.class);
    }
}
