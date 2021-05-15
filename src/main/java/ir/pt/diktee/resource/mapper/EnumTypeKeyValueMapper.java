package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.EnumType;
import ir.pt.diktee.resource.model.EnumTypeKeyValueModel;
import org.mapstruct.Mapper;

/**
 * Created by Ahangari on 07/31/2017.
 */
@Mapper(componentModel = "spring")
public interface EnumTypeKeyValueMapper extends BaseMapper<EnumType, EnumTypeKeyValueModel> {
}
