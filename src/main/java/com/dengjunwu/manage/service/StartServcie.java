package com.dengjunwu.manage.service;

import com.dengjunwu.manage.Entity.StartDemoUser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StartServcie {

    public List<StartDemoUser> getMockUserInfoList(){
        List<StartDemoUser> users = new ArrayList<>();
        for (int i = 0 ; i < 5; i++){
            users.add(StartDemoUser.builder()
                    .name("demo" + i).age(18).phoneNumber("15901525816").build());
        }
        return users;
    }
}
