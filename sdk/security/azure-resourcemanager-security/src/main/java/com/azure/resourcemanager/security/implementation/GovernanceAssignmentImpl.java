// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.GovernanceAssignmentInner;
import com.azure.resourcemanager.security.models.GovernanceAssignment;
import com.azure.resourcemanager.security.models.GovernanceAssignmentAdditionalData;
import com.azure.resourcemanager.security.models.GovernanceEmailNotification;
import com.azure.resourcemanager.security.models.RemediationEta;
import java.time.OffsetDateTime;

public final class GovernanceAssignmentImpl
    implements GovernanceAssignment, GovernanceAssignment.Definition, GovernanceAssignment.Update {
    private GovernanceAssignmentInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String owner() {
        return this.innerModel().owner();
    }

    public OffsetDateTime remediationDueDate() {
        return this.innerModel().remediationDueDate();
    }

    public RemediationEta remediationEta() {
        return this.innerModel().remediationEta();
    }

    public Boolean isGracePeriod() {
        return this.innerModel().isGracePeriod();
    }

    public GovernanceEmailNotification governanceEmailNotification() {
        return this.innerModel().governanceEmailNotification();
    }

    public GovernanceAssignmentAdditionalData additionalData() {
        return this.innerModel().additionalData();
    }

    public GovernanceAssignmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String assessmentName;

    private String assignmentKey;

    public GovernanceAssignmentImpl withExistingAssessment(String scope, String assessmentName) {
        this.scope = scope;
        this.assessmentName = assessmentName;
        return this;
    }

    public GovernanceAssignment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGovernanceAssignments()
                .createOrUpdateWithResponse(scope, assessmentName, assignmentKey, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public GovernanceAssignment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGovernanceAssignments()
                .createOrUpdateWithResponse(scope, assessmentName, assignmentKey, this.innerModel(), context)
                .getValue();
        return this;
    }

    GovernanceAssignmentImpl(String name, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = new GovernanceAssignmentInner();
        this.serviceManager = serviceManager;
        this.assignmentKey = name;
    }

    public GovernanceAssignmentImpl update() {
        return this;
    }

    public GovernanceAssignment apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGovernanceAssignments()
                .createOrUpdateWithResponse(scope, assessmentName, assignmentKey, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public GovernanceAssignment apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGovernanceAssignments()
                .createOrUpdateWithResponse(scope, assessmentName, assignmentKey, this.innerModel(), context)
                .getValue();
        return this;
    }

    GovernanceAssignmentImpl(
        GovernanceAssignmentInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.scope =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(),
                    "/{scope}/providers/Microsoft.Security/assessments/{assessmentName}/governanceAssignments/{assignmentKey}",
                    "scope");
        this.assessmentName =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(),
                    "/{scope}/providers/Microsoft.Security/assessments/{assessmentName}/governanceAssignments/{assignmentKey}",
                    "assessmentName");
        this.assignmentKey =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(),
                    "/{scope}/providers/Microsoft.Security/assessments/{assessmentName}/governanceAssignments/{assignmentKey}",
                    "assignmentKey");
    }

    public GovernanceAssignment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGovernanceAssignments()
                .getWithResponse(scope, assessmentName, assignmentKey, Context.NONE)
                .getValue();
        return this;
    }

    public GovernanceAssignment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGovernanceAssignments()
                .getWithResponse(scope, assessmentName, assignmentKey, context)
                .getValue();
        return this;
    }

    public GovernanceAssignmentImpl withOwner(String owner) {
        this.innerModel().withOwner(owner);
        return this;
    }

    public GovernanceAssignmentImpl withRemediationDueDate(OffsetDateTime remediationDueDate) {
        this.innerModel().withRemediationDueDate(remediationDueDate);
        return this;
    }

    public GovernanceAssignmentImpl withRemediationEta(RemediationEta remediationEta) {
        this.innerModel().withRemediationEta(remediationEta);
        return this;
    }

    public GovernanceAssignmentImpl withIsGracePeriod(Boolean isGracePeriod) {
        this.innerModel().withIsGracePeriod(isGracePeriod);
        return this;
    }

    public GovernanceAssignmentImpl withGovernanceEmailNotification(
        GovernanceEmailNotification governanceEmailNotification) {
        this.innerModel().withGovernanceEmailNotification(governanceEmailNotification);
        return this;
    }

    public GovernanceAssignmentImpl withAdditionalData(GovernanceAssignmentAdditionalData additionalData) {
        this.innerModel().withAdditionalData(additionalData);
        return this;
    }
}
