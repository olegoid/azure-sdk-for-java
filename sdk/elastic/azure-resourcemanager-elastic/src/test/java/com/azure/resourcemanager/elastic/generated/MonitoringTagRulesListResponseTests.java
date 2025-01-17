// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.fluent.models.MonitoringTagRulesInner;
import com.azure.resourcemanager.elastic.models.MonitoringTagRulesListResponse;
import com.azure.resourcemanager.elastic.models.MonitoringTagRulesProperties;
import com.azure.resourcemanager.elastic.models.ProvisioningState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonitoringTagRulesListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonitoringTagRulesListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Canceled\"},\"id\":\"jcmmxdcufufsrp\",\"name\":\"mzidnsezcxtb\",\"type\":\"sgfyccsnew\"},{\"properties\":{\"provisioningState\":\"Deleted\"},\"id\":\"iachbo\",\"name\":\"sflnrosfqp\",\"type\":\"eeh\"},{\"properties\":{\"provisioningState\":\"Updating\"},\"id\":\"qrimzinpv\",\"name\":\"wjdk\",\"type\":\"rsoodqxhcrmnoh\"}],\"nextLink\":\"ckwhds\"}")
                .toObject(MonitoringTagRulesListResponse.class);
        Assertions.assertEquals(ProvisioningState.CANCELED, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals("ckwhds", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonitoringTagRulesListResponse model =
            new MonitoringTagRulesListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new MonitoringTagRulesInner()
                                .withProperties(
                                    new MonitoringTagRulesProperties()
                                        .withProvisioningState(ProvisioningState.CANCELED)),
                            new MonitoringTagRulesInner()
                                .withProperties(
                                    new MonitoringTagRulesProperties()
                                        .withProvisioningState(ProvisioningState.DELETED)),
                            new MonitoringTagRulesInner()
                                .withProperties(
                                    new MonitoringTagRulesProperties()
                                        .withProvisioningState(ProvisioningState.UPDATING))))
                .withNextLink("ckwhds");
        model = BinaryData.fromObject(model).toObject(MonitoringTagRulesListResponse.class);
        Assertions.assertEquals(ProvisioningState.CANCELED, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals("ckwhds", model.nextLink());
    }
}
