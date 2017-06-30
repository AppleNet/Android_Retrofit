package com.llc.retrofit.gsonconvert;

import com.google.gson.Gson;
import retrofit2.Converter;
import okhttp3.ResponseBody;

/**
 * com.llc.retrofit.gsonconvert.AbstractResponseConverter
 *
 * @author liulongchao
 * @since 2017/6/30
 */


public abstract class AbstractResponseConverter<T> implements Converter<ResponseBody, T>{

    protected Gson gson;

    public AbstractResponseConverter(Gson gson) {
        this.gson = gson;
    }
}
