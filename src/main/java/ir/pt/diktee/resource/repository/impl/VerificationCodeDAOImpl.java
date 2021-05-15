package ir.pt.diktee.resource.repository.impl;

import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.entity.VerificationCode;
import ir.pt.diktee.resource.repository.VerificationCodeDAO;
import org.springframework.stereotype.Repository;

@Repository
public class VerificationCodeDAOImpl extends BaseDAOImpl<VerificationCode> implements VerificationCodeDAO {
}
