package ir.pt.diktee.resource.repository;

import ir.pt.core.repository.BaseDAO;
import ir.pt.diktee.resource.entity.Menu;

import java.util.List;

/**
 * Created by Mohammadzadeh on 11/16/2019.
 */
public interface MenuDAO extends BaseDAO<Menu> {
    List<Menu> getParentList();
    List<Menu> getListChildren(Menu menu);
}
