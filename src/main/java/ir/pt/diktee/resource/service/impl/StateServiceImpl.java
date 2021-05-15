package ir.pt.diktee.resource.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.adress.State;
import ir.pt.diktee.resource.mapper.StateMapper;
import ir.pt.diktee.resource.service.StateService;
import ir.pt.diktee.resource.model.AddressModels.StateModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StateServiceImpl extends BaseServiceImpl<State, StateModel, StateMapper> implements StateService {

}
