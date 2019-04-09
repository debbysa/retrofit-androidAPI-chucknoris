package com.debbysa.chucknorris.services;

import com.debbysa.chucknorris.model.Joke;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JokesService {
    @GET("/jokes/random")
    Call<Joke> getRandomJoke();
}
