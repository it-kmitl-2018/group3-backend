package th.ac.kmitl.it.soa.group3.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;

@JacksonXmlRootElement(localName = "ex:rootElement")
public class ExampleXmlModel {

    @JacksonXmlProperty(localName = "ex:idHeader", isAttribute = true)
    private String id;

    @JacksonXmlProperty(localName = "ex:name")
    private String name;

    @JacksonXmlProperty(localName = "ex:desc")
    private String description;

    @JacksonXmlElementWrapper(localName = "ex:list")
    @JacksonXmlProperty(localName = "element")
    private ArrayList<String> listOfStrings;

    public ExampleXmlModel() {

    }

    public ExampleXmlModel(String id, String name, String description, ArrayList<String> listOfStrings) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.listOfStrings = listOfStrings;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getListOfStrings() {
        return listOfStrings;
    }

    public void setListOfStrings(ArrayList<String> listOfStrings) {
        this.listOfStrings = listOfStrings;
    }
}
