package ir.pt.diktee.resource.controller;
import ir.pt.diktee.resource.service.StateService;
import ir.pt.diktee.resource.model.AddressModels.StateModel;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ahangari on 08/16/2017.
 */
@RestController
@RequestMapping(value = "/state")
public class StateController extends CustomBaseController<StateModel>{

    public StateController(StateService stateService, StateService stateService1) {
        super(stateService, stateService1);
    }
}
