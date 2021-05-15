package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.shopModels.TutorialsModel;
import ir.pt.diktee.resource.service.TutorialsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = {"/tutorials"})
public class TutorialsController extends CustomBaseController<TutorialsModel> {

    public TutorialsController(TutorialsService tutorialsService, TutorialsService tutorialsService1) {
        super(tutorialsService, tutorialsService1);
    }

}
