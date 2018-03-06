package th.ac.kmitl.it.soa.group3.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.soa.group3.model.exchangeddocument.ExchangedDocumentModel;
import th.ac.kmitl.it.soa.group3.wrapper.ExchangedDocWrapper;

@RestController
@Api(value = "ExchangedDocument XML", description = "This is ExchangedDocument XML")
public class ExchangedDocumentController {

    @PostMapping(value = "/exchangeddoc")
    @ApiOperation(value = "Convert ExchangedDocument to XML")
    public ExchangedDocumentModel exchangedDocumentXML(
            @ApiParam(value = "ExchangedDocument Object", required = true)
            @RequestBody ExchangedDocWrapper wrapper) {

        return wrapper.getModelClass();
    }
}
