package com.liuyanan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.datetime.DateFormatter;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Created by songliangliang on 2017/8/21.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    private static final Logger LOGGER = LoggerFactory.getLogger(Configuration.class);
    DateFormatter dateFormatter = new DateFormatter("yyyy-MM-dd HH:mm:ss");

    @Bean
    public Converter<String, Date> converter() {
        return new Converter<String, Date>() {
            Date date = null;

            @Override
            public Date convert(String source) {
                try {
                    date = dateFormatter.parse(source, Locale.CHINA);
                } catch (ParseException e) {
                    LOGGER.error("解析日期类型参数发生异常", e);
                }
                return date;
            }
        };
    }
}
