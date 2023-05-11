package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMoziTagUpdateTagResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;
import java.util.List;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMoziTagUpdateTagRequest.class */
public class OapiMoziTagUpdateTagRequest extends OapiRequest<OapiMoziTagUpdateTagResponse> {
    private String tagCode;
    private List<String> tagGroupCodes;
    private String tagName;
    private String operator;
    private Long tenantId;
    private String tagDescription;

    public final String getApiUrl() {
        return "/mozi/tag/updateTag";
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }

    public String getTagCode() {
        return this.tagCode;
    }

    public void setTagGroupCodes(List<String> tagGroupCodes) {
        this.tagGroupCodes = tagGroupCodes;
    }

    public List<String> getTagGroupCodes() {
        return this.tagGroupCodes;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

    public String getTagDescription() {
        return this.tagDescription;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMoziTagUpdateTagResponse> getResponseClass() {
        return OapiMoziTagUpdateTagResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
