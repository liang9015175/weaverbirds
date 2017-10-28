package com.liuyanan.controller;

import com.liuyanan.domain.Depart;
import com.liuyanan.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public void delete(Integer id){
        departService.deleteDepart(id);
    }
    @RequestMapping(value = "/put",method = RequestMethod.PUT)
    public void update(Depart depart){
        departService.updateDepart(depart);
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Depart> list(){
        return departService.list();
    }
}
