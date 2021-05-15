package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.adress.Country;
import ir.pt.diktee.resource.entity.shop.Currency;
import ir.pt.diktee.resource.model.AddressModels.CountryModel;
import ir.pt.diktee.resource.model.shopModels.CurrencyModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CurrencyMapper extends BaseMapper<Currency, CurrencyModel> {
}
