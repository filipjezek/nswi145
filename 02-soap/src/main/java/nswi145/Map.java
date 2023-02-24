package nswi145;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement()
@XmlType()
@XmlAccessorType(XmlAccessType.FIELD)
public class Map {
    public String name;
}
