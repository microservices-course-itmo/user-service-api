package com.wine.to.up.user.service.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class WineResponse {
    private Long wineId;
    private String wineName;
    private Long newWinePrice;
    private List<UserTokens> userTokens;
}
