//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.27 at 04:18:12 PM GMT+05:30 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authorizationIndicatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorizationIndicatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorizationIndicator" type="{AnetApi/xml/v1/schema/AnetApiSchema.xsd}authIndicatorEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorizationIndicatorType", propOrder = {
    "authorizationIndicator"
})
public class AuthorizationIndicatorType {

    @XmlSchemaType(name = "string")
    protected AuthIndicatorEnum authorizationIndicator;

    /**
     * Gets the value of the authorizationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link AuthIndicatorEnum }
     *     
     */
    public AuthIndicatorEnum getAuthorizationIndicator() {
        return authorizationIndicator;
    }

    /**
     * Sets the value of the authorizationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthIndicatorEnum }
     *     
     */
    public void setAuthorizationIndicator(AuthIndicatorEnum value) {
        this.authorizationIndicator = value;
    }

}
