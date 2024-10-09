package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("v1.4/movie?token=6SHV01A-A8Z4EZG-MQYN7XV-EP81HPE&field=rating.kp&search=5-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("v1.4/movie/{id}?token=6SHV01A-A8Z4EZG-MQYN7XV-EP81HPE&field=id")
    Single<TrailerResponse> loadTrailers(@Path("id") int id);

    @GET("v1/review?token=6SHV01A-A8Z4EZG-MQYN7XV-EP81HPE&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);
}

