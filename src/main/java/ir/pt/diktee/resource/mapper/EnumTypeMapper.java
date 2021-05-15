package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.model.EnumTypeModel;
import ir.pt.diktee.resource.entity.EnumType;
import org.mapstruct.Mapper;

/**
 * Created by Ahangari on 07/31/2017.
 */
@Mapper(componentModel = "spring")
public interface EnumTypeMapper extends BaseMapper<EnumType, EnumTypeModel> {
}
