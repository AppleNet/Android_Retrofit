package com.llc.retrofit.gsonconvert;

import com.google.gson.Gson;
import com.llc.retrofit.bean.RechekData;

import java.io.IOException;

import okhttp3.ResponseBody;

/**
 * com.llc.retrofit.gsonconvert.ClassConverter
 *
 * @author liulongchao
 * @since 2017/6/30
 */


public class ClassConverter extends AbstractResponseConverter<RechekData> {


    public ClassConverter(Gson gson) {
        super(gson);
    }

    @Override
    public RechekData convert(ResponseBody value) throws IOException {
        String body = value.string();
        RechekData retrofitResult = new RechekData();
//        try {
//            Log.d("MainActivity", "ClassConverter_body: "+body);
//            JSONObject jsonObject = new JSONObject(body);
//            retrofitResult.setQuery(jsonObject.optString("query"));
//            return retrofitResult;
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
        //retrofitResult.setQuery("no query");
        return retrofitResult;
    }
}
