package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.shopModels.CommentModel;
import ir.pt.diktee.resource.service.CommentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by behrooz on 4/28/2016.
 */
@RestController
@RequestMapping(value = {"/comment"})
public class CommentController extends CustomBaseController<CommentModel> {

    public CommentController(CommentService commentService, CommentService commentService1) {
        super(commentService, commentService1);
    }

/*    @Autowired
    CommentService commentService;

    @Override
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<JPresent<Boolean>> delete(@RequestParam(name = "id") Long id) {
        try {
            Boolean result = commentService.delete(id);
            return jPresent.getResponse(new JDataModel(result));
        } catch (BusinessException bx) {
            return jPresent.getResponse(bx);
        }
    }

    @Override
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public ResponseEntity<JPresent<Boolean>> get(@RequestParam(name = "id") Long id) {
        try {
            return jPresent.getResponse(commentService.get(id));
        } catch (BusinessException bx) {
            return jPresent.getResponse(bx);
        }
    }*/

}
