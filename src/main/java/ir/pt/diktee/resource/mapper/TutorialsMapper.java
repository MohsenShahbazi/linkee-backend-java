package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.shop.Tutorial;
import ir.pt.diktee.resource.model.shopModels.TutorialsModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TutorialsMapper extends BaseMapper<Tutorial, TutorialsModel> {
}
