package ir.pt.diktee.resource.service;

import ir.pt.diktee.resource.model.gsm.JConMsgReqListModel;
import ir.pt.diktee.resource.model.gsm.JMsgReqListModel;
import ir.pt.diktee.resource.model.gsm.JMsgResModel;
import ir.pt.diktee.resource.model.gsm.JsonResponseListT;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public interface GsmService {
    Future<JsonResponseListT<JMsgResModel>> sendMessage(JMsgReqListModel jMsgReqListModel);
    Future<JsonResponseListT<JMsgResModel>> sendConMessage(JConMsgReqListModel jConMsgReqListModel);
//    JsonResponseListT<JContactModel> sendContactList(JContactListModel jContactListModel);
//    JsonResponseListT<JMsgResModel> sendGlobalMessage(JMsgReqListModel jMsgReqListModel);
//    JsonResponseListT<JHMsgRes> getSendMessageList() throws BusinessException;
}
