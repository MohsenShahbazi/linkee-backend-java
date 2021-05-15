package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.Menu;
import ir.pt.diktee.resource.model.MenuModel;
import org.mapstruct.Mapper;

/**
 * Created by Mohammadzadeh on 11/16/2019.
 */
@Mapper(componentModel = "spring")
public interface MenuMapper extends BaseMapper<Menu, MenuModel> {
}
