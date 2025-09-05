package com.sky.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.sky.enumeration.OperationType;

import java.lang.annotation.RetentionPolicy;

/**
 * Auto-fill annotation
 * Used to identify that a certain method requires automatic filling of functional fields
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    // Database operation type：UPDATE INSERT
    OperationType value();
}
