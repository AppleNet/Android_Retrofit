package com.llc.retrofit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.llc.retrofit.bean.Commit;
import com.llc.retrofit.bean.RechekData;
import com.llc.retrofit.bean.WrapperBean;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RetrofitUtils.getRetrofitUtils().getService().httpResutl()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Function<WrapperBean<RechekData>, ObservableSource<RechekData>>() {
                    @Override
                    public ObservableSource<RechekData> apply(@NonNull WrapperBean<RechekData> rechekDataWrapperBean) throws Exception {
                        return Observable.just(rechekDataWrapperBean.getData());
                    }
                }).subscribe(new Consumer<RechekData>() {
                    @Override
                    public void accept(@NonNull RechekData retrofitResult) throws Exception {
                        Log.d("MainActivity", "httpResutl:"+retrofitResult.getSellerEntity().getLoanApplyNo());
                        Toast.makeText(MainActivity.this, "httpResutl:"+retrofitResult.getSellerEntity().getLoanApplyNo(), Toast.LENGTH_LONG).show();
                    }
                });

        RetrofitUtils.getRetrofitUtils().getService().postResult()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Function<WrapperBean<RechekData>, ObservableSource<RechekData>>() {
                    @Override
                    public ObservableSource<RechekData> apply(@NonNull WrapperBean<RechekData> rechekDataWrapperBean) throws Exception {
                        return Observable.just(rechekDataWrapperBean.getData());
                    }
                })
                .subscribe(new Consumer<RechekData>() {
                    @Override
                    public void accept(@NonNull RechekData retrofitResult) throws Exception {
                        Log.d("MainActivity", "postResult:"+retrofitResult.getSellerEntity().getLoanApplyNo());
                        Toast.makeText(MainActivity.this, "postResult:"+retrofitResult.getSellerEntity().getLoanApplyNo(), Toast.LENGTH_LONG).show();
                    }
                });

        /*
        *  keyfrom=Yanzhikai
        *  key=2032414398
        *  type=data
        *  doctype=json
        *  version=1.1
        *  q=car
        *
        * */
        HashMap<String, String> params = new HashMap<>();
        params.put("token", "a250942f-01fe-4f1c-acc7-611a2e1b6436");
        params.put("loanApplyNo", "MF201706231600012584");
        params.put("businessType", "EDULOAN");
        RetrofitUtils.getRetrofitUtils().getService().postQueryMapResult(params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Function<WrapperBean<RechekData>, ObservableSource<RechekData>>() {
                    @Override
                    public ObservableSource<RechekData> apply(@NonNull WrapperBean<RechekData> rechekDataWrapperBean) throws Exception {
                        return Observable.just(rechekDataWrapperBean.getData());
                    }
                })
                .subscribe(new Consumer<RechekData>() {
                    @Override
                    public void accept(@NonNull RechekData retrofitResult) throws Exception {
                        Log.d("MainActivity", "postQueryMapResult:"+retrofitResult.getSellerEntity().getLoanApplyNo());
                        Toast.makeText(MainActivity.this, "postQueryMapResult:"+retrofitResult.getSellerEntity().getLoanApplyNo(), Toast.LENGTH_LONG).show();
                    }
                });

        RetrofitUtils.getRetrofitUtils().getService().postFieldMapResult(params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Function<WrapperBean<RechekData>, ObservableSource<RechekData>>() {
                    @Override
                    public ObservableSource<RechekData> apply(@NonNull WrapperBean<RechekData> rechekDataWrapperBean) throws Exception {
                        return Observable.just(rechekDataWrapperBean.getData());
                    }
                })
                .subscribe(new Consumer<RechekData>() {
                    @Override
                    public void accept(@NonNull RechekData retrofitResult) throws Exception {
                        Log.d("MainActivity", "postFieldMapResult:"+retrofitResult.getSellerEntity().getLoanApplyNo());
                        Toast.makeText(MainActivity.this, "postFieldMapResult:"+retrofitResult.getSellerEntity().getLoanApplyNo(), Toast.LENGTH_LONG).show();
                    }
                });
        String token = "a250942f-01fe-4f1c-acc7-611a2e1b6436";
        String loanApplyNo = "MF201706231600012584";
        String businessType = "EDULOAN";

        RetrofitUtils.getRetrofitUtils().getService().postFiedlRestult(token, loanApplyNo, businessType)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Function<WrapperBean<RechekData>, ObservableSource<RechekData>>() {
                    @Override
                    public ObservableSource<RechekData> apply(@NonNull WrapperBean<RechekData> rechekDataWrapperBean) throws Exception {
                        return Observable.just(rechekDataWrapperBean.getData());
                    }
                })
                .subscribe(new Consumer<RechekData>() {
                    @Override
                    public void accept(@NonNull RechekData retrofitResult) throws Exception {
                        Log.d("MainActivity", "postFiedlRestult:"+retrofitResult.getSellerEntity().getLoanApplyNo());
                        Toast.makeText(MainActivity.this, "postFiedlRestult:"+retrofitResult.getSellerEntity().getLoanApplyNo(), Toast.LENGTH_LONG).show();
                    }
                });

        RetrofitUtils.getRetrofitUtils().getService().postQueryResult(token, loanApplyNo, businessType)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Function<WrapperBean<RechekData>, ObservableSource<RechekData>>() {
                    @Override
                    public ObservableSource<RechekData> apply(@NonNull WrapperBean<RechekData> rechekDataWrapperBean) throws Exception {
                        return Observable.just(rechekDataWrapperBean.getData());
                    }
                })
                .subscribe(new Consumer<RechekData>() {
                    @Override
                    public void accept(@NonNull RechekData retrofitResult) throws Exception {
                        Log.d("MainActivity", "postQueryResult:"+retrofitResult.getSellerEntity().getLoanApplyNo());
                        Toast.makeText(MainActivity.this, "postQueryResult:"+retrofitResult.getSellerEntity().getLoanApplyNo(), Toast.LENGTH_LONG).show();
                    }
                });

        RetrofitUtils.getRetrofitUtils().getService().headersResult(params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Function<WrapperBean<RechekData>, ObservableSource<RechekData>>() {
                    @Override
                    public ObservableSource<RechekData> apply(@NonNull WrapperBean<RechekData> rechekDataWrapperBean) throws Exception {
                        return Observable.just(rechekDataWrapperBean.getData());
                    }
                })
                .subscribe(new Consumer<RechekData>() {
                    @Override
                    public void accept(@NonNull RechekData retrofitResult) throws Exception {
                        Log.d("MainActivity", "headersResutl:"+retrofitResult.getSellerEntity().getLoanApplyNo());
                        Toast.makeText(MainActivity.this, "headersResutl:"+retrofitResult.getSellerEntity().getLoanApplyNo(), Toast.LENGTH_LONG).show();
                    }
                });

        Commit commit = new Commit();
        commit.setToken("a250942f-01fe-4f1c-acc7-611a2e1b6436");
        commit.setBusinessType("EDULOAN");
        commit.setLoanApplyNo("MF201706231600012584");
        RetrofitUtils.getRetrofitUtils().getService().bodyResult(commit)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Function<WrapperBean<RechekData>, ObservableSource<RechekData>>() {
                    @Override
                    public ObservableSource<RechekData> apply(@NonNull WrapperBean<RechekData> rechekDataWrapperBean) throws Exception {
                        return Observable.just(rechekDataWrapperBean.getData());
                    }
                })
                .subscribe(new Consumer<RechekData>() {
                    @Override
                    public void accept(@NonNull RechekData retrofitResult) throws Exception {
                        Log.d("MainActivity", "bodyResult:"+retrofitResult.getSellerEntity().getLoanApplyNo());
                        Toast.makeText(MainActivity.this, "bodyResult:"+retrofitResult.getSellerEntity().getLoanApplyNo(), Toast.LENGTH_LONG).show();
                    }
                });

        RetrofitUtils.getRetrofitUtils().getService().partResult(RequestBody.create(MediaType.parse("text/plain"), token), RequestBody.create(MediaType.parse("text/plain"), loanApplyNo), RequestBody.create(MediaType.parse("text/plain"), businessType))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Function<WrapperBean<RechekData>, ObservableSource<RechekData>>() {
                    @Override
                    public ObservableSource<RechekData> apply(@NonNull WrapperBean<RechekData> rechekDataWrapperBean) throws Exception {
                        return Observable.just(rechekDataWrapperBean.getData());
                    }
                })
                .subscribe(new Consumer<RechekData>() {
                    @Override
                    public void accept(@NonNull RechekData retrofitResult) throws Exception {
                        Log.d("MainActivity", "partResult:"+retrofitResult.getSellerEntity().getLoanApplyNo());
                        Toast.makeText(MainActivity.this, "partResult:"+retrofitResult.getSellerEntity().getLoanApplyNo(), Toast.LENGTH_LONG).show();
                    }
                });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
