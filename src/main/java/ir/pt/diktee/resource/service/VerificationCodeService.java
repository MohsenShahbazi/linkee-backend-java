package ir.pt.diktee.resource.service;

import ir.pt.core.BusinessException;
import ir.pt.core.service.BaseService;
import ir.pt.diktee.resource.model.acl.ForgetPasswordModel;
import ir.pt.diktee.resource.model.VerificationCodeModel;

public interface VerificationCodeService extends BaseService<VerificationCodeModel> {
    VerificationCodeModel check(ForgetPasswordModel model) throws BusinessException;
}
