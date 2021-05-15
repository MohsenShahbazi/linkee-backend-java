package ir.pt.diktee.resource.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.adress.Country;
import ir.pt.diktee.resource.entity.adress.State;
import ir.pt.diktee.resource.mapper.CountryMapper;
import ir.pt.diktee.resource.mapper.StateMapper;
import ir.pt.diktee.resource.model.AddressModels.CountryModel;
import ir.pt.diktee.resource.model.AddressModels.StateModel;
import ir.pt.diktee.resource.service.CountryService;
import ir.pt.diktee.resource.service.StateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CountryServiceImpl extends BaseServiceImpl<Country, CountryModel, CountryMapper> implements CountryService {

}
