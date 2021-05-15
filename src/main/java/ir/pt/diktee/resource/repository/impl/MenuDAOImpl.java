package ir.pt.diktee.resource.repository.impl;

import ir.pt.common.enums.DataStatus;
import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.entity.Menu;
import ir.pt.diktee.resource.repository.MenuDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Mohammadzadeh on 11/16/2019.
 */
@Repository
public class MenuDAOImpl extends BaseDAOImpl<Menu> implements MenuDAO {
    @Override
    public List<Menu> getParentList() {
        String hql = "select m from Menu m where (m.dataState=:dataState AND m.idref is null) order by m.prepriority,m.postpriority asc";
        List<Menu> menuList = getEm().createQuery(hql)
                .setParameter("dataState", DataStatus.Active.getStatus())
                .getResultList();
        return menuList;
    }
    @Override
    public List<Menu> getListChildren(Menu menu) {
        String hql = "select m from Menu m where (m.dataState=:dataState AND m.idref=:idref) order by m.prepriority,m.postpriority asc";
        List<Menu> menuList = getEm().createQuery(hql)
                .setParameter("dataState", DataStatus.Active.getStatus())
                .setParameter("idref", menu.getId())
                .getResultList();
        return menuList;
    }
}
