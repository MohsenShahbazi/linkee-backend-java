package ir.pt.diktee.resource.repository.impl;

import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.repository.CityDAO;
import ir.pt.diktee.resource.entity.adress.City;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CityDAOImpl extends BaseDAOImpl<City> implements CityDAO {

    @Override
    public City findByName(String name, Integer stateID, Integer Id) {
        List<City> result = new ArrayList<>();
        if (name != null)
            if (!name.isEmpty()) {
                if (Id < 0) {
                    result = getEm().createQuery("SELECT c FROM City c WHERE name=:name AND state.id=:stateID AND dataState=0").setParameter("name", name).setParameter("stateID", stateID).getResultList();
                } else {
                    result = getEm().createQuery("SELECT c FROM City c WHERE name=:name AND state.id=:stateID AND id<>:id AND dataState=0").setParameter("name", name).setParameter("stateID", stateID).setParameter("id", Id).getResultList();
                }
                if (result.size() > 0)
                    return result.get(0);
            }
        return null;
    }

    @Override
    public City findByCode(Integer code, Integer Id) {
        List<City> result = new ArrayList<>();
        if (Id < 0) {
            result = getEm().createQuery("SELECT c FROM City c WHERE code=:code AND dataState=0").setParameter("code", code).getResultList();
        } else {
            result = getEm().createQuery("SELECT c FROM City c WHERE code=:code AND id<>:id AND dataState=0").setParameter("code", code).setParameter("id", Id).getResultList();
        }
        if (result.size() > 0)
            return result.get(0);

        return null;
    }
}
