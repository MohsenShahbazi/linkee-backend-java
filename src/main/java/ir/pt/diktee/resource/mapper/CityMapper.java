package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.model.AddressModels.CityModel;
import ir.pt.diktee.resource.entity.adress.City;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface CityMapper extends BaseMapper<City, CityModel> {
}
