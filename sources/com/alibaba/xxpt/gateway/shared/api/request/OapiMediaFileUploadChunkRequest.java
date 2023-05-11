package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMediaFileUploadChunkResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMediaFileUploadChunkRequest.class */
public class OapiMediaFileUploadChunkRequest extends OapiRequest<OapiMediaFileUploadChunkResponse> {
    private String access_token;
    private String upload_id;
    private String chunk_sequence;
    private String chunk_numbers;

    public final String getApiUrl() {
        return "/media/file/upload/chunk";
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAccess_token() {
        return this.access_token;
    }

    public void setUpload_id(String upload_id) {
        this.upload_id = upload_id;
    }

    public String getUpload_id() {
        return this.upload_id;
    }

    public void setChunk_sequence(String chunk_sequence) {
        this.chunk_sequence = chunk_sequence;
    }

    public String getChunk_sequence() {
        return this.chunk_sequence;
    }

    public void setChunk_numbers(String chunk_numbers) {
        this.chunk_numbers = chunk_numbers;
    }

    public String getChunk_numbers() {
        return this.chunk_numbers;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMediaFileUploadChunkResponse> getResponseClass() {
        return OapiMediaFileUploadChunkResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return false;
    }
}
