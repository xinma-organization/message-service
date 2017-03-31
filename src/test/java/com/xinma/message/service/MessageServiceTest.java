package com.xinma.message.service;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xinma.message.service.enums.PortalDownloadMessageType;
import com.xinma.message.service.impl.aliyun.MessageServiceImpl;

public class MessageServiceTest extends AliMessageBaseTest {

	private MessageService messageService = new MessageServiceImpl(mnsClient);

	private ObjectMapper mapper = new ObjectMapper();

	@Test
	public void batchDeleteMessage() {
		// throw new RuntimeException("Test not implemented");
	}

	@Test
	public void batchPutMessage() {
		// throw new RuntimeException("Test not implemented");
	}

	@Test
	public void deleteMessage() {
		// throw new RuntimeException("Test not implemented");
	}

	@Test
	public void popMessage() throws JsonProcessingException {
		QueueMessageTO message = messageService.popMessage("backend-portal", false);
		System.out.println(mapper.writeValueAsString(message));
	}

	@Test
	public void putMessage() throws JsonProcessingException {
		QueueMessageTO queueMessage = new QueueMessageTO();
		ProductTO product = new ProductTO();
		product.setCode("product-001");
		product.setEseId(1);
		product.setEseName("测试企业");
		product.setInfo("");
		product.setName("测试产品");
		product.setOid(1);
		product.setPrice(1f);

		queueMessage.setMessageBody(mapper.writeValueAsString(product));
		queueMessage.setMessageType(PortalDownloadMessageType.ProductTO.getValue());

		messageService.putMessage("backend-portal", queueMessage);
		// throw new RuntimeException("Test not implemented");
	}
}
