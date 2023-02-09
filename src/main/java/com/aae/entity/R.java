package com.aae.entity;

import lombok.Data;

@Data
public final class R {
    private final int code;
    private final Object data;
    private final String message;

    public static R ok(Object data) {
        return new R(200, data, null);
    }

    public static R error(int code, String message) {
        return new R(code, null, message);
    }
}
