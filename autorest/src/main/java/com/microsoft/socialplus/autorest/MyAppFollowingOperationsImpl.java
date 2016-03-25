/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.socialplus.autorest.models.FeedResponseUserCompactView;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in MyAppFollowingOperations.
 */
public final class MyAppFollowingOperationsImpl implements MyAppFollowingOperations {
    /** The Retrofit service to perform REST calls. */
    private MyAppFollowingService service;
    /** The service client containing this operation class. */
    private SocialPlusClient client;

    /**
     * Initializes an instance of MyAppFollowingOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MyAppFollowingOperationsImpl(Retrofit retrofit, SocialPlusClient client) {
        this.service = retrofit.create(MyAppFollowingService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MyAppFollowingOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MyAppFollowingService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("v0.2/users/me/apps/{appHandle}/following/difference")
        Call<ResponseBody> getUsers(@Path("appHandle") String appHandle, @Query("cursor") String cursor, @Header("Authorization") String authorization);

    }

    /**
     * Find users the current user is following in another app but not in the current app.
     *
     * @param appHandle App handle
     * @param authorization Authenication (must begin with string "Bearer ")
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseUserCompactView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<FeedResponseUserCompactView> getUsers(String appHandle, String authorization) throws ServiceException, IOException, IllegalArgumentException {
        if (appHandle == null) {
            throw new IllegalArgumentException("Parameter appHandle is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        final String cursor = null;
        Call<ResponseBody> call = service.getUsers(appHandle, cursor, authorization);
        return getUsersDelegate(call.execute());
    }

    /**
     * Find users the current user is following in another app but not in the current app.
     *
     * @param appHandle App handle
     * @param authorization Authenication (must begin with string "Bearer ")
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getUsersAsync(String appHandle, String authorization, final ServiceCallback<FeedResponseUserCompactView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (appHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter appHandle is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        final String cursor = null;
        Call<ResponseBody> call = service.getUsers(appHandle, cursor, authorization);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<FeedResponseUserCompactView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUsersDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Find users the current user is following in another app but not in the current app.
     *
     * @param appHandle App handle
     * @param authorization Authenication (must begin with string "Bearer ")
     * @param cursor Current read cursor
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the FeedResponseUserCompactView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<FeedResponseUserCompactView> getUsers(String appHandle, String authorization, String cursor) throws ServiceException, IOException, IllegalArgumentException {
        if (appHandle == null) {
            throw new IllegalArgumentException("Parameter appHandle is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getUsers(appHandle, cursor, authorization);
        return getUsersDelegate(call.execute());
    }

    /**
     * Find users the current user is following in another app but not in the current app.
     *
     * @param appHandle App handle
     * @param authorization Authenication (must begin with string "Bearer ")
     * @param cursor Current read cursor
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getUsersAsync(String appHandle, String authorization, String cursor, final ServiceCallback<FeedResponseUserCompactView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (appHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter appHandle is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getUsers(appHandle, cursor, authorization);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<FeedResponseUserCompactView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUsersDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<FeedResponseUserCompactView> getUsersDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<FeedResponseUserCompactView, ServiceException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<FeedResponseUserCompactView>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
