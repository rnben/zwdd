package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeUpdateGovEmployeePositionResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeUpdateGovEmployeePositionRequest.class */
public class OapiMoziEmployeeUpdateGovEmployeePositionRequest extends OapiRequest<OapiMoziEmployeeUpdateGovEmployeePositionResponse> {
    private String posJobRankCode;
    private String govEmpPosPhoneNo;
    private String visibilityIndicatorCode;
    private Boolean mainJob;
    private String operator;
    private String employeeCode;
    private String govEmpPosEmail;
    private String govEmpPosEmployeeRoleCode;
    private String govEmpPosJob;
    private String govEmpPosAddress;
    private Long order;
    private String positionExtPropertiesStr;
    private String govJobAttributesCode;
    private Long orderInOrganization;
    private String organizationCode;
    private Long tenantId;
    private String govEmpPosFaxNo;

    public final String getApiUrl() {
        return "/mozi/employee/updateGovEmployeePosition";
    }

    public void setPosJobRankCode(String posJobRankCode) {
        this.posJobRankCode = posJobRankCode;
    }

    public String getPosJobRankCode() {
        return this.posJobRankCode;
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

    public void setMainJob(Boolean mainJob) {
        this.mainJob = mainJob;
    }

    public Boolean getMainJob() {
        return this.mainJob;
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

    public void setOrder(Long order) {
        this.order = order;
    }

    public Long getOrder() {
        return this.order;
    }

    public void setPositionExtPropertiesStr(String positionExtPropertiesStr) {
        this.positionExtPropertiesStr = positionExtPropertiesStr;
    }

    public String getPositionExtPropertiesStr() {
        return this.positionExtPropertiesStr;
    }

    public void setGovJobAttributesCode(String govJobAttributesCode) {
        this.govJobAttributesCode = govJobAttributesCode;
    }

    public String getGovJobAttributesCode() {
        return this.govJobAttributesCode;
    }

    public void setOrderInOrganization(Long orderInOrganization) {
        this.orderInOrganization = orderInOrganization;
    }

    public Long getOrderInOrganization() {
        return this.orderInOrganization;
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

    public void setGovEmpPosFaxNo(String govEmpPosFaxNo) {
        this.govEmpPosFaxNo = govEmpPosFaxNo;
    }

    public String getGovEmpPosFaxNo() {
        return this.govEmpPosFaxNo;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziEmployeeUpdateGovEmployeePositionResponse> getResponseClass() {
        return OapiMoziEmployeeUpdateGovEmployeePositionResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
