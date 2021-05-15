package ir.pt.diktee.resource.service.impl;

import ir.pt.common.bean.FilterCriteria;
import ir.pt.common.enums.FilterType;
import ir.pt.common.enums.PredicateType;
import ir.pt.core.BusinessException;
import ir.pt.core.Helper;
import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.model.EnumTypeKeyValueModel;
import ir.pt.diktee.resource.model.EnumTypeModel;
import ir.pt.diktee.resource.model.FilterModel;
import ir.pt.diktee.resource.repository.EnumTypeDAO;
import ir.pt.diktee.resource.service.EnumTypeService;
import ir.pt.diktee.resource.entity.EnumType;
import ir.pt.diktee.resource.mapper.EnumTypeKeyValueMapper;
import ir.pt.diktee.resource.mapper.EnumTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by farshad on 13/11/2017.
 */
@Service
@Transactional
public class EnumTypeServiceImpl extends BaseServiceImpl<EnumType, EnumTypeModel, EnumTypeMapper> implements EnumTypeService {
    @Autowired
    private EnumTypeDAO dao;
//    @Autowired
//    private EnumTypeMapper mapper;
    @Autowired
    private EnumTypeKeyValueMapper keyValueMapper;

    @Override
    public EnumTypeModel getByKey(String key) throws BusinessException {
        return super.getFirst(Helper.createFilter("key", key));
    }

    @Override
    @Transactional(readOnly = true)
    public List<EnumTypeModel> list(FilterModel filter) throws BusinessException {
        return translator.convertToModels(dao.find((HashMap) filter.getFilter(), filter.getPage(), filter.getSize()));
    }

    @Override
    @Transactional(readOnly = true)
    public List<EnumTypeModel> getParents(FilterModel filter) throws BusinessException {
        List<FilterCriteria> filterCriteria = new ArrayList<>();
        filterCriteria.add(new FilterCriteria("parent", null, FilterType.IS_NULL, PredicateType.AND));
        return translator.convertToModels(dao.findByFilterCriteria(filterCriteria, filter.getPage(), filter.getSize()));
    }

    @Override
    @Transactional(readOnly = true)
    public List<EnumTypeKeyValueModel> getByIdsIn(List<Long> ids) throws BusinessException {
        return keyValueMapper.convertToModels(dao.findIdsIn(ids));
    }
}
