package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.user.UserModel;
import ir.pt.diktee.resource.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController extends CustomBaseController<UserModel> {

    public UserController(UserService userService, UserService userService1) {
        super(userService, userService1);
    }
}
