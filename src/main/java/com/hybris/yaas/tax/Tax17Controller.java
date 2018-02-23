package com.hybris.yaas.tax;

import java.math.BigDecimal;
import java.util.Date;

import model.TaxRequest;
import model.TaxResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	 * @param taxRequest
	 * 		the taxRequest object from which we get the 17%
	 * @return the tax amount
	 */
	@RequestMapping(value = "/tax17", method = RequestMethod.POST)
	public ResponseEntity<TaxResponse> calculateTax17(@RequestBody TaxRequest taxRequest)
	{
		LOG.debug("======= Calculate the amount of tax for the following amount : " + taxRequest.getAmount());
		TaxResponse response = new TaxResponse();
		response.setAmountWithoutTax(taxRequest.getAmount());
		response.setTaxAmount(taxRequest.getAmount().divide(ONE_HUNDRED).multiply(SEVENTEEN));
		response.setDate(new Date());
		response.setTotal(response.getAmountWithoutTax().add(response.getTaxAmount()));
		return new ResponseEntity<TaxResponse>(response, HttpStatus.OK);
	}
}

