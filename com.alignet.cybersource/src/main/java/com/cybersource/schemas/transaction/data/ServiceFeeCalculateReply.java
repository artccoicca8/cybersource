
package com.cybersource.schemas.transaction.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServiceFeeCalculateReply complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeeCalculateReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="amount" type="{urn:schemas-cybersource-com:transaction-data-1.159}amount" minOccurs="0"/>
 *         &lt;element name="requestDateTime" type="{urn:schemas-cybersource-com:transaction-data-1.159}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeeCalculateReply", propOrder = {
    "reasonCode",
    "amount",
    "requestDateTime"
})
public class ServiceFeeCalculateReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String amount;
    protected String requestDateTime;

    /**
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad requestDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDateTime() {
        return requestDateTime;
    }

    /**
     * Define el valor de la propiedad requestDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDateTime(String value) {
        this.requestDateTime = value;
    }

}
