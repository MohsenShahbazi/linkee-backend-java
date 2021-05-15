package ir.pt.diktee.resource.service;

import ir.pt.core.BusinessException;
import ir.pt.core.service.BaseService;
import ir.pt.diktee.resource.model.EnumTypeKeyValueModel;
import ir.pt.diktee.resource.model.EnumTypeModel;
import ir.pt.diktee.resource.model.FilterModel;

import java.util.List;

/**
 * Created by farshad on 13/11/2017.
 */
public interface EnumTypeService extends BaseService<EnumTypeModel> {
    EnumTypeModel getByKey(String key) throws BusinessException;
    List<EnumTypeModel> list(FilterModel filterModel) throws BusinessException;
    List<EnumTypeModel> getParents(FilterModel filterModel) throws BusinessException;
    List<EnumTypeKeyValueModel> getByIdsIn(List<Long> ids) throws BusinessException;
}
