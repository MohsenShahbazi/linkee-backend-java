package ir.pt.diktee.resource.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.diktee.resource.model.EnumTypeModel;
import ir.pt.diktee.resource.entity.EnumType;

import java.util.List;


public interface EnumTypeDAO extends BaseDAO<EnumType> {
    List<EnumType> findList(EnumTypeModel model);
    List<EnumType> findIdsIn(List<Long> ids);
    List<EnumType> findKeysIn(List<String> keys);
}
