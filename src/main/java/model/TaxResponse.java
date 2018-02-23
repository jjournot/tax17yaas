package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;
import java.util.Date;


@XmlRootElement(name = "taxResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class TaxResponse
{
	@XmlElement(name = "date")
	private Date date;

	@XmlElement(name = "amountWithoutTax")
	private BigDecimal amountWithoutTax;

	/** Total tax amount. */
	@XmlElement(name = "taxAmount")
	private BigDecimal taxAmount;

	@XmlElement(name = "total")
	private BigDecimal total;

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public BigDecimal getAmountWithoutTax()
	{
		return amountWithoutTax;
	}

	public void setAmountWithoutTax(BigDecimal amountWithoutTax)
	{
		this.amountWithoutTax = amountWithoutTax;
	}

	public BigDecimal getTaxAmount()
	{
		return taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount)
	{
		this.taxAmount = taxAmount;
	}

	public BigDecimal getTotal()
	{
		return total;
	}

	public void setTotal(BigDecimal total)
	{
		this.total = total;
	}
}