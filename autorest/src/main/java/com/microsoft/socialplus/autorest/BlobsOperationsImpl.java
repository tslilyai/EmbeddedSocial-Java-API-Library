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
import com.microsoft.socialplus.autorest.models.PostBlobResponse;
import java.io.InputStream;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Streaming;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in BlobsOperations.
 */
public final class BlobsOperationsImpl implements BlobsOperations {
    /** The Retrofit service to perform REST calls. */
    private BlobsService service;
    /** The service client containing this operation class. */
    private SocialPlusClient client;

    /**
     * Initializes an instance of BlobsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BlobsOperationsImpl(Retrofit retrofit, SocialPlusClient client) {
        this.service = retrofit.create(BlobsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BlobsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BlobsService {
        @Headers("Content-Type: application/octet-stream")
        @POST("v0.3/blobs")
        Call<ResponseBody> postBlob(@Header("appkey") String appkey, @Header("Authorization") String authorization, @Header("UserHandle") String userHandle, @Body RequestBody blob);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("v0.3/blobs/{blobHandle}")
        @Streaming
        Call<ResponseBody> getBlob(@Path("blobHandle") String blobHandle, @Header("appkey") String appkey, @Header("Authorization") String authorization, @Header("UserHandle") String userHandle);

    }

    /**
     * Upload a blob.
     * If your blob is an image, use image APIs. For all other blob types, use this API.
     *
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param blob MIME encoded contents of the blob
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PostBlobResponse object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PostBlobResponse> postBlob(String authorization, byte[] blob) throws ServiceException, IOException, IllegalArgumentException {
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        if (blob == null) {
            throw new IllegalArgumentException("Parameter blob is required and cannot be null.");
        }
        final String appkey = null;
        final String userHandle = null;
        RequestBody blobConverted = RequestBody.create(MediaType.parse("application/octet-stream"), blob);
        Call<ResponseBody> call = service.postBlob(appkey, authorization, userHandle, blobConverted);
        return postBlobDelegate(call.execute());
    }

    /**
     * Upload a blob.
     * If your blob is an image, use image APIs. For all other blob types, use this API.
     *
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param blob MIME encoded contents of the blob
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postBlobAsync(String authorization, byte[] blob, final ServiceCallback<PostBlobResponse> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        if (blob == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter blob is required and cannot be null."));
            return null;
        }
        final String appkey = null;
        final String userHandle = null;
        RequestBody blobConverted = RequestBody.create(MediaType.parse("application/octet-stream"), blob);
        Call<ResponseBody> call = service.postBlob(appkey, authorization, userHandle, blobConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<PostBlobResponse>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postBlobDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Upload a blob.
     * If your blob is an image, use image APIs. For all other blob types, use this API.
     *
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param blob MIME encoded contents of the blob
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PostBlobResponse object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PostBlobResponse> postBlob(String authorization, byte[] blob, String appkey, String userHandle) throws ServiceException, IOException, IllegalArgumentException {
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        if (blob == null) {
            throw new IllegalArgumentException("Parameter blob is required and cannot be null.");
        }
        RequestBody blobConverted = RequestBody.create(MediaType.parse("application/octet-stream"), blob);
        Call<ResponseBody> call = service.postBlob(appkey, authorization, userHandle, blobConverted);
        return postBlobDelegate(call.execute());
    }

    /**
     * Upload a blob.
     * If your blob is an image, use image APIs. For all other blob types, use this API.
     *
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param blob MIME encoded contents of the blob
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall postBlobAsync(String authorization, byte[] blob, String appkey, String userHandle, final ServiceCallback<PostBlobResponse> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        if (blob == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter blob is required and cannot be null."));
            return null;
        }
        RequestBody blobConverted = RequestBody.create(MediaType.parse("application/octet-stream"), blob);
        Call<ResponseBody> call = service.postBlob(appkey, authorization, userHandle, blobConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<PostBlobResponse>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postBlobDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<PostBlobResponse> postBlobDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<PostBlobResponse, ServiceException>(this.client.getMapperAdapter())
                .register(201, new TypeToken<PostBlobResponse>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Get blob.
     *
     * @param blobHandle Blob handle
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<InputStream> getBlob(String blobHandle, String authorization) throws ServiceException, IOException, IllegalArgumentException {
        if (blobHandle == null) {
            throw new IllegalArgumentException("Parameter blobHandle is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        final String appkey = null;
        final String userHandle = null;
        Call<ResponseBody> call = service.getBlob(blobHandle, appkey, authorization, userHandle);
        return getBlobDelegate(call.execute());
    }

    /**
     * Get blob.
     *
     * @param blobHandle Blob handle
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getBlobAsync(String blobHandle, String authorization, final ServiceCallback<InputStream> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (blobHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter blobHandle is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        final String appkey = null;
        final String userHandle = null;
        Call<ResponseBody> call = service.getBlob(blobHandle, appkey, authorization, userHandle);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getBlobDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Get blob.
     *
     * @param blobHandle Blob handle
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<InputStream> getBlob(String blobHandle, String authorization, String appkey, String userHandle) throws ServiceException, IOException, IllegalArgumentException {
        if (blobHandle == null) {
            throw new IllegalArgumentException("Parameter blobHandle is required and cannot be null.");
        }
        if (authorization == null) {
            throw new IllegalArgumentException("Parameter authorization is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getBlob(blobHandle, appkey, authorization, userHandle);
        return getBlobDelegate(call.execute());
    }

    /**
     * Get blob.
     *
     * @param blobHandle Blob handle
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getBlobAsync(String blobHandle, String authorization, String appkey, String userHandle, final ServiceCallback<InputStream> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (blobHandle == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter blobHandle is required and cannot be null."));
            return null;
        }
        if (authorization == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter authorization is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getBlob(blobHandle, appkey, authorization, userHandle);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getBlobDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<InputStream> getBlobDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<InputStream, ServiceException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<InputStream>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
