package com.liuyanan.param;

import com.liuyanan.domain.Office;
import lombok.Data;

import java.util.Date;

/**
 * Created by songliangliang on 2017/10/28.
 */
@Data
public class OfficeEx extends Office {
    private String status;
    private Date startTime;
    private Date endTime;
}
