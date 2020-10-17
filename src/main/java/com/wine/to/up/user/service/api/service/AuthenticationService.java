/*
 * Copyright (c) 2020 Andrsuh INC.
 * All Rights Reserved
 *
 * This software contains the intellectual property of Andrsuh INC or is
 * licensed to Dell EMC from third parties. Use of this software and the
 * intellectual property contained therein is expressly limited to the terms and
 * conditions of the License Agreement under which it is provided by or on behalf
 * of Andrsuh INC.
 */
package com.wine.to.up.user.service.api.service;

import com.wine.to.up.user.service.api.error.UnauthorizedException;

/**
 * Defines an interface for communicating with auth api of user service
 */
public interface AuthenticationService {
    /**
     * Returns nothing if validation succeeded and throws exception otherwise.
     * @param token access token to validate
     * @throws UnauthorizedException if validation failed
     */
    void validate(String token) throws UnauthorizedException;
}
