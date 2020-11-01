package com.wine.to.up.user.service.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WinePriceUpdatedResponse {
    private String wineId;
    private String wineName;
    private Float newWinePrice;
    private List<UserTokens> userTokens;
}
