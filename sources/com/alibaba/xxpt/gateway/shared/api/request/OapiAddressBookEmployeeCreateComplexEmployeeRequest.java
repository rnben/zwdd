package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiAddressBookEmployeeCreateComplexEmployeeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiAddressBookEmployeeCreateComplexEmployeeRequest.class */
public class OapiAddressBookEmployeeCreateComplexEmployeeRequest extends OapiRequest<OapiAddressBookEmployeeCreateComplexEmployeeResponse> {
    private Boolean sendActiveSms;
    private String govEmpJobLevelCode;
    private String posJobRankCode;
    private String govEmpBudgetedPostCode;
    private String govEmpPosPhoneNo;
    private String visibilityIndicatorCode;
    private String operator;
    private String employeeCode;
    private String govEmpCellPhoneShortNo;
    private String password;
    private String govEmpPosEmail;
    private String govEmpGenderCode;
    private String referId;
    private String govEmpRemarks;
    private String govEmpPosEmployeeRoleCode;
    private String govEmpPosJob;
    private String govEmpPosAddress;
    private String govEmpBirthDate;
    private Long order;
    private String employeeName;
    private String govEmpCellPhoneNo;
    private String govEmpHomeAddress;
    private String positionExtPropertiesStr;
    private Long orderInOrganization;
    private String areaCode;
    private String govEmpAvatar;
    private String govEmpIdentityCardNo;
    private String employeeExtPropertiesStr;
    private String organizationCode;
    private Long tenantId;
    private String namespace;
    private String referNamespace;
    private String govEmpPosFaxNo;
    private String account;
    private String govEmpPoliticalStatusCode;

    public final String getApiUrl() {
        return "/addressBook/employee/createComplexEmployee";
    }

    public void setSendActiveSms(Boolean sendActiveSms) {
        this.sendActiveSms = sendActiveSms;
    }

    public Boolean getSendActiveSms() {
        return this.sendActiveSms;
    }

    public void setGovEmpJobLevelCode(String govEmpJobLevelCode) {
        this.govEmpJobLevelCode = govEmpJobLevelCode;
    }

    public String getGovEmpJobLevelCode() {
        return this.govEmpJobLevelCode;
    }

    public void setPosJobRankCode(String posJobRankCode) {
        this.posJobRankCode = posJobRankCode;
    }

    public String getPosJobRankCode() {
        return this.posJobRankCode;
    }

    public void setGovEmpBudgetedPostCode(String govEmpBudgetedPostCode) {
        this.govEmpBudgetedPostCode = govEmpBudgetedPostCode;
    }

    public String getGovEmpBudgetedPostCode() {
        return this.govEmpBudgetedPostCode;
    }

    public void setGovEmpPosPhoneNo(String govEmpPosPhoneNo) {
        this.govEmpPosPhoneNo = govEmpPosPhoneNo;
    }

    public String getGovEmpPosPhoneNo() {
        return this.govEmpPosPhoneNo;
    }

    public void setVisibilityIndicatorCode(String visibilityIndicatorCode) {
        this.visibilityIndicatorCode = visibilityIndicatorCode;
    }

