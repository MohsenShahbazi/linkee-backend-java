package ir.pt.diktee.resource.service.impl;


import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.adress.City;
import ir.pt.diktee.resource.mapper.CityMapper;
import ir.pt.diktee.resource.model.AddressModels.CityModel;
import ir.pt.diktee.resource.service.CityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CityServiceImpl extends BaseServiceImpl<City, CityModel, CityMapper> implements CityService {

}
