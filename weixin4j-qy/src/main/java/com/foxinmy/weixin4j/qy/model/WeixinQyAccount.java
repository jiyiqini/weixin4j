package com.foxinmy.weixin4j.qy.model;

import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.foxinmy.weixin4j.model.WeixinAccount;

/**
 * 微信企业号信息
 * 
 * @className WeixinQyAccount
 * @author jy
 * @date 2014年11月18日
 * @since JDK 1.7
 * @see <a href=
 *      "https://qy.weixin.qq.com/cgi-bin/home?lang=zh_CN&token=685923034#setting"
 *      >企业号设置</a>
 */
public class WeixinQyAccount extends WeixinAccount {

	private static final long serialVersionUID = 3689999353867189585L;

	/**
	 * 
	 * @param corpid
	 *            企业ID
	 * @param corpsecret
	 *            管理组的凭证密钥
	 * @param suiteId
	 *            应用套件的id
	 * @param suiteSecret
	 *            应用套件的secret
	 * @param providerSecret
	 *            第三方提供商secret(企业号登陆)
	 * @param chatSecret
	 *            消息服务secret(企业号聊天)
	 */
	@JSONCreator
	public WeixinQyAccount(@JSONField(name = "id") String corpid,
			@JSONField(name = "secret") String corpsecret,
			@JSONField(name = "suiteId") String suiteId,
			@JSONField(name = "suiteSecret") String suiteSecret,
			@JSONField(name = "providerSecret") String providerSecret,
			@JSONField(name = "chatSecret") String chatSecret) {
		super(corpid, corpsecret);
		this.suiteId = suiteId;
		this.suiteSecret = suiteSecret;
		this.providerSecret = providerSecret;
		this.chatSecret = chatSecret;
	}

	/**
	 * 应用套件id
	 */
	private String suiteId;
	/**
	 * 应用套件secret
	 */
	private String suiteSecret;
	/**
	 * 第三方提供商secret(企业号登陆)
	 */
	private String providerSecret;
	/**
	 * 消息服务secret(企业号聊天)
	 */
	private String chatSecret;

	public String getSuiteId() {
		return suiteId;
	}

	public String getSuiteSecret() {
		return suiteSecret;
	}

	public String getProviderSecret() {
		return providerSecret;
	}

	public String getChatSecret() {
		return chatSecret;
	}

	@Override
	public String toString() {
		return "WeixinQyAccount [" + super.toString() + ", suiteId=" + suiteId
				+ ", suiteSecret=" + suiteSecret + ", providerSecret="
				+ providerSecret + ",  chatSecret=" + chatSecret + "]";
	}
}
