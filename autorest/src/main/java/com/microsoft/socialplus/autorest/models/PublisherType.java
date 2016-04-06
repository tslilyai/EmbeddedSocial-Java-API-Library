/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * This file was generated using AutoRest.
 */

package com.microsoft.socialplus.autorest.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PublisherType.
 */
public enum PublisherType {
    /** Enum value User. */
    USER("User"),

    /** Enum value App. */
    APP("App");

    /** The actual serialized value for a PublisherType instance. */
    private String value;

    PublisherType(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a PublisherType instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a PublisherType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PublisherType object, or null if unable to parse.
     */
    @JsonCreator
    public static PublisherType fromValue(String value) {
        PublisherType[] items = PublisherType.values();
        for (PublisherType item : items) {
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
