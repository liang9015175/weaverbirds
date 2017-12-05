package com.liuyanan.controller;

import com.liuyanan.domain.Item;
import com.liuyanan.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by songliangliang on 2017/10/28.
 */
@RestController
@RequestMapping(value = "/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public void addItem(@RequestBody Item item){
        itemService.add(item);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public void delete(Integer id){
        itemService.delete(id);
    }
    @RequestMapping(value = "/put",method = RequestMethod.PUT)
    public void update(@RequestBody Item item){
        itemService.update(item);
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Item> list(@RequestParam(required = false) String itemName, Integer curPage, Integer pageSize){
       return itemService.list(itemName,curPage,pageSize);
    }

    @RequestMapping(value = "/cate/list",method = RequestMethod.GET)
    public List<Item> list(Integer cateId){
        return itemService.list(cateId);
    }

}
