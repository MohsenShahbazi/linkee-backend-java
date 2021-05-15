package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.shop.TutorialsCategory;
import ir.pt.diktee.resource.model.shopModels.TutorialsCategoryModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TutorialsCaegoryMapper extends BaseMapper<TutorialsCategory, TutorialsCategoryModel> {
}
