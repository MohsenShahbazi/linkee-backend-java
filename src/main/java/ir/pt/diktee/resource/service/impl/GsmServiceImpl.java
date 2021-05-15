//package ir.pt.diktee.resource.service.impl;
//
//import ir.pt.diktee.resource.model.gsm.*;
//import ir.pt.diktee.resource.service.GsmService;
//import ir.pt.diktee.resource.config.Dashboard;
//import ir.pt.diktee.resource.model.gsm.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Service;
//
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.Future;
//
//@Service
//public class GsmServiceImpl implements GsmService {
//    @Autowired
//    private Dashboard dashboard;
//
//    @Async
//    @Override
//    public Future<JsonResponseListT<JMsgResModel>> sendMessage(JMsgReqListModel jMsgReqListModel) {
//        String url = dashboard.GSM_URL + "sendMessageList";
//        JsonRequestListT<JMsgReqModel> jMsgReqModelJsonRequestListT = new JsonRequestListT<>();
//        jMsgReqModelJsonRequestListT.setMessage("");
//        jMsgReqModelJsonRequestListT.setUserName(dashboard.GSM_USER);
//        jMsgReqModelJsonRequestListT.setPassword(dashboard.GSM_PASSWORD);
//        jMsgReqModelJsonRequestListT.setData(jMsgReqListModel.getjMsgReqModelList());
//        return null;
//    }
//
//    @Async
//    @Override
//    public Future<JsonResponseListT<JMsgResModel>> sendConMessage(JConMsgReqListModel jConMsgReqListModel) {
//        String url = dashboard.GSM_URL + "sendConMessageList";
//        JsonRequestListT<JConMsgReqModel> jMsgReqModelJsonRequestListT = new JsonRequestListT<>();
//        jMsgReqModelJsonRequestListT.setMessage("");
//        jMsgReqModelJsonRequestListT.setUserName(dashboard.GSM_USER);
//        jMsgReqModelJsonRequestListT.setPassword(dashboard.GSM_PASSWORD);
//        jMsgReqModelJsonRequestListT.setData(jConMsgReqListModel.getjConMsgReqModelList());
//        return null;
//    }
//}
