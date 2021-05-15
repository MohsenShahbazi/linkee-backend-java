package ir.pt.diktee.resource.controller;

import ir.pt.common.model.SearchModel;
import ir.pt.core.Helper;
import ir.pt.core.JPresent;
import ir.pt.core.controller.BaseController;
import ir.pt.core.model.JDataModel;
import ir.pt.core.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class CustomBaseController<M> extends BaseController<M> {

    public CustomBaseController(BaseService service, BaseService service1) {
        super(service);
        this.service = service1;
    }

    @Autowired
    protected JPresent jPresent;
    protected BaseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity add(@RequestBody @Validated M model) {
        try {
            return jPresent.getResponse(service.add(model));
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity update(@RequestBody @Validated M model) {
        try {
            return jPresent.getResponse(service.update(model));
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ResponseEntity delete(@PathVariable Long id) {
        try {
            return jPresent.getResponse(service.delete(id));
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }

    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.POST)
    public ResponseEntity get(@PathVariable Long id) {
        try {
            return jPresent.getResponse(service.get(id));
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }

    }

    @RequestMapping(value = "/getList", method = RequestMethod.POST)
    public ResponseEntity getList() {
        try {
            return jPresent.getResponse(service.getList());
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }
    }

    @RequestMapping(value = "/getListWeb/{page}/{size}", method = RequestMethod.POST)
    public ResponseEntity getListPagingWeb(@PathVariable Integer page,
                                        @PathVariable Integer size) {
        try {
            return jPresent.getResponse(service.getList(page, size));
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }
    }

    @RequestMapping(value = "/getListWithSearch", method = RequestMethod.POST)
    public ResponseEntity getListWithSearch(@RequestBody SearchModel search) {
        try {
            return jPresent.getResponse(
                    service.getListByFilterCriteria(
                            Helper.createFilterSearch(search.getFilter()),
                            search.getPage(), search.getSize(),
                            Helper.createFilterSort(search.getSorting()))
            );
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }
    }

    @RequestMapping(value = "/getWithUser/{id}", method = RequestMethod.POST)
    public ResponseEntity getWithUser(@PathVariable Long id) {
        try {
            return jPresent.getResponse(service.getWithUser(id, service.getCurrentUsername()));
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }
    }

    @RequestMapping(value = "/getListWithUser", method = RequestMethod.POST)
    public ResponseEntity getListWithUser() {
        try {
            return jPresent.getResponse(
                    service.getListWithUser(service.getCurrentUsername()));
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }
    }

    @RequestMapping(value = "/getListWithUser/{page}/{size}", method = RequestMethod.POST)
    public ResponseEntity getListPagingWithUser(@PathVariable Integer page,
                                                @PathVariable Integer size) {
        try {
            return jPresent.getResponse(service.getListWithUser(service.getCurrentUsername(), page, size));
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }
    }

    @RequestMapping(value = "/getListWithUserSearch", method = RequestMethod.POST)
    public ResponseEntity getListWithUserSearch(@RequestBody SearchModel search) {
        try {
            return jPresent.getResponse(service.getListByFilterCriteriaWithUser(
                    service.getCurrentUsername(),
                    Helper.createFilterSearch(search.getFilter()),
                    search.getPage(), search.getSize()));
        } catch (Exception ex) {
            return jPresent.getResponse(ex);
        }
    }
}
