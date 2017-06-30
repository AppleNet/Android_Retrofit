package com.llc.retrofit;

import com.llc.retrofit.bean.Commit;
import com.llc.retrofit.bean.RechekData;
import com.llc.retrofit.bean.WrapperBean;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.HTTP;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * com.llc.retrofit.RetrofitService
 *
 * @author liulongchao
 * @since 2017/6/28
 */


public interface RetrofitService {


    /*
    *  动态代理的方式 获取请求
    *  一. 调用retrofit的crate方法的时候 将接口类传递进去
    *    1.验证是否是接口
    *    2.调用eagerlyValidateMethods 判断是否已经加载，如果没有加载，则调用ServiceMethod.Builder<>(this, method).build()去加载所有的方法，然后将其放入缓存
    *    3.反射的形式调用这些方法
    *    4.用serviceMethod，创建OkHttpCall，调用adapt方法 适配当前接口
    * 二. serviceMethod.Builder中
    *     遍历注解，获取请求方法，请求体，类型，请求的url等一系列参数，然后通过OkHttpCall 转化成一个对象。
    *
    * ***/



    // token=a250942f-01fe-4f1c-acc7-611a2e1b6436
    // loanApplyNo=MF201706231600012584
    // businessType=EDULOAN

    /**
     * HTTP
     *  method:网络请求的方法，区分大小写
     *  path：网络请求地址路径
     *  hasBody：是否有请求体
     * */
    @HTTP(method = "POST", path = "orderDetail?token=a250942f-01fe-4f1c-acc7-611a2e1b6436&loanApplyNo=MF201706231600012584&businessType=EDULOAN", hasBody = true)
    Observable<WrapperBean<RechekData>> httpResutl();

    @POST("orderDetail?token=a250942f-01fe-4f1c-acc7-611a2e1b6436&loanApplyNo=MF201706231600012584&businessType=EDULOAN")
    Observable<WrapperBean<RechekData>> postResult();

    /**
     *  post形式
     *      使用QueryMap 传参形式提交 不需要结合FormUrlEncoded一起使用
     * */
    @POST("orderDetail")
    Observable<WrapperBean<RechekData>> postQueryMapResult(@QueryMap Map<String, String> params);

    /**
     *  post形式
     *      使用Query 传参形式提交 不需要结合FormUrlEncoded一起使用
     * */
    @POST("orderDetail")
    Observable<WrapperBean<RechekData>> postQueryResult(@Query("token")String token, @Query("loanApplyNo")String loanApplyNo, @Query("businessType")String businessType);

    /**
     *  post形式
     *      使用FieldMap 传参形式提交
     *      FieldMap必须和@FormUrlEncoded 一起配合使用，否则报@FieldMap parameters can only be used with form encoding异常
     * */
    @POST("orderDetail")
    @FormUrlEncoded
    Observable<WrapperBean<RechekData>> postFieldMapResult(@FieldMap Map<String, String> params);

    /**
     *  post形式
     *      使用Field传参形式提交
     *      FieldMap必须和@FormUrlEncoded 一起配合使用，否则报@Field parameters can only be used with form encoding异常
     * */
    @POST("orderDetail")
    @FormUrlEncoded
    Observable<WrapperBean<RechekData>> postFiedlRestult(@Field("token")String token, @Field("loanApplyNo")String loanApplyNo, @Field("businessType")String businessType);

    /**
     * headers 用来添加请求头
     *     大部分接口都是表单形式，某些接口 服务端糊涂蛋 自己搞不清楚，使用json这个时候 就需要headers来特殊处理
     * */
    @Headers({"Content-type:application/x-www-form-urlencoded"})
    @POST("orderDetail")
    Observable<WrapperBean<RechekData>> headersResult(@QueryMap Map<String, String> params);

    /**
     * post形式
     * @Body
     *    以 Post方式 传递 《自定义数据类型》 给服务器 这个比较屌，任何类型都能传递，也可以用body来传递文件 @Body RequestBody params
     *    特别注意：如果提交的是一个Map，那么作用相当于 @Field
     * */
    @POST("orderDetail")
    Observable<WrapperBean<RechekData>> bodyResult(@Body Commit commit);

    /**
     *  post形式
     *  @Part-RequestBody
     *      必须和@Multipart 注解配合使用 否则报@Part parameters can only be used with multipart encoding
     *      必须和RequestBody配合使用 否则报OnErrorNotImplementedException: The item is null
     *      适用于 有文件上传 的场景
     *
     *      上传文件的时候 使用方法声明的形参使用-->@Part("参数key")MultipartBody.Part file
     *      方法调用的地方使用-->RequestBody file = RequestBody.create(MediaType.parse("application/octet-stream"), "这里是模拟文件的内容");
     *                         MultipartBody.Part filePart = MultipartBody.Part.createFormData("file", "test.txt", file);
     * */
    @POST("orderDetail")
    @Multipart
    Observable<WrapperBean<RechekData>> partResult(@Part("token") RequestBody token, @Part("loanApplyNo")RequestBody loanApplyNo, @Part("businessType")RequestBody businessType);

    /**
     * post形式
     * @PartMap
     *      必须和@Multipart 注解配合使用 否则报@Part parameters can only be used with multipart encoding
     *      必须和Map配合使用 并且Map的value必须是Map<String, RequestBody></>
     *      传递文件的时候 必须是MultipartBody.Part
     * */
    @POST("orderDetail")
    @Multipart
    Observable<WrapperBean<RechekData>> partMapResult(@PartMap Map<String, Object> params);

    /**
     *  post形式
     *  @URL
     *      自定义url访问地址，可以针对项目开发中 某个接口 需要联调服务端本地的时候 使用
     * */
    @POST
    Observable<WrapperBean<RechekData>> urlResult(@Url String url);
}
