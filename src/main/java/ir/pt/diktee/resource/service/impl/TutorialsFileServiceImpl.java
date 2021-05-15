package ir.pt.diktee.resource.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.TutorialsFile;
import ir.pt.diktee.resource.mapper.TutorialsFileMapper;
import ir.pt.diktee.resource.model.shopModels.TutorialFileModel;
import ir.pt.diktee.resource.service.TutorialsFileService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TutorialsFileServiceImpl extends BaseServiceImpl<TutorialsFile, TutorialFileModel, TutorialsFileMapper> implements TutorialsFileService {

}
