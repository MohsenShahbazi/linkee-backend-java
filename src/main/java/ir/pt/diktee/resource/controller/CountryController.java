package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.AddressModels.CountryModel;
import ir.pt.diktee.resource.model.AddressModels.StateModel;
import ir.pt.diktee.resource.service.CountryService;
import ir.pt.diktee.resource.service.StateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/country")
public class CountryController extends CustomBaseController<CountryModel>{

    public CountryController(CountryService countryService, CountryService countryService1) {
        super(countryService, countryService1);
    }
}
