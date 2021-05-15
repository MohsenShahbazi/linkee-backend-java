package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.shop.Comments;
import ir.pt.diktee.resource.model.shopModels.CommentModel;
import org.mapstruct.Mapper;

/**
 * Created by Mohammadzadeh on 11/16/2019.
 */
@Mapper(componentModel = "spring")
public interface CommentsMapper extends BaseMapper<Comments, CommentModel> {
}
