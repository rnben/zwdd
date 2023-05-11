package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziOrganizationUpdateGovOrganizationResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziOrganizationUpdateGovOrganizationRequest.class */
public class OapiMoziOrganizationUpdateGovOrganizationRequest extends OapiRequest<OapiMoziOrganizationUpdateGovOrganizationResponse> {
    private String govDivisionCode;
    private Long displayOrder;
    private String govRemarks;
    private String operator;
    private String govAddress;
    private String govPostalCode;
    private String organizationExtPropertiesStr;
    private String govContactEmployeeCode;
    private String organizationName;
    private String govContactNumber;
    private String extOrgCode;
    private List<String> govResponsibleEmployeeCodes;
    private List<String> govBusinessStripCodes;
    private String govInstitutionCode;
    private String organizationType;
    private String govShortName;
    private String govInstitutionLevelCode;
    private String organizationCode;
    private Long tenantId;
    private String govUnifiedSocialCreditCode;
    private String govOtherName;

    public final String getApiUrl() {
        return "/mozi/organization/updateGovOrganization";
    }

    public void setGovDivisionCode(String govDivisionCode) {
        this.govDivisionCode = govDivisionCode;
    }

    public String getGovDivisionCode() {
        return this.govDivisionCode;
    }

    public void setDisplayOrder(Long displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Long getDisplayOrder() {
        return this.displayOrder;
    }

    public void setGovRemarks(String govRemarks) {
        this.govRemarks = govRemarks;
    }

    public String getGovRemarks() {
        return this.govRemarks;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setGovAddress(String govAddress) {
        this.govAddress = govAddress;
    }

    public String getGovAddress() {
        return this.govAddress;
    }

    public void setGovPostalCode(String govPostalCode) {
        this.govPostalCode = govPostalCode;
    }

    public String getGovPostalCode() {
        return this.govPostalCode;
    }

    public void setOrganizationExtPropertiesStr(String organizationExtPropertiesStr) {
        this.organizationExtPropertiesStr = organizationExtPropertiesStr;
    }

    public String getOrganizationExtPropertiesStr() {
        return this.organizationExtPropertiesStr;
    }

    public void setGovContactEmployeeCode(String govContactEmployeeCode) {
        this.govContactEmployeeCode = govContactEmployeeCode;
    }

    public String getGovContactEmployeeCode() {
        return this.govContactEmployeeCode;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationName() {
        return this.organizationName;
    }

    public void setGovContactNumber(String govContactNumber) {
        this.govContactNumber = govContactNumber;
    }

    public String getGovContactNumber() {
        return this.govContactNumber;
    }

    public void setExtOrgCode(String extOrgCode) {
        this.extOrgCode = extOrgCode;
    }

    public String getExtOrgCode() {
        return this.extOrgCode;
    }

    public void setGovResponsibleEmployeeCodes(List<String> govResponsibleEmployeeCodes) {
        this.govResponsibleEmployeeCodes = govResponsibleEmployeeCodes;
    }

    public List<String> getGovResponsibleEmployeeCodes() {
        return this.govResponsibleEmployeeCodes;
    }

    public void setGovBusinessStripCodes(List<String> govBusinessStripCodes) {
        this.govBusinessStripCodes = govBusinessStripCodes;
    }

    public List<String> getGovBusinessStripCodes() {
        return this.govBusinessStripCodes;
    }

    public void setGovInstitutionCode(String govInstitutionCode) {
        this.govInstitutionCode = govInstitutionCode;
    }

    public String getGovInstitutionCode() {
        return this.govInstitutionCode;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getOrganizationType() {
        return this.organizationType;
    }

    public void setGovShortName(String govShortName) {
        this.govShortName = govShortName;
    }

    public String getGovShortName() {
        return this.govShortName;
    }

    public void setGovInstitutionLevelCode(String govInstitutionLevelCode) {
        this.govInstitutionLevelCode = govInstitutionLevelCode;
    }

    public String getGovInstitutionLevelCode() {
        return this.govInstitutionLevelCode;
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

    public void setGovUnifiedSocialCreditCode(String govUnifiedSocialCreditCode) {
        this.govUnifiedSocialCreditCode = govUnifiedSocialCreditCode;
    }

    public String getGovUnifiedSocialCreditCode() {
        return this.govUnifiedSocialCreditCode;
    }

    public void setGovOtherName(String govOtherName) {
        this.govOtherName = govOtherName;
    }

    public String getGovOtherName() {
        return this.govOtherName;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziOrganizationUpdateGovOrganizationResponse> getResponseClass() {
        return OapiMoziOrganizationUpdateGovOrganizationResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
