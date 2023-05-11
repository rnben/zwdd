package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiTcV2OpenapiTaskCreateJsonResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiTcV2OpenapiTaskCreateJsonRequest.class */
public class OapiTcV2OpenapiTaskCreateJsonRequest extends OapiRequest<OapiTcV2OpenapiTaskCreateJsonResponse> {
    private String formValues;
    private Boolean isSendDynamicCard;
    private String actionBindingJson;
    private String subject;
    private String creatorId;
    private String templateCode;
    private String packageUuid;
    private String bizTaskId;
    private String mobileUrl;
    private String tag;
    private Boolean isSendWindowNotice;
    private String subTypeCode;
    private String creatorInfo;
    private String dueTime;
    private String priority;
    private String assigneeId;
    private List<String> dueNotifyTypeArr;
    private String url;
    private String assigneeInfo;
    private String acceleratorsJson;
    private Integer dueNotifyLevel;
    private String tenantId;
    private String businessType;
    private String category;
    private String remarks;

    public final String getApiUrl() {
        return "/tc/v2/openapi/task/create.json";
    }

    public void setFormValues(String formValues) {
        this.formValues = formValues;
    }

    public String getFormValues() {
        return this.formValues;
    }

    public void setIsSendDynamicCard(Boolean isSendDynamicCard) {
        this.isSendDynamicCard = isSendDynamicCard;
    }

    public Boolean getIsSendDynamicCard() {
        return this.isSendDynamicCard;
    }

    public void setActionBindingJson(String actionBindingJson) {
        this.actionBindingJson = actionBindingJson;
    }

    public String getActionBindingJson() {
        return this.actionBindingJson;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    public void setPackageUuid(String packageUuid) {
        this.packageUuid = packageUuid;
    }

    public String getPackageUuid() {
        return this.packageUuid;
    }

    public void setBizTaskId(String bizTaskId) {
        this.bizTaskId = bizTaskId;
    }

    public String getBizTaskId() {
        return this.bizTaskId;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    public String getMobileUrl() {
        return this.mobileUrl;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return this.tag;
    }

    public void setIsSendWindowNotice(Boolean isSendWindowNotice) {
        this.isSendWindowNotice = isSendWindowNotice;
    }

    public Boolean getIsSendWindowNotice() {
        return this.isSendWindowNotice;
    }

    public void setSubTypeCode(String subTypeCode) {
        this.subTypeCode = subTypeCode;
    }

    public String getSubTypeCode() {
        return this.subTypeCode;
    }

    public void setCreatorInfo(String creatorInfo) {
        this.creatorInfo = creatorInfo;
    }

    public String getCreatorInfo() {
        return this.creatorInfo;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public String getDueTime() {
        return this.dueTime;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    public String getAssigneeId() {
        return this.assigneeId;
    }

    public void setDueNotifyTypeArr(List<String> dueNotifyTypeArr) {
        this.dueNotifyTypeArr = dueNotifyTypeArr;
    }

    public List<String> getDueNotifyTypeArr() {
        return this.dueNotifyTypeArr;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAssigneeInfo(String assigneeInfo) {
        this.assigneeInfo = assigneeInfo;
    }

    public String getAssigneeInfo() {
        return this.assigneeInfo;
    }

    public void setAcceleratorsJson(String acceleratorsJson) {
        this.acceleratorsJson = acceleratorsJson;
    }

    public String getAcceleratorsJson() {
        return this.acceleratorsJson;
    }

    public void setDueNotifyLevel(Integer dueNotifyLevel) {
        this.dueNotifyLevel = dueNotifyLevel;
    }

    public Integer getDueNotifyLevel() {
        return this.dueNotifyLevel;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return this.businessType;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRemarks() {
        return this.remarks;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiTcV2OpenapiTaskCreateJsonResponse> getResponseClass() {
        return OapiTcV2OpenapiTaskCreateJsonResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
