package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.shop.TutorialsImage;
import ir.pt.diktee.resource.model.shopModels.TutorialImageModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TutorialsImageMapper extends BaseMapper<TutorialsImage, TutorialImageModel> {
}
