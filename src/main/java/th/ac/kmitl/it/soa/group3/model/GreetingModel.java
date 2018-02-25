package th.ac.kmitl.it.soa.group3.model;

import io.swagger.annotations.ApiModelProperty;

public class GreetingModel {

    public final int id;
    @ApiModelProperty(notes = "This is example text of msg")
    public final String msg;

    public GreetingModel(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

}
