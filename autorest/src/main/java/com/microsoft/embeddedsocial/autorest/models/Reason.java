/**
 * Copyright (c) Microsoft Corporation. All rights reserved. Licensed under
 * the MIT License. See LICENSE in the project root for license information.
 * <autogenerated> This file was generated using AutoRest. </autogenerated>
 */

package com.microsoft.embeddedsocial.autorest.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for Reason.
 */
public enum Reason {
    /** Enum value ThreatsCyberbullyingHarassment. */
    THREATSCYBERBULLYINGHARASSMENT("ThreatsCyberbullyingHarassment"),

    /** Enum value ChildEndangermentExploitation. */
    CHILDENDANGERMENTEXPLOITATION("ChildEndangermentExploitation"),

    /** Enum value OffensiveContent. */
    OFFENSIVECONTENT("OffensiveContent"),

    /** Enum value VirusSpywareMalware. */
    VIRUSSPYWAREMALWARE("VirusSpywareMalware"),

    /** Enum value ContentInfringement. */
    CONTENTINFRINGEMENT("ContentInfringement"),

    /** Enum value Other. */
    OTHER("Other"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a Reason instance. */
    private String value;

    Reason(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a Reason instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a Reason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Reason object, or null if unable to parse.
     */
    @JsonCreator
    public static Reason fromValue(String value) {
        Reason[] items = Reason.values();
        for (Reason item : items) {
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