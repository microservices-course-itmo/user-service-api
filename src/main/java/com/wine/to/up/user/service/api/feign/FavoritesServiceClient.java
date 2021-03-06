package com.wine.to.up.user.service.api.feign;

import com.wine.to.up.user.service.api.dto.ItemDto;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface FavoritesServiceClient {
    /**
     * Returns list of user's favorites as list of ids
     * @param token token provided in request
     */
    @RequestLine(value = "GET /favorites/list")
    @Headers({"Content-Type: application/json", "Authorization: {token}"})
    List<String> findUsersFavoritesIdList(@Param("token") String token);

    /**
     * Returns list of user's favorites
     * @param token token provided in request
     */
    @RequestLine(value = "GET /favorites/")
    @Headers({"Content-Type: application/json", "Authorization: {token}"})
    List<ItemDto> findUsersFavorites(@Param("token") String token);
}
