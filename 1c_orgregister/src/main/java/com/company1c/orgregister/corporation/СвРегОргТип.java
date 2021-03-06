
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о регистрирующем органе
 * 
 * <p>Java class for СвРегОргТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвРегОргТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="КодНО" type="{http://company1c.com/orgregister/corporation}СОНОТип" />
 *       &lt;attribute name="НаимНО">
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
@XmlType(name = "\u0421\u0432\u0420\u0435\u0433\u041e\u0440\u0433\u0422\u0438\u043f")
public class СвРегОргТип {

    @XmlAttribute(name = "\u041a\u043e\u0434\u041d\u041e")
    protected String кодНО;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041d\u041e")
    protected String наимНО;

    /**
     * Gets the value of the кодНО property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодНО() {
        return кодНО;
    }

    /**
     * Sets the value of the кодНО property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодНО(String value) {
        this.кодНО = value;
    }

    /**
     * Gets the value of the наимНО property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимНО() {
        return наимНО;
    }

    /**
     * Sets the value of the наимНО property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимНО(String value) {
        this.наимНО = value;
    }

}
