package com.liuyanan.controller;

import com.github.pagehelper.PageInfo;
import com.liuyanan.domain.Depart;
import com.liuyanan.param.DepartEx;
import com.liuyanan.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by songliangliang on 2017/10/28.
 */
@RestController
@RequestMapping(value = "/depart")
public class DepartController {
    @Autowired
    private DepartService departService;
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public void addDepart(@RequestBody Depart depart){
        departService.addDepart(depart);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        departService.deleteDepart(id);
    }
    @RequestMapping(value = "/put",method = RequestMethod.PUT)
    public void update(@RequestBody Depart depart){
        departService.updateDepart(depart);
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public PageInfo<DepartEx> list(Integer curPage, Integer pageSize){
        return departService.list(curPage,pageSize);
    }
}
