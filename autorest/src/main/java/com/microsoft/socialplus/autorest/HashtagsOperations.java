/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in HashtagsOperations.
 */
public interface HashtagsOperations {
    /**
     * Get trending hashtags.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;String&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<String>> getTrendingHashtags() throws ServiceException, IOException;

    /**
     * Get trending hashtags.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTrendingHashtagsAsync(final ServiceCallback<List<String>> serviceCallback) throws IllegalArgumentException;
    /**
     * Get trending hashtags.
     *
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;String&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<String>> getTrendingHashtags(String appkey, String authorization, String userHandle) throws ServiceException, IOException;

    /**
     * Get trending hashtags.
     *
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getTrendingHashtagsAsync(String appkey, String authorization, String userHandle, final ServiceCallback<List<String>> serviceCallback) throws IllegalArgumentException;

    /**
     * Get autocompleted hashtags.
     *
     * @param query Search query
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;String&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<String>> getAutocompletedHashtags(String query) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get autocompleted hashtags.
     *
     * @param query Search query
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAutocompletedHashtagsAsync(String query, final ServiceCallback<List<String>> serviceCallback) throws IllegalArgumentException;
    /**
     * Get autocompleted hashtags.
     *
     * @param query Search query
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;String&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<String>> getAutocompletedHashtags(String query, String appkey, String authorization, String userHandle) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get autocompleted hashtags.
     *
     * @param query Search query
     * @param appkey App key must be filled in when using AAD tokens for Authentication.
     * @param authorization Authentication (must begin with string "Bearer "). Possible values are:
     -sessionToken for client auth
     -AAD token for service auth
     * @param userHandle User handle must be filled when using AAD tokens for Authentication.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAutocompletedHashtagsAsync(String query, String appkey, String authorization, String userHandle, final ServiceCallback<List<String>> serviceCallback) throws IllegalArgumentException;

}
