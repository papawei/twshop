package com.tw.framework.swagger;

import com.tw.framework.swagger.properties.DocketProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

import com.tw.framework.swagger.properties.ApiInfoProperties;

@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties implements java.io.Serializable {

	private static final long serialVersionUID = 8471755917762607584L;
	private Boolean enable;
	private ApiInfoProperties apiInfo;
	private DocketProperties docket;

	public ApiInfoProperties getApiInfo() {
		return apiInfo;
	}

	public void setApiInfo(ApiInfoProperties apiInfo) {
		this.apiInfo = apiInfo;
	}

	public DocketProperties getDocket() {
		return docket;
	}

	public void setDocket(DocketProperties docket) {
		this.docket = docket;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	

}
