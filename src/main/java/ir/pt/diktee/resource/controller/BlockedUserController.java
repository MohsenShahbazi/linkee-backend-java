package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.user.BlockedUserModel;
import ir.pt.diktee.resource.model.user.UserModel;
import ir.pt.diktee.resource.service.BlockedUserService;
import ir.pt.diktee.resource.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/blockedUser")
public class BlockedUserController extends CustomBaseController<BlockedUserModel> {

    public BlockedUserController(BlockedUserService blockedUserService, BlockedUserService blockedUserService1) {
        super(blockedUserService, blockedUserService1);
    }
}
