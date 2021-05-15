package ir.pt.diktee.resource.repository.impl;


import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.entity.adress.Country;
import ir.pt.diktee.resource.entity.adress.State;
import ir.pt.diktee.resource.repository.CountryDAO;
import ir.pt.diktee.resource.repository.StateDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CountryDAOImpl extends BaseDAOImpl<Country> implements CountryDAO {

    @Override
    public State findByName(String name, Integer Id) {
        List<State> result = new ArrayList<>();
        if (name != null)
            if (!name.isEmpty()) {
                if (Id < 0) {
                    result = getEm().createQuery("SELECT s FROM State s WHERE s.name = :name AND s.dataState = 0").setParameter("name", name).getResultList();
                } else {
                    result = getEm().createQuery("SELECT s FROM State s WHERE s.name = :name AND s.id <> :id AND s.dataState = 0").setParameter("name", name).setParameter("id", Id).getResultList();
                }
                if (result.size() > 0)
                    return result.get(0);
            }
        return null;
    }

    @Override
    public State findByCode(Integer code, Integer Id) {
        List<State> result = new ArrayList<>();
        if (Id < 0) {
            result = getEm().createQuery("SELECT s FROM State s WHERE s.code = :code AND s.dataState = 0").setParameter("code", code).getResultList();
        } else {
            result = getEm().createQuery("SELECT s FROM State s WHERE s.code = :code AND s.id <> :id AND s.dataState = 0").setParameter("code", code).setParameter("id", Id).getResultList();
        }
        if (result.size() > 0)
            return result.get(0);

        return null;
    }

    @Override
    public String getNameByCsabCode(String csabCode) {
        if (csabCode.length() == 3)
            csabCode = "0" + csabCode;
        List<String> resultList = getEm().createNativeQuery("select b.NAME FROM\n" +
                "(SELECT\n" +
                " case\n" +
                " WHEN \"LENGTH\"(STATE.CODE)=3 THEN \"CONCAT\"(0,\"SUBSTR\"(STATE.CODE,0,1))\n" +
                " WHEN \"LENGTH\"(STATE.CODE)=4 THEN \"SUBSTR\"(STATE.CODE,0,2)\n" +
                " END as csabCode,\"NAME\"\n" +
                " FROM STATE ) b WHERE  b.CSABCODE=" + csabCode.substring(0, 2)).getResultList();
        if (!resultList.isEmpty())
            return resultList.get(0);
        else
            return null;
    }
}
