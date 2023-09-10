package org.apache.coyote.response;

import org.apache.coyote.Header;

public enum ResponseHeader implements Header {
    CONTENT_LENGTH("Content-Length"),
    CONTENT_TYPE("Content-Type"),
    LOCATION("Location"),
    SET_COOKIE("Set-Cookie");

    private final String name;

    ResponseHeader(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
