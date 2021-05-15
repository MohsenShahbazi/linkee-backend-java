package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.VerificationCode;
import ir.pt.diktee.resource.model.VerificationCodeModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VerificationCodeMapper extends BaseMapper<VerificationCode, VerificationCodeModel> {
}
