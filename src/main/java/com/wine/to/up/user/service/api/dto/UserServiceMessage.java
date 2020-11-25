package com.wine.to.up.user.service.api.dto;

import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class UserServiceMessage {
    @NotNull
    private Map<String, byte[]> headers;
    @NotNull
    private String message;
}
