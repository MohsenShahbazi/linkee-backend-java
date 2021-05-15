package ir.pt.diktee.resource.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.diktee.resource.entity.adress.State;

public interface StateDAO extends BaseDAO<State> {
    State findByCode(Integer code, Integer Id);

    State findByName(String name, Integer Id);

    String getNameByCsabCode(String csabCode);

}
