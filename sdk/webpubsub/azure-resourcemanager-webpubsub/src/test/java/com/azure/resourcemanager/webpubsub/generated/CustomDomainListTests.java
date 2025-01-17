// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.CustomDomainInner;
import com.azure.resourcemanager.webpubsub.models.CustomDomainList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CustomDomainListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomDomainList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"domainName\":\"cg\"},\"id\":\"lwn\",\"name\":\"nhjdauw\",\"type\":\"vylwzbtdhxuj\"},{\"properties\":{\"provisioningState\":\"Creating\",\"domainName\":\"pow\"},\"id\":\"wpr\",\"name\":\"qlveualupjmkh\",\"type\":\"xobbcswsrt\"}],\"nextLink\":\"iplrbpbewtghfgb\"}")
                .toObject(CustomDomainList.class);
        Assertions.assertEquals("cg", model.value().get(0).domainName());
        Assertions.assertEquals("iplrbpbewtghfgb", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomDomainList model =
            new CustomDomainList()
                .withValue(
                    Arrays
                        .asList(
                            new CustomDomainInner().withDomainName("cg"),
                            new CustomDomainInner().withDomainName("pow")))
                .withNextLink("iplrbpbewtghfgb");
        model = BinaryData.fromObject(model).toObject(CustomDomainList.class);
        Assertions.assertEquals("cg", model.value().get(0).domainName());
        Assertions.assertEquals("iplrbpbewtghfgb", model.nextLink());
    }
}
