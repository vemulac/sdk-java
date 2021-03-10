//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.27 at 04:18:12 PM GMT+05:30 
//


package net.authorize.api.contract.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherTaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nationalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="localTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="alternateTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="alternateTaxId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vatTaxRate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vatTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherTaxType", propOrder = {
    "nationalTaxAmount",
    "localTaxAmount",
    "alternateTaxAmount",
    "alternateTaxId",
    "vatTaxRate",
    "vatTaxAmount"
})
public class OtherTaxType {

    protected BigDecimal nationalTaxAmount;
    protected BigDecimal localTaxAmount;
    protected BigDecimal alternateTaxAmount;
    protected String alternateTaxId;
    protected BigDecimal vatTaxRate;
    protected BigDecimal vatTaxAmount;

    /**
     * Gets the value of the nationalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNationalTaxAmount() {
        return nationalTaxAmount;
    }

    /**
     * Sets the value of the nationalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNationalTaxAmount(BigDecimal value) {
        this.nationalTaxAmount = value;
    }

    /**
     * Gets the value of the localTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLocalTaxAmount() {
        return localTaxAmount;
    }

    /**
     * Sets the value of the localTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLocalTaxAmount(BigDecimal value) {
        this.localTaxAmount = value;
    }

    /**
     * Gets the value of the alternateTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlternateTaxAmount() {
        return alternateTaxAmount;
    }

    /**
     * Sets the value of the alternateTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlternateTaxAmount(BigDecimal value) {
        this.alternateTaxAmount = value;
    }

    /**
     * Gets the value of the alternateTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateTaxId() {
        return alternateTaxId;
    }

    /**
     * Sets the value of the alternateTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateTaxId(String value) {
        this.alternateTaxId = value;
    }

    /**
     * Gets the value of the vatTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatTaxRate() {
        return vatTaxRate;
    }

    /**
     * Sets the value of the vatTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatTaxRate(BigDecimal value) {
        this.vatTaxRate = value;
    }

    /**
     * Gets the value of the vatTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatTaxAmount() {
        return vatTaxAmount;
    }

    /**
     * Sets the value of the vatTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatTaxAmount(BigDecimal value) {
        this.vatTaxAmount = value;
    }

}
