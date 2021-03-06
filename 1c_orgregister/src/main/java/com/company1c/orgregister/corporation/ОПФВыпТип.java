
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об организационно-правовой форме
 * 
 * <p>Java class for ОПФВыпТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ОПФВыпТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="СпрОПФ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КодОПФ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ПолнНаимОПФ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041e\u041f\u0424\u0412\u044b\u043f\u0422\u0438\u043f")
public class ОПФВыпТип {

    @XmlAttribute(name = "\u0421\u043f\u0440\u041e\u041f\u0424")
    protected String спрОПФ;
    @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u041f\u0424")
    protected String кодОПФ;
    @XmlAttribute(name = "\u041f\u043e\u043b\u043d\u041d\u0430\u0438\u043c\u041e\u041f\u0424")
    protected String полнНаимОПФ;

    /**
     * Gets the value of the спрОПФ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСпрОПФ() {
        return спрОПФ;
    }

    /**
     * Sets the value of the спрОПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСпрОПФ(String value) {
        this.спрОПФ = value;
    }

    /**
     * Gets the value of the кодОПФ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодОПФ() {
        return кодОПФ;
    }

    /**
     * Sets the value of the кодОПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодОПФ(String value) {
        this.кодОПФ = value;
    }

    /**
     * Gets the value of the полнНаимОПФ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПолнНаимОПФ() {
        return полнНаимОПФ;
    }

    /**
     * Sets the value of the полнНаимОПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПолнНаимОПФ(String value) {
        this.полнНаимОПФ = value;
    }

}
