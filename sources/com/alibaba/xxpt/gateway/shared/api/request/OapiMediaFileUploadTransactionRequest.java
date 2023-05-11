package com.alibaba.xxpt.gateway.shared.api.request;

import com.alibaba.xxpt.gateway.shared.api.response.OapiMediaFileUploadTransactionResponse;
import com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest;

/* loaded from: zwdd-sdk-java-1.2.0.jar:com/alibaba/xxpt/gateway/shared/api/request/OapiMediaFileUploadTransactionRequest.class */
public class OapiMediaFileUploadTransactionRequest extends OapiRequest<OapiMediaFileUploadTransactionResponse> {
    private String file_size;
    private String chunk_numbers;
    private String upload_id;

    public final String getApiUrl() {
        return "/media/file/upload/transaction";
    }

    public void setFile_size(String file_size) {
        this.file_size = file_size;
    }

    public String getFile_size() {
        return this.file_size;
    }

    public void setChunk_numbers(String chunk_numbers) {
        this.chunk_numbers = chunk_numbers;
    }

    public String getChunk_numbers() {
        return this.chunk_numbers;
    }

    public void setUpload_id(String upload_id) {
        this.upload_id = upload_id;
    }

    public String getUpload_id() {
        return this.upload_id;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public Class<OapiMediaFileUploadTransactionResponse> getResponseClass() {
        return OapiMediaFileUploadTransactionResponse.class;
    }

    @Override // com.alibaba.xxpt.gateway.shared.client.http.api.OapiRequest
    public boolean isSame() {
        return true;
    }
}
