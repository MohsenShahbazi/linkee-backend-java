package ir.pt.diktee.resource.service;

import ir.pt.common.model.CredentialModel;
import ir.pt.core.BusinessException;
import ir.pt.diktee.resource.model.MenuModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by behrooz on 4/28/2016.
 */
@Service
public interface MenuService {
    List<MenuModel> getList(CredentialModel model) throws BusinessException;
}
