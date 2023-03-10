package com.example.carDealershipApi.controller_test;

import com.example.carDealershipApi.dto.DtoCheck;

import com.example.carDealershipApi.utils.UtilsJson;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@SpringBootTest
public class CheckControllerTest {
    @Test
    public void sellObj() throws IOException {

        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(2021, 9, 1);
        java.util.Date dt =  cal.getTime();
        String currentTime = sdf.format(dt);
        DtoCheck dtoCheck = new DtoCheck("Sergey", "Ivanov", "+79107891155",
                "BMW", "X5", 2000000, dt);
        String jsonSell = UtilsJson.objToStringJson(dtoCheck);
        System.out.println(jsonSell);
    }
}
