/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest;

import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.AutoRestBaseUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the SocialPlusClient class.
 */
public final class SocialPlusClientImpl extends ServiceClient implements SocialPlusClient {
    /**
     * The URL used as the base for all cloud service requests.
     */
    private final AutoRestBaseUrl baseUrl;

    /**
     * Gets the URL used as the base for all cloud service requests.
     *
     * @return The BaseUrl value.
     */
    public AutoRestBaseUrl getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * Gets the BlobsOperations object to access its operations.
     * @return the BlobsOperations object.
     */
    public BlobsOperations getBlobsOperations() {
        return new BlobsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the BuildsOperations object to access its operations.
     * @return the BuildsOperations object.
     */
    public BuildsOperations getBuildsOperations() {
        return new BuildsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the CommentsOperations object to access its operations.
     * @return the CommentsOperations object.
     */
    public CommentsOperations getCommentsOperations() {
        return new CommentsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the TopicCommentsOperations object to access its operations.
     * @return the TopicCommentsOperations object.
     */
    public TopicCommentsOperations getTopicCommentsOperations() {
        return new TopicCommentsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the HashtagsOperations object to access its operations.
     * @return the HashtagsOperations object.
     */
    public HashtagsOperations getHashtagsOperations() {
        return new HashtagsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the ImagesOperations object to access its operations.
     * @return the ImagesOperations object.
     */
    public ImagesOperations getImagesOperations() {
        return new ImagesOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the TopicLikesOperations object to access its operations.
     * @return the TopicLikesOperations object.
     */
    public TopicLikesOperations getTopicLikesOperations() {
        return new TopicLikesOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the ReplyLikesOperations object to access its operations.
     * @return the ReplyLikesOperations object.
     */
    public ReplyLikesOperations getReplyLikesOperations() {
        return new ReplyLikesOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the CommentLikesOperations object to access its operations.
     * @return the CommentLikesOperations object.
     */
    public CommentLikesOperations getCommentLikesOperations() {
        return new CommentLikesOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyNotificationsOperations object to access its operations.
     * @return the MyNotificationsOperations object.
     */
    public MyNotificationsOperations getMyNotificationsOperations() {
        return new MyNotificationsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyPinsOperations object to access its operations.
     * @return the MyPinsOperations object.
     */
    public MyPinsOperations getMyPinsOperations() {
        return new MyPinsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyPushRegistrationsOperations object to access its operations.
     * @return the MyPushRegistrationsOperations object.
     */
    public MyPushRegistrationsOperations getMyPushRegistrationsOperations() {
        return new MyPushRegistrationsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the RepliesOperations object to access its operations.
     * @return the RepliesOperations object.
     */
    public RepliesOperations getRepliesOperations() {
        return new RepliesOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the CommentRepliesOperations object to access its operations.
     * @return the CommentRepliesOperations object.
     */
    public CommentRepliesOperations getCommentRepliesOperations() {
        return new CommentRepliesOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the UserReportsOperations object to access its operations.
     * @return the UserReportsOperations object.
     */
    public UserReportsOperations getUserReportsOperations() {
        return new UserReportsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the TopicReportsOperations object to access its operations.
     * @return the TopicReportsOperations object.
     */
    public TopicReportsOperations getTopicReportsOperations() {
        return new TopicReportsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the ReplyReportsOperations object to access its operations.
     * @return the ReplyReportsOperations object.
     */
    public ReplyReportsOperations getReplyReportsOperations() {
        return new ReplyReportsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the CommentReportsOperations object to access its operations.
     * @return the CommentReportsOperations object.
     */
    public CommentReportsOperations getCommentReportsOperations() {
        return new CommentReportsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the SearchOperations object to access its operations.
     * @return the SearchOperations object.
     */
    public SearchOperations getSearchOperations() {
        return new SearchOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the SessionsOperations object to access its operations.
     * @return the SessionsOperations object.
     */
    public SessionsOperations getSessionsOperations() {
        return new SessionsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the RequestTokensOperations object to access its operations.
     * @return the RequestTokensOperations object.
     */
    public RequestTokensOperations getRequestTokensOperations() {
        return new RequestTokensOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the UserFollowersOperations object to access its operations.
     * @return the UserFollowersOperations object.
     */
    public UserFollowersOperations getUserFollowersOperations() {
        return new UserFollowersOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyPendingUsersOperations object to access its operations.
     * @return the MyPendingUsersOperations object.
     */
    public MyPendingUsersOperations getMyPendingUsersOperations() {
        return new MyPendingUsersOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyFollowersOperations object to access its operations.
     * @return the MyFollowersOperations object.
     */
    public MyFollowersOperations getMyFollowersOperations() {
        return new MyFollowersOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyFollowingOperations object to access its operations.
     * @return the MyFollowingOperations object.
     */
    public MyFollowingOperations getMyFollowingOperations() {
        return new MyFollowingOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyBlockedUsersOperations object to access its operations.
     * @return the MyBlockedUsersOperations object.
     */
    public MyBlockedUsersOperations getMyBlockedUsersOperations() {
        return new MyBlockedUsersOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the UserFollowingOperations object to access its operations.
     * @return the UserFollowingOperations object.
     */
    public UserFollowingOperations getUserFollowingOperations() {
        return new UserFollowingOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the TopicsOperations object to access its operations.
     * @return the TopicsOperations object.
     */
    public TopicsOperations getTopicsOperations() {
        return new TopicsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyTopicsOperations object to access its operations.
     * @return the MyTopicsOperations object.
     */
    public MyTopicsOperations getMyTopicsOperations() {
        return new MyTopicsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyAppFollowingOperations object to access its operations.
     * @return the MyAppFollowingOperations object.
     */
    public MyAppFollowingOperations getMyAppFollowingOperations() {
        return new MyAppFollowingOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyAppsOperations object to access its operations.
     * @return the MyAppsOperations object.
     */
    public MyAppsOperations getMyAppsOperations() {
        return new MyAppsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyLikesOperations object to access its operations.
     * @return the MyLikesOperations object.
     */
    public MyLikesOperations getMyLikesOperations() {
        return new MyLikesOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the MyLinkedAccountsOperations object to access its operations.
     * @return the MyLinkedAccountsOperations object.
     */
    public MyLinkedAccountsOperations getMyLinkedAccountsOperations() {
        return new MyLinkedAccountsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the UsersOperations object to access its operations.
     * @return the UsersOperations object.
     */
    public UsersOperations getUsersOperations() {
        return new UsersOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the UserTopicsOperations object to access its operations.
     * @return the UserTopicsOperations object.
     */
    public UserTopicsOperations getUserTopicsOperations() {
        return new UserTopicsOperationsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Initializes an instance of SocialPlusClient client.
     */
    public SocialPlusClientImpl() {
        this("http://sp-ppe.cloudapp.net");
    }

    /**
     * Initializes an instance of SocialPlusClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public SocialPlusClientImpl(String baseUrl) {
        super();
        this.baseUrl = new AutoRestBaseUrl(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of SocialPlusClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building up an {@link OkHttpClient}
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public SocialPlusClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder retrofitBuilder) {
        super(clientBuilder, retrofitBuilder);
        this.baseUrl = new AutoRestBaseUrl(baseUrl);
        initialize();
    }

    @Override
    protected void initialize() {
        super.initialize();
        this.retrofitBuilder.baseUrl(baseUrl);
    }
}
