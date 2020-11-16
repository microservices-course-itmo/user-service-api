package com.wine.to.up.user.service.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponse {
    private String id;
    private String phoneNumber;
    private String role;
    private String name;
    private Long cityId;
    private String birthday;
}
