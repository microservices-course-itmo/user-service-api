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
package com.wine.to.up.user.service.api.feign;

import com.wine.to.up.user.service.api.error.UnauthorizedException;
import com.wine.to.up.user.service.api.service.AuthenticationService;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * Defines the parameters and paths of REST API of Authentication of User service
 * <p>
 * Java feign client will be generated based on this declaration.
 * <p>
 * Docker swarm's load balancing will resolve
 * the name of the service and request will be redirected to the particular instance.
 */
public interface AuthenticationServiceClient extends AuthenticationService {
    /**
     * {@inheritDoc}
     */
    @RequestLine(value = "POST /validate?token={token}")
    @Headers("Content-Type: application/json")
    void validate(@Param("token") String token) throws UnauthorizedException;
}