    public String getVisibilityIndicatorCode() {
        return this.visibilityIndicatorCode;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public void setGovEmpCellPhoneShortNo(String govEmpCellPhoneShortNo) {
        this.govEmpCellPhoneShortNo = govEmpCellPhoneShortNo;
    }

    public String getGovEmpCellPhoneShortNo() {
        return this.govEmpCellPhoneShortNo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setGovEmpPosEmail(String govEmpPosEmail) {
        this.govEmpPosEmail = govEmpPosEmail;
    }

    public String getGovEmpPosEmail() {
        return this.govEmpPosEmail;
    }

    public void setGovEmpGenderCode(String govEmpGenderCode) {
        this.govEmpGenderCode = govEmpGenderCode;
    }

    public String getGovEmpGenderCode() {
        return this.govEmpGenderCode;
    }

    public void setReferId(String referId) {
        this.referId = referId;
    }

    public String getReferId() {
        return this.referId;
    }

    public void setGovEmpRemarks(String govEmpRemarks) {
        this.govEmpRemarks = govEmpRemarks;
    }

    public String getGovEmpRemarks() {
        return this.govEmpRemarks;
    }

    public void setGovEmpPosEmployeeRoleCode(String govEmpPosEmployeeRoleCode) {
        this.govEmpPosEmployeeRoleCode = govEmpPosEmployeeRoleCode;
    }

    public String getGovEmpPosEmployeeRoleCode() {
        return this.govEmpPosEmployeeRoleCode;
    }

    public void setGovEmpPosJob(String govEmpPosJob) {
        this.govEmpPosJob = govEmpPosJob;
    }

    public String getGovEmpPosJob() {
        return this.govEmpPosJob;
    }

    public void setGovEmpPosAddress(String govEmpPosAddress) {
        this.govEmpPosAddress = govEmpPosAddress;
    }

    public String getGovEmpPosAddress() {
        return this.govEmpPosAddress;
    }

    public void setGovEmpBirthDate(String govEmpBirthDate) {
        this.govEmpBirthDate = govEmpBirthDate;
    }

    public String getGovEmpBirthDate() {
        return this.govEmpBirthDate;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public Long getOrder() {
        return this.order;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setGovEmpCellPhoneNo(String govEmpCellPhoneNo) {
        this.govEmpCellPhoneNo = govEmpCellPhoneNo;
    }

    public String getGovEmpCellPhoneNo() {
        return this.govEmpCellPhoneNo;
    }

    public void setGovEmpHomeAddress(String govEmpHomeAddress) {
        this.govEmpHomeAddress = govEmpHomeAddress;
    }

    public String getGovEmpHomeAddress() {
        return this.govEmpHomeAddress;
    }

    public void setPositionExtPropertiesStr(String positionExtPropertiesStr) {
        this.positionExtPropertiesStr = positionExtPropertiesStr;
    }

    public String getPositionExtPropertiesStr() {
        return this.positionExtPropertiesStr;
    }

    public void setOrderInOrganization(Long orderInOrganization) {
        this.orderInOrganization = orderInOrganization;
    }

    public Long getOrderInOrganization() {
        return this.orderInOrganization;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setGovEmpAvatar(String govEmpAvatar) {
        this.govEmpAvatar = govEmpAvatar;
    }

    public String getGovEmpAvatar() {
        return this.govEmpAvatar;
    }

    public void setGovEmpIdentityCardNo(String govEmpIdentityCardNo) {
        this.govEmpIdentityCardNo = govEmpIdentityCardNo;
    }

    public String getGovEmpIdentityCardNo() {
        return this.govEmpIdentityCardNo;
    }

    public void setEmployeeExtPropertiesStr(String employeeExtPropertiesStr) {
        this.employeeExtPropertiesStr = employeeExtPropertiesStr;
    }

    public String getEmployeeExtPropertiesStr() {
        return this.employeeExtPropertiesStr;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public void setReferNamespace(String referNamespace) {
        this.referNamespace = referNamespace;
    }

    public String getReferNamespace() {
        return this.referNamespace;
    }

    public void setGovEmpPosFaxNo(String govEmpPosFaxNo) {
        this.govEmpPosFaxNo = govEmpPosFaxNo;
    }

    public String getGovEmpPosFaxNo() {
        return this.govEmpPosFaxNo;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return this.account;
    }

    public void setGovEmpPoliticalStatusCode(String govEmpPoliticalStatusCode) {
        this.govEmpPoliticalStatusCode = govEmpPoliticalStatusCode;
    }

    public String getGovEmpPoliticalStatusCode() {
        return this.govEmpPoliticalStatusCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiAddressBookEmployeeCreateComplexEmployeeResponse> getResponseClass() {
        return OapiAddressBookEmployeeCreateComplexEmployeeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
