package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeRehiredGovEmployeeResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeRehiredGovEmployeeRequest.class */
public class OapiMoziEmployeeRehiredGovEmployeeRequest extends OapiRequest<OapiMoziEmployeeRehiredGovEmployeeResponse> {
    private String govEmpPosPhoneNo;
    private String visibilityIndicatorCode;
    private Long orderInOrganization;
    private String operator;
    private String employeeCode;
    private String govEmpPosEmail;
    private String organizationCode;
    private Long tenantId;
    private String govEmpPosEmployeeRoleCode;
    private String govEmpPosFaxNo;
    private String govEmpPosJob;
    private String govEmpPosAddress;

    public final String getApiUrl() {
        return "/mozi/employee/rehiredGovEmployee";
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

    public void setOrderInOrganization(Long orderInOrganization) {
        this.orderInOrganization = orderInOrganization;
    }

    public Long getOrderInOrganization() {
        return this.orderInOrganization;
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

    public void setGovEmpPosEmail(String govEmpPosEmail) {
        this.govEmpPosEmail = govEmpPosEmail;
    }

    public String getGovEmpPosEmail() {
        return this.govEmpPosEmail;
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

    public void setGovEmpPosEmployeeRoleCode(String govEmpPosEmployeeRoleCode) {
        this.govEmpPosEmployeeRoleCode = govEmpPosEmployeeRoleCode;
    }

    public String getGovEmpPosEmployeeRoleCode() {
        return this.govEmpPosEmployeeRoleCode;
    }

    public void setGovEmpPosFaxNo(String govEmpPosFaxNo) {
        this.govEmpPosFaxNo = govEmpPosFaxNo;
    }

    public String getGovEmpPosFaxNo() {
        return this.govEmpPosFaxNo;
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

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeeRehiredGovEmployeeResponse> getResponseClass() {
        return OapiMoziEmployeeRehiredGovEmployeeResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
