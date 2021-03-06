
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetTopScorersResultXML;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetTopScorersByGroupIdResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTopScorersByGroupIdResult"
})
@XmlRootElement(name = "GetTopScorersByGroupIdResponse")
public class GetTopScorersByGroupIdResponse {

    @XmlElement(name = "GetTopScorersByGroupIdResult")
    protected GetTopScorersByGroupIdResponse.GetTopScorersByGroupIdResult getTopScorersByGroupIdResult;

    /**
     * Gets the value of the getTopScorersByGroupIdResult property.
     *
     * @return
     *     possible object is
     *     {@link GetTopScorersByGroupIdResponse.GetTopScorersByGroupIdResult }
     *
     */
    public GetTopScorersByGroupIdResponse.GetTopScorersByGroupIdResult getGetTopScorersByGroupIdResult() {
        return getTopScorersByGroupIdResult;
    }

    /**
     * Sets the value of the getTopScorersByGroupIdResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetTopScorersByGroupIdResponse.GetTopScorersByGroupIdResult }
     *
     */
    public void setGetTopScorersByGroupIdResult(GetTopScorersByGroupIdResponse.GetTopScorersByGroupIdResult value) {
        this.getTopScorersByGroupIdResult = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */

    public static class GetTopScorersByGroupIdResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetTopScorersResultXML.class)
        protected GetTopScorersResultXML content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link String }
         * 
         * 
         */
        public GetTopScorersResultXML getContent() {
            if (content == null) {
                content = new GetTopScorersResultXML();
            }
            return this.content;
        }

    }

}
