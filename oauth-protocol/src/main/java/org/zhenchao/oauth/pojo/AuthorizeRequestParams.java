package org.zhenchao.oauth.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.zhenchao.oauth.token.pojo.TokenElement;

/**
 * 授权请求参数
 *
 * @author zhenchao.wang 2017-01-20 17:24
 * @version 1.0.0
 */
public class AuthorizeRequestParams implements RequestParams {

    private String responseType;

    private long clientId;

    private String redirectUri;

    private String scope;

    private String state;

    public AuthorizeRequestParams() {
    }

    public AuthorizeRequestParams(String responseType, long clientId, String redirectUri) {
        this.responseType = responseType;
        this.clientId = clientId;
        this.redirectUri = redirectUri;
    }

    public AuthorizeRequestParams(String responseType, long clientId, String redirectUri, String scope, String state) {
        this.responseType = responseType;
        this.clientId = clientId;
        this.redirectUri = redirectUri;
        this.scope = scope;
        this.state = state;
    }

    @Override
    public TokenElement toTokenElement() {
        // TODO 2017-08-08 18:11:05
        return null;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

    public String getResponseType() {
        return responseType;
    }

    public AuthorizeRequestParams setResponseType(String responseType) {
        this.responseType = responseType;
        return this;
    }

    public long getClientId() {
        return clientId;
    }

    public AuthorizeRequestParams setClientId(long clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public AuthorizeRequestParams setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public AuthorizeRequestParams setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getState() {
        return state;
    }

    public AuthorizeRequestParams setState(String state) {
        this.state = state;
        return this;
    }
}