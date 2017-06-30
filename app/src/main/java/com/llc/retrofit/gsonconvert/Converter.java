package com.llc.retrofit.gsonconvert;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * com.llc.retrofit.gsonconvert.Converter
 *
 * @author liulongchao
 * @since 2017/6/30
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Converter {
    Class<? extends AbstractResponseConverter> converter();
}
