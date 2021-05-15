package ir.pt.diktee.resource.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.adress.Country;
import ir.pt.diktee.resource.entity.shop.Currency;
import ir.pt.diktee.resource.mapper.CountryMapper;
import ir.pt.diktee.resource.mapper.CurrencyMapper;
import ir.pt.diktee.resource.model.AddressModels.CountryModel;
import ir.pt.diktee.resource.model.shopModels.CurrencyModel;
import ir.pt.diktee.resource.service.CountryService;
import ir.pt.diktee.resource.service.CurrencyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CurrencyServiceImpl extends BaseServiceImpl<Currency, CurrencyModel, CurrencyMapper> implements CurrencyService {

}
