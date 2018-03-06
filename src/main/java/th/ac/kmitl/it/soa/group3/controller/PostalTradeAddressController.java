package th.ac.kmitl.it.soa.group3.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.PostalTradeAddressModel;

@RestController
@Api(value = "PostalTradeAddress", description = "End point for accepting Json and return as XML")
public class PostalTradeAddressController {

    @PostMapping("/address")
    public PostalTradeAddressModel convertPostalAddress(@RequestBody PostalTradeAddressModel postalTradeAddressModel) {
        return postalTradeAddressModel;
    }

}
