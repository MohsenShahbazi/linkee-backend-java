package ir.pt.diktee.resource.service.impl;

import ir.pt.common.bean.FilterCriteria;
import ir.pt.common.enums.FilterType;
import ir.pt.common.enums.PredicateType;
import ir.pt.core.BusinessException;
import ir.pt.core.Helper;
import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.VerificationCode;
import ir.pt.diktee.resource.mapper.VerificationCodeMapper;
import ir.pt.diktee.resource.model.acl.ForgetPasswordModel;
import ir.pt.diktee.resource.model.VerificationCodeModel;
import ir.pt.diktee.resource.service.EnumTypeService;
import ir.pt.diktee.resource.service.VerificationCodeService;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class VerificationCodeServiceImpl extends BaseServiceImpl<VerificationCode, VerificationCodeModel, VerificationCodeMapper> implements VerificationCodeService {

    @Autowired
    private EnumTypeService enumTypeService;

    @Override
    public VerificationCodeModel add(VerificationCodeModel model) throws BusinessException {
        HashMap filter = new HashMap();
        filter.put("type.id", model.getType().getId());
        filter.put("pc", model.getPc());
        List<VerificationCodeModel> allModels = super.getList(filter, null, null, Helper.createSort("id", false));
        Date dateNow = DateUtils.addMinutes(Calendar.getInstance().getTime(), -30);
        List<VerificationCodeModel> deleteModels = allModels.stream().filter(f -> f.getCreateDate().compareTo(dateNow) < 0).collect(Collectors.toList());
        List<VerificationCodeModel> newModels = allModels.stream().filter(f -> f.getCreateDate().compareTo(dateNow) >= 0).collect(Collectors.toList());
        if (deleteModels != null && deleteModels.size() > 0) {
            for (VerificationCodeModel tmp : deleteModels) {
                super.delete(tmp.getId());
            }
        }
        if (newModels != null && newModels.size() > 0) {
            VerificationCodeModel returnModel = newModels.get(0);
            for (int i = 1; i < newModels.size(); i++) {
                super.delete(newModels.get(i).getId());
            }
            return returnModel;
        }
        return super.add(model);
    }

    @Override
    public VerificationCodeModel check(ForgetPasswordModel model) throws BusinessException {
        List<FilterCriteria> filter = new ArrayList<>();
        filter.add(new FilterCriteria("type.id", enumTypeService.getByKey("verification_code_forget_password").getId(), FilterType.EQUAL, PredicateType.AND));
        filter.add(new FilterCriteria("pc", model.getPc(), FilterType.EQUAL, PredicateType.AND));
        filter.add(new FilterCriteria("code", model.getCode(), FilterType.EQUAL, PredicateType.AND));
        Date date=DateUtils.addMinutes(Calendar.getInstance().getTime(), -30);
        filter.add(new FilterCriteria("createDate",date , FilterType.GREATER_THAN_OR_EQUAL_TO, PredicateType.AND));
        return super.getFirst(filter);
    }
}
