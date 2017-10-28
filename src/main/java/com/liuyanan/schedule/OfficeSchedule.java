package com.liuyanan.schedule;

import org.springframework.stereotype.Component;

/**
 * Created by songliangliang on 2017/10/28.
 */
@Component
public class OfficeSchedule {
    /*@Autowired
    private OfficeRentMapper officeRentMapper;
    @Autowired
    private OfficeService officeService;
    @Scheduled(cron = "0 0/10 * * * ?")
    public void updateOffice(){
        OfficeRentExample example=new OfficeRentExample();
        example.or().andEndTimeLessThanOrEqualTo(new Date());
        List<OfficeRent> officeRents = officeRentMapper.selectByExample(example);

        for(OfficeRent officeRent:officeRents){
            OfficeRent rent = new OfficeRent();
            rent.setId(officeRent.getId());
            rent.setStatus();
            officeRentMapper.updateByPrimaryKeySelective()
        }
        officeService.list();
    }*/
}
