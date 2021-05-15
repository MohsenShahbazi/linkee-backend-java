package ir.pt.diktee.resource.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.Currency;
import ir.pt.diktee.resource.entity.shop.Tutorial;
import ir.pt.diktee.resource.mapper.CurrencyMapper;
import ir.pt.diktee.resource.mapper.TutorialsMapper;
import ir.pt.diktee.resource.model.shopModels.CurrencyModel;
import ir.pt.diktee.resource.model.shopModels.TutorialsModel;
import ir.pt.diktee.resource.service.CurrencyService;
import ir.pt.diktee.resource.service.TutorialsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TutorialsServiceImpl extends BaseServiceImpl<Tutorial, TutorialsModel, TutorialsMapper> implements TutorialsService {

}
