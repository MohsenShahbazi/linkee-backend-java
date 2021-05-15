package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.shopModels.TutorialsCategoryModel;
import ir.pt.diktee.resource.service.TutorialsCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = {"/tutorialCategory"})
public class TutorialCategoryController extends CustomBaseController<TutorialsCategoryModel> {

    public TutorialCategoryController(TutorialsCategoryService tutorialsCategoryService, TutorialsCategoryService tutorialsCategoryService1) {
        super(tutorialsCategoryService, tutorialsCategoryService1);
    }

}
