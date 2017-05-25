package com.hybris.yaas.tax;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Tax17Application.class)
@WebIntegrationTest("server.port=8080")
public class SanityTest
{
	private final BigDecimal AMOUNT_ONE_HUNDRED = new BigDecimal(100);
	private final BigDecimal TAX_SEVENTEEN = new BigDecimal(17);
	private final String SERVICE_URL = "http://localhost:8080/tax17/";

	@Test(timeout = 120000)
	public void getResponseFromCall() throws Exception
	{
		final TestRestTemplate restTemplate = new TestRestTemplate();
		BigDecimal taxAmount = restTemplate.getForObject(SERVICE_URL + AMOUNT_ONE_HUNDRED, BigDecimal.class);
		assertEquals(taxAmount, TAX_SEVENTEEN);
	}
}
