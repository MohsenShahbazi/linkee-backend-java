package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.AddressModels.StateModel;
import ir.pt.diktee.resource.model.shopModels.VoteModel;
import ir.pt.diktee.resource.service.StateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ahangari on 08/16/2017.
 */
@RestController
@RequestMapping(value = "/vote")
public class VoteController extends CustomBaseController<VoteModel>{

    public VoteController(StateService stateService, StateService stateService1) {
        super(stateService, stateService1);
    }
}
