package com.solo.comm.net;

import com.solo.comm.net.model.AdInfoModel;
import com.solo.comm.net.model.BaseModel;
import com.solo.comm.net.model.BaseModels;
import com.solo.comm.net.model.ConfigModel;
import com.solo.comm.net.model.SdkModel;
import com.solo.comm.net.model.UpdateModel;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Create by Totoro
 * 2019-06-18 17:52
 **/
public interface Api {

    /**
     * app_config
     */
    @POST("/apii/data/list")
    Observable<BaseModel<ConfigModel>> getServiceConfig(@Body RequestBody body);

    @POST("/apii/data/list")
    Observable<BaseModel<UpdateModel>> getUpdateConfig(@Body RequestBody body);


    /**
     * ad_position
     */
    @POST("/adp/data/list")
    Observable<BaseModels<List<AdInfoModel>>> getAd(@Body RequestBody body);


    @POST("/ads/data/list")
    Observable<BaseModels<SdkModel>> getSdk(@Body RequestBody body);
}
