package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeUpdateGovEmployeeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeUpdateGovEmployeeRequest.class */
public class OapiMoziEmployeeUpdateGovEmployeeRequest extends OapiRequest<OapiMoziEmployeeUpdateGovEmployeeResponse> {
    private String govEmpJobLevelCode;
    private String govEmpBudgetedPostCode;
    private String operator;
    private String employeeCode;
    private String govEmpCellPhoneShortNo;
    private String govEmpGenderCode;
    private String govEmpRemarks;
    private String govEmpBirthDate;
    private String employeeName;
    private String govEmpCellPhoneNo;
    private String govEmpHomeAddress;
    private Long accountId;
    private String areaCode;
    private String govEmpAvatar;
    private String govEmpIdentityCardNo;
    private String employeeExtPropertiesStr;
    private Long tenantId;
    private String govEmpPoliticalStatusCode;

    public final String getApiUrl() {
        return "/mozi/employee/updateGovEmployee";
    }

    public void setGovEmpJobLevelCode(String govEmpJobLevelCode) {
        this.govEmpJobLevelCode = govEmpJobLevelCode;
    }

    public String getGovEmpJobLevelCode() {
        return this.govEmpJobLevelCode;
    }

    public void setGovEmpBudgetedPostCode(String govEmpBudgetedPostCode) {
        this.govEmpBudgetedPostCode = govEmpBudgetedPostCode;
    }

    public String getGovEmpBudgetedPostCode() {
        return this.govEmpBudgetedPostCode;
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

    public void setGovEmpGenderCode(String govEmpGenderCode) {
        this.govEmpGenderCode = govEmpGenderCode;
    }

    public String getGovEmpGenderCode() {
        return this.govEmpGenderCode;
    }

    public void setGovEmpRemarks(String govEmpRemarks) {
        this.govEmpRemarks = govEmpRemarks;
    }

    public String getGovEmpRemarks() {
        return this.govEmpRemarks;
    }

    public void setGovEmpBirthDate(String govEmpBirthDate) {
        this.govEmpBirthDate = govEmpBirthDate;
    }

    public String getGovEmpBirthDate() {
        return this.govEmpBirthDate;
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

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
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

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setGovEmpPoliticalStatusCode(String govEmpPoliticalStatusCode) {
        this.govEmpPoliticalStatusCode = govEmpPoliticalStatusCode;
    }

    public String getGovEmpPoliticalStatusCode() {
        return this.govEmpPoliticalStatusCode;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeeUpdateGovEmployeeResponse> getResponseClass() {
        return OapiMoziEmployeeUpdateGovEmployeeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
