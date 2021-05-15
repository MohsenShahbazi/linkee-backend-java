//package ir.pt.diktee.resource.controller;
//
//import ir.pt.common.model.CredentialModel;
//import ir.pt.core.JPresent;
//import ir.pt.diktee.resource.service.MenuService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * Created by behrooz on 4/28/2016.
// */
//@RestController
//@RequestMapping(value = {"/menu"})
//public class MenuController {
//    @Autowired
//    MenuService menuService;
//    @Autowired
//    JPresent jpresent;
//
//    @RequestMapping(value = "/getList", method = RequestMethod.POST)
//    public ResponseEntity getList(@RequestBody CredentialModel credentialModel) {
//        try {
//            List list = menuService.getList(credentialModel);
//            return jpresent.getResponse(list, list.size());
//        } catch (Exception ex) {
//            return jpresent.getResponse(ex);
//        }
//    }
//
//
//}
