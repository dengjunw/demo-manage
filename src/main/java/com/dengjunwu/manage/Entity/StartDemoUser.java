package com.dengjunwu.manage.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StartDemoUser {
    private Long id;
    private String name;
    private Integer age;
    private String phoneNumber;
}
