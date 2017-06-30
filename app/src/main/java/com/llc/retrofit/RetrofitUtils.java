package com.llc.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.llc.retrofit.gsonconvert.CustomConverterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * com.llc.retrofit.RetrofitUtils
 *
 * @author liulongchao
 * @since 2017/6/28
 */


public class RetrofitUtils {

    private static volatile RetrofitUtils retrofitUtils;

    private RetrofitUtils(){}

    /**
     * 双检测获取RetrofitUtils实例
     * */
    public static RetrofitUtils getInstance(){
        if(retrofitUtils == null){
            synchronized (RetrofitUtils.class){
                if(retrofitUtils == null){
                    retrofitUtils = new RetrofitUtils();
                }
            }
        }
        return retrofitUtils;
    }

    private static class RetrofitUtilsHolder{
        private static RetrofitUtils myRetrofitUtils = new RetrofitUtils();
    }

    /**
     * Holder类获取RetrofitUtils实例
     * */
    public static RetrofitUtils getRetrofitUtils(){
        return RetrofitUtilsHolder.myRetrofitUtils;
    }

    private static Retrofit.Builder getRetrofitBuilder(){
        OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();
        /*默认连接超时10秒， 超出这时间， 会抛出 SocketTimeOutException*/
        long connectTimeout = 40 * 1000;
        okHttpBuilder.connectTimeout(connectTimeout, TimeUnit.MILLISECONDS);
        /*默认读取超时20秒*/
        long readTimeout = 20 * 1000;
        okHttpBuilder.readTimeout(readTimeout, TimeUnit.MILLISECONDS);
        /*默认写入超时20秒*/
        long writeTimeout = 20 * 1000;
        okHttpBuilder.writeTimeout(writeTimeout, TimeUnit.MILLISECONDS);
        okHttpBuilder.retryOnConnectionFailure(true);
        Gson gson = new GsonBuilder().setLenient().create();
        OkHttpClient client = okHttpBuilder.build();
        Retrofit.Builder builder = new Retrofit.Builder().client(client)
                .addConverterFactory(CustomConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create());
        return builder;
    }


    private Retrofit getRetrofit(){
        return getRetrofitBuilder().baseUrl("http://10.143.117.45:8081/sm-api/").build();
    }

    public RetrofitService getService(){
        return getRetrofit().create(RetrofitService.class);
    }

}
