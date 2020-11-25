package com.wine.to.up.user.service.api.service;

import com.wine.to.up.user.service.api.dto.*;
import com.wine.to.up.user.service.api.error.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public interface FavoritesService {

    /**
     * Returns list of users subscribed at wine position
     * @param id Wine position Id
     */
    public List<UserSubscriptionDto> findUsersByWineId(String id);

    /**
     * Returns info about wine position and list of subscribed at wine position users' tokens
     * @param id Wine position Id
     */
    public WinePriceUpdatedResponse getPushTokensByWineId(String id);

    /**
     * Returns list of users' ids subscribed at wine position
     * @param id Wine position Id
     */
    public List<Long> findUserIdsByWineId(String id);

    /**
     * Returnes list of users subscribed at wine position with ID
     * @param id Wine position Id
     */
    public List<UserDto> getUsersByItemId(String id);

    /**
     * Removes wine position from subscriptions of user
     * @param itemId Wine position id
     * @param userId User's id
     */
    public void removeUserFavoritesItem(String itemId, Long userId);

    /**
     * Adds wine position to subscriptions of user
     * @param itemId Wine position id
     * @param userId User's id
     */
    public void addUserFavoritesItem(String itemId, Long userId);

    /**
     * Returns list of users favorites
     * @param userId User's id
     */
    public List<ItemDto> getItemsByUserId(Long userId);
}
