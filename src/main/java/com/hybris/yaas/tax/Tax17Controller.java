package com.hybris.yaas.tax;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Test service which calculate 17% of taxes on a given amount
 */
@RestController
public class Tax17Controller
{
	private final Logger LOG = LoggerFactory.getLogger(Tax17Controller.class);

	public static final BigDecimal ONE_HUNDRED = new BigDecimal(100);
	public static final BigDecimal SEVENTEEN = new BigDecimal(17);

	/**
	 * Test service which calculate 17% of taxes on a given amount
	 *
	 * @param amount
	 * 		the amount from which we get the 17%
	 * @return the tax amount
	 */
	@RequestMapping("/tax17/{amount}")
	public ResponseEntity<BigDecimal> calculateTax17(@PathVariable BigDecimal amount)
	{
		LOG.debug("======= Calculate the amount of tax for the following amount : " + amount);
		return new ResponseEntity<BigDecimal>(amount.divide(ONE_HUNDRED).multiply(SEVENTEEN), HttpStatus.OK);
	}
}

