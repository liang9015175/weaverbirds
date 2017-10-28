package com.liuyanan.controller;

import com.liuyanan.domain.Rent;
import com.liuyanan.param.RentGroup;
import com.liuyanan.param.RentParam;
import com.liuyanan.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by songliangliang on 2017/10/28.
 */
@RestController
@RequestMapping("/rent")
public class RentController {
    @Autowired
    private RentService rentService;

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public void rent(@RequestBody RentParam param) {
        rentService.rent(param);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void audit(Integer rentId) {
        rentService.audit(rentId);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Rent> list(@RequestParam(required = false) Integer rentId,
                           @RequestParam(required = false) String userName,
                           @RequestParam(required = false) Integer depart,
                           @RequestParam(required = false) Integer outOrIn,
                           @RequestParam(required = false) Integer rentStatus,
                           @RequestParam(required = true) Integer curPage,
                           @RequestParam(required = true) Integer pageSize) {
        return rentService.list(rentId, userName, depart, outOrIn, rentStatus, curPage, pageSize);
    }

    @RequestMapping(value = "/list/group", method = RequestMethod.GET)
    public List<RentGroup> groupList(Date startTime, Date endTime) {
        return rentService.listGroup(startTime, endTime);
    }
}
