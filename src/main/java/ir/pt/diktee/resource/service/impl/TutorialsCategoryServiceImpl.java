package ir.pt.diktee.resource.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.TutorialsCategory;
import ir.pt.diktee.resource.mapper.TutorialsCaegoryMapper;
import ir.pt.diktee.resource.model.shopModels.TutorialsCategoryModel;
import ir.pt.diktee.resource.service.TutorialsCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TutorialsCategoryServiceImpl extends BaseServiceImpl<TutorialsCategory, TutorialsCategoryModel, TutorialsCaegoryMapper> implements TutorialsCategoryService {

}
