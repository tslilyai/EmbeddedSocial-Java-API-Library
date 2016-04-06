/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ActivityType.
 */
public enum ActivityType {
    /** Enum value Like. */
    LIKE("Like"),

    /** Enum value Comment. */
    COMMENT("Comment"),

    /** Enum value Reply. */
    REPLY("Reply"),

    /** Enum value CommentPeer. */
    COMMENTPEER("CommentPeer"),

    /** Enum value ReplyPeer. */
    REPLYPEER("ReplyPeer"),

    /** Enum value Following. */
    FOLLOWING("Following"),

    /** Enum value FollowRequest. */
    FOLLOWREQUEST("FollowRequest"),

    /** Enum value FollowAccept. */
    FOLLOWACCEPT("FollowAccept");

    /** The actual serialized value for a ActivityType instance. */
    private String value;

    ActivityType(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a ActivityType instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a ActivityType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ActivityType object, or null if unable to parse.
     */
    @JsonCreator
    public static ActivityType fromValue(String value) {
        ActivityType[] items = ActivityType.values();
        for (ActivityType item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return toValue();
    }
}
