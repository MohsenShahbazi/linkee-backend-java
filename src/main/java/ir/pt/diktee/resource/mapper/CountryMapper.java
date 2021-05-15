package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.adress.Country;
import ir.pt.diktee.resource.entity.adress.State;
import ir.pt.diktee.resource.model.AddressModels.CountryModel;
import ir.pt.diktee.resource.model.AddressModels.StateModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapper extends BaseMapper<Country, CountryModel> {
}
