package ir.pt.diktee.resource.repository.impl;

import ir.pt.common.enums.DataStatus;
import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.model.EnumTypeModel;
import ir.pt.diktee.resource.entity.EnumType;
import ir.pt.diktee.resource.repository.EnumTypeDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by farshad on 13/11/2017.
 */
@Repository
public class EnumTypeDAOImpl extends BaseDAOImpl<EnumType> implements EnumTypeDAO {

    @Override
    public List<EnumType> findList(EnumTypeModel model) {
        StringBuilder queryString = new StringBuilder("FROM EnumType WHERE dataState=:dataState ");

        if (model.getId() != null) {
            queryString.append("AND (id=:id) ");
        }

        Query query = getEm().createQuery(queryString.toString());
        query.setParameter("dataState", DataStatus.Active.getStatus());

        if (model.getId() != null) {
            query.setParameter("id", model.getId());
        }

        List<EnumType> enumTypes = query.getResultList();
        return enumTypes;
    }

    @Override
    public List<EnumType> findIdsIn(List<Long> ids) {
        String queryString = "FROM EnumType  WHERE dataState=:dataState AND id in (:ids)";

        Query query = getEm().createQuery(queryString.toString());
        query.setParameter("dataState", DataStatus.Active.getStatus());
        query.setParameter("ids", ids);

        return query.getResultList();
    }

    @Override
    public List<EnumType> findKeysIn(List<String> keys) {
        String queryString = "FROM EnumType WHERE dataState=:dataState AND key in (:keys)";

        Query query = getEm().createQuery(queryString.toString());
        query.setParameter("dataState", DataStatus.Active.getStatus());
        query.setParameter("keys", keys);

        return query.getResultList();
    }
}
