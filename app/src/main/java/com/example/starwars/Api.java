package com.example.starwars;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL ="https://awesome-star-wars-api.herokuapp.com/";

    @GET("characters")
    Call<List<Character>> getCharacters();
}
