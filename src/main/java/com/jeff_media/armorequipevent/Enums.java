package com.jeff_media.armorequipevent;

import org.checkerframework.checker.nullness.qual.NonNull;

public final class Enums {

    public static <E extends Enum<E>> boolean exists(@NonNull Class<E> clazz, String value) {
        try {
            Enum.valueOf(clazz, value);
            return true;
        } catch (IllegalArgumentException exception) {
            return false;
        }
    }

    private Enums() {
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }
}
