package ir.pt.diktee.resource.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.TutorialsImage;
import ir.pt.diktee.resource.mapper.TutorialsImageMapper;
import ir.pt.diktee.resource.model.shopModels.TutorialImageModel;
import ir.pt.diktee.resource.service.TutorialsImageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TutorialsImageServiceImpl extends BaseServiceImpl<TutorialsImage, TutorialImageModel, TutorialsImageMapper> implements TutorialsImageService {

}
