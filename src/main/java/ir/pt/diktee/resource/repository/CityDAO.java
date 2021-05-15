package ir.pt.diktee.resource.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.diktee.resource.entity.adress.City;

public interface CityDAO extends BaseDAO<City> {
    City findByCode(Integer code, Integer Id);

    City findByName(String name, Integer provinceId, Integer Id);
}
