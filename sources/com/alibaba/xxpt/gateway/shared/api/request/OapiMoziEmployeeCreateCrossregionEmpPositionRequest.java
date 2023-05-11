package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziEmployeeCreateCrossregionEmpPositionResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziEmployeeCreateCrossregionEmpPositionRequest.class */
public class OapiMoziEmployeeCreateCrossregionEmpPositionRequest extends OapiRequest<OapiMoziEmployeeCreateCrossregionEmpPositionResponse> {
    private String posJobRankCode;
    private String govEmpPosPhoneNo;
    private String visibilityIndicatorCode;
    private Boolean mainJob;
    private String employeeCode;
    private String govEmpPosEmail;
    private String govEmpPosEmployeeRoleCode;
    private String nameSpace;
    private String govEmpPosJob;
    private String govEmpPosAddress;
    private Long order;
    private String creator;
    private String govEmpCellPhoneNo;
    private String positionExtPropertiesStr;
    private String govJobAttributesCode;
    private Long orderInOrganization;
    private String areaCode;
    private String organizationCode;
    private String name;
    private Long tenantId;
    private String govEmpPosFaxNo;

    public final String getApiUrl() {
        return "/mozi/employee/createCrossregionEmpPosition";
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

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public String getNameSpace() {
        return this.nameSpace;
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

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setGovEmpCellPhoneNo(String govEmpCellPhoneNo) {
        this.govEmpCellPhoneNo = govEmpCellPhoneNo;
    }

    public String getGovEmpCellPhoneNo() {
        return this.govEmpCellPhoneNo;
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

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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
    public Class<OapiMoziEmployeeCreateCrossregionEmpPositionResponse> getResponseClass() {
        return OapiMoziEmployeeCreateCrossregionEmpPositionResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
