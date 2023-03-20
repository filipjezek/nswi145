
package nswi145;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UploadMapResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadMapResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MapUploadResult" type="{http://nswi145/}mapUploadResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadMapResponse", propOrder = {
    "mapUploadResult"
})
public class UploadMapResponse {

    @XmlElement(name = "MapUploadResult")
    protected MapUploadResult mapUploadResult;

    /**
     * Gets the value of the mapUploadResult property.
     * 
     * @return
     *     possible object is
     *     {@link MapUploadResult }
     *     
     */
    public MapUploadResult getMapUploadResult() {
        return mapUploadResult;
    }

    /**
     * Sets the value of the mapUploadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapUploadResult }
     *     
     */
    public void setMapUploadResult(MapUploadResult value) {
        this.mapUploadResult = value;
    }

}
