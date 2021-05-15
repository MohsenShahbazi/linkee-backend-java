package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.shopModels.CurrencyModel;
import ir.pt.diktee.resource.service.CountryService;
import ir.pt.diktee.resource.service.CurrencyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/currency")
public class CurrencyController extends CustomBaseController<CurrencyModel>{

    public CurrencyController(CurrencyService currencyService, CurrencyService currencyService1) {
        super(currencyService, currencyService1);
    }
}
