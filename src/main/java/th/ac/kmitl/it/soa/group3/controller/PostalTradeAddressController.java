package th.ac.kmitl.it.soa.group3.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.PostalTradeAddressModel;

@RestController
@Api(value = "PostalTradeAddress", description = "Convert RequestBody into XML for PostalTradeAddress")
public class PostalTradeAddressController {

    @PostMapping("/address")
    @ApiOperation(value = "Convert PostalTradeAddress to XML")
    public PostalTradeAddressModel convertPostalAddress(
            @ApiParam(value = "PostalTradeAddress Object", required = true)
            @RequestBody PostalTradeAddressModel postalTradeAddressModel) {

        return postalTradeAddressModel;
    }

}
