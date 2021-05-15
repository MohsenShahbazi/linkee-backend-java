package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.shop.TutorialsFile;
import ir.pt.diktee.resource.model.shopModels.TutorialFileModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TutorialsFileMapper extends BaseMapper<TutorialsFile, TutorialFileModel> {
}
