package com.mangobloggerandroid.app.model;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by ujjawal on 16/11/17.
 */

public interface JsonApi {
    @GET("/")
    void getRecentBlogPosts(@Query("json") String json,
                            Callback<BlogPostCallback> callback);

    @GET("/")
    void getTerms(@Query("json") String json,
                  @Query("post_type") String post_type,
                  @Query("count") String count,
                  Callback<BlogPostCallback> callback);
}
