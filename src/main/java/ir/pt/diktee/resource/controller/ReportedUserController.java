package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.user.BlockedUserModel;
import ir.pt.diktee.resource.model.user.ReportedUserModel;
import ir.pt.diktee.resource.service.BlockedUserService;
import ir.pt.diktee.resource.service.ReportedUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/reportedUser")
public class ReportedUserController extends CustomBaseController<ReportedUserModel> {

    public ReportedUserController(ReportedUserService reportedUserService, ReportedUserService reportedUserService1) {
        super(reportedUserService, reportedUserService1);
    }
}
