package com.xinma.message.service;

import com.aliyun.mns.client.CloudAccount;
import com.aliyun.mns.client.MNSClient;

public class AliMessageBaseTest {
	private String accessId = "jFGmMqmS8LZABfRB";
	private String accessKey = "PNnhx6TpPRdVbBE94xLGqX0zTrZrMM";

	private String mnsEndpoint = "http://1664047120873882.mns.cn-hangzhou.aliyuncs.com";

	protected MNSClient mnsClient = new CloudAccount(accessId, accessKey, mnsEndpoint).getMNSClient();

}
