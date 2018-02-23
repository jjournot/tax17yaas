package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;
import java.util.Date;


@XmlRootElement(name = "taxRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class TaxRequest
{
	@XmlElement(name = "date")
	private Date date;

	@XmlElement(name = "amount")
	private BigDecimal amount;

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

}
