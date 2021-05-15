package ir.pt.diktee.resource.controller;

import ir.pt.core.BusinessException;
import ir.pt.core.JPresent;
import ir.pt.diktee.resource.model.EnumTypeModel;
import ir.pt.diktee.resource.model.FilterModel;
import ir.pt.diktee.resource.service.EnumTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ahangari on 08/16/2017.
 */
@RestController
@RequestMapping(value = "/enumType")
public class EnumTypeController {

    @Autowired
    private JPresent jPresent;

    @Autowired
    private EnumTypeService service;

    @PostMapping(value = "/add")
    public ResponseEntity<JPresent> add(@RequestBody EnumTypeModel model) {
        try {
            return jPresent.getResponse(service.add(model));
        } catch (BusinessException e) {
            return jPresent.getResponse(e);
        }
    }

    @PostMapping(value = "/update")
    public ResponseEntity<JPresent> update(@RequestBody EnumTypeModel model) {
        try {
            return jPresent.getResponse(service.update(model));
        } catch (BusinessException e) {
            return jPresent.getResponse(e);
        }
    }

    @PostMapping(value = "/getParents")
    public ResponseEntity<JPresent> getParents(@RequestBody FilterModel filterModel) {
        try {
            return jPresent.getResponse(service.getParents(filterModel));
        } catch (BusinessException e) {
            return jPresent.getResponse(e);
        }
    }

    @PostMapping(value = "/getList")
    public ResponseEntity<JPresent> getList(@RequestBody FilterModel filterModel) {
        try {
            return jPresent.getResponse(service.list(filterModel));
        } catch (BusinessException e) {
            return jPresent.getResponse(e);
        }
    }

    @PostMapping(value = "/get")
    public ResponseEntity<JPresent> select(@RequestParam("id") Long id) {
        try {
            return jPresent.getResponse(service.get(id));
        } catch (BusinessException sx) {
            return jPresent.getResponse(sx);
        }
    }

    @PostMapping(value = "/delete")
    public ResponseEntity<JPresent<Boolean>> delete(@RequestParam("id") Long id) {
        try {
            return jPresent.getResponse(service.delete(id));
        } catch (BusinessException sx) {
            return jPresent.getResponse(sx);
        }
    }
}
