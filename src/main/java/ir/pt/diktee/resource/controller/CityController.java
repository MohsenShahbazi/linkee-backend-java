package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.AddressModels.CityModel;
import ir.pt.diktee.resource.service.CityService;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/city")
public class CityController extends CustomBaseController<CityModel> {
    public CityController(CityService cityService, CityService cityService1) {
        super(cityService, cityService1);
    }

/*    @Autowired
    CityService cityService;

    @Override
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<JPresent<Boolean>> delete(@RequestParam(name = "id") Long id) {
        try {
            Boolean result = cityService.delete(id);
            return jPresent.getResponse(new JDataModel(result));
        } catch (BusinessException bx) {
            return jPresent.getResponse(bx);
        }
    }

    @Override
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public ResponseEntity<JPresent<Boolean>> get(@RequestParam(name = "id") Long id) {
        try {
            return jPresent.getResponse(cityService.get(id));
        } catch (BusinessException bx) {
            return jPresent.getResponse(bx);
        }
    }*/
}
