package com.liuyanan.controller;

import com.github.pagehelper.PageInfo;
import com.liuyanan.domain.Office;
import com.liuyanan.domain.OfficeRent;
import com.liuyanan.param.OfficeEx;
import com.liuyanan.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by songliangliang on 2017/10/28.
 */
@RestController
@RequestMapping(value = "/office")
public class OfficeController {
    @Autowired
    private OfficeService officeService;

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public void addOffice(@RequestBody Office office) {
        officeService.addOffice(office);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteOffice(@PathVariable Integer id) {
        officeService.deleteOffice(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void updateOffice(@RequestBody Office office) {
        officeService.updateOffice(office);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public PageInfo<OfficeEx> list(Integer curPage,Integer pageSize) {
        return officeService.list(curPage,pageSize);
    }

    @RequestMapping(value = "/rent", method = RequestMethod.POST)
    public void officeRent(@RequestBody OfficeRent officeRent) {
        officeService.rent(officeRent);
    }

    @RequestMapping(value = "/audit", method = RequestMethod.PUT)
    public void updateRent(Integer id, Integer status) {
        officeService.updateRent(id, status);
    }

}
