//package ir.pt.diktee.resource.service.impl;
//
//import ir.pt.common.model.CredentialModel;
//import ir.pt.common.model.MenuActeeModel;
//import ir.pt.core.BusinessException;
//import ir.pt.diktee.resource.mapper.MenuMapper;
//import ir.pt.diktee.resource.config.Dashboard;
//import ir.pt.diktee.resource.entity.Menu;
//import ir.pt.diktee.resource.model.MenuModel;
//import ir.pt.diktee.resource.repository.MenuDAO;
//import ir.pt.diktee.resource.service.MenuService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@Service
//public class MenuServiceImpl implements MenuService {
//    @Autowired
//    Dashboard dashboard;
//    @Autowired
//    MenuDAO menuDAO;
//    @Autowired
//    MenuMapper menuMapper;
//
//    @Override
//    public List<MenuModel> getList(CredentialModel model) throws BusinessException {
//        List<Menu> menuList = menuDAO.getParentList();
//        HashMap<String, MenuActeeModel> menuActeeModelHashMap = new HashMap<String, MenuActeeModel>();
//
//
//
//        List<MenuModel> menuFinalList = new ArrayList<>();
//        MenuModel tmpMenu = new MenuModel();
//
///*        for (Menu menu : menuList) {//iterate through root menu items
//            if (menuActeeModelHashMap.containsKey(menu.getModifyUser())) {
//                List<Menu> childrenList = (menuDAO.getListChildren(menu));
//                List<MenuModel> childrenModelList = new ArrayList<>();
//                for (Menu childMenu : childrenList) {
//                    if (menuActeeModelHashMap.containsKey(childMenu.getModifyUser())) {
//                        MenuModel c = menuMapper.convertToModel(childrenList.get(childrenList.indexOf(childMenu)));
//                        c.equals(getChildren(childMenu, menuActeeModelHashMap));
//                        childrenModelList.add(c);
//                    }
//                }
//                MenuModel m = menuMapper.convertToModel(menuList.get(menuList.indexOf(menu)));
//                m.equals(childrenModelList);
//                menuFinalList.add(m);
//            }
//        }*/
//        return menuFinalList;
//    }
//
//    private List<MenuModel> getChildren(Menu menuItem, HashMap<String, MenuActeeModel> authorizedMenuList) {
//        List<Menu> childrenList = (menuDAO.getListChildren(menuItem));
//        List<MenuModel> childrenModelList = new ArrayList<>();
//        if (childrenList.size() == 0 || childrenList == null) {
//            return null;
//        }
//        /*for (Menu childMenu : childrenList) {
//            if (authorizedMenuList.containsKey(childMenu.equals())) {
//                MenuModel menuModel = menuMapper.convertToModel(childMenu);
//                menuModel.equals(getChildren(childMenu, authorizedMenuList));
//                childrenModelList.add(menuModel);
//            }
//        }*/
//        return childrenModelList;
//    }
//}
