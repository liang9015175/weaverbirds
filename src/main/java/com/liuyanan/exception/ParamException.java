package com.liuyanan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by songliangliang on 2017/10/14.
 */
@ResponseStatus(code = HttpStatus.PRECONDITION_FAILED, reason = "参数有误")
public class ParamException extends RuntimeException {
}
