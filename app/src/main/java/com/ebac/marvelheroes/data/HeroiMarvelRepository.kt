package com.ebac.marvelheroes.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HeroiMarvelRepository {
    private var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://gateway.marvel.com:443")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    companion object{
        val KEY = "c53c99c94574682d669f0ce43e8245f0"
        val TIMESTAMP = "1660260465"
        val HASH = "bee33d3b319b89984bc9659155709c33"
    }
}