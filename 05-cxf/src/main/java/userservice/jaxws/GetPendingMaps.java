
package userservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.5.5
 * Mon Mar 20 16:45:29 CET 2023
 * Generated source version: 3.5.5
 */

@XmlRootElement(name = "getPendingMaps", namespace = "http://userservice/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPendingMaps", namespace = "http://userservice/")

public class GetPendingMaps {

    @XmlElement(name = "arg0")
    private int arg0;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

}
