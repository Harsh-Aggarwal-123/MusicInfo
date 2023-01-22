package com.harsh.myapplication.api

import com.harsh.myapplication.models.albums.Json2KotlinAlbums
import com.harsh.myapplication.models.albums.Json2KotlinInfoAlbum
import com.harsh.myapplication.models.artists.Json2KotlinArtistInfo
import com.harsh.myapplication.models.artists.Json2KotlinArtists
import com.harsh.myapplication.models.genres.Json2KotlinTopTags
import com.harsh.myapplication.models.tracks.Json2KotlinTracks
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("2.0/")
    fun getTopGenres(@Query("method") method: String,
                     @Query("api_key") api_key: String,
                     @Query("format") format: String): Call<Json2KotlinTopTags?>?

    @GET("2.0/")
    fun getTopAlbums(@Query("method") method: String,
                     @Query("tag") tag:String,
                     @Query("api_key") api_key: String,
                     @Query("format") format: String): Call<Json2KotlinAlbums?>?
    @GET("2.0/")
    fun getTopArtists(@Query("method") method: String,
                 @Query("tag") tag:String,
                 @Query("api_key") api_key: String,
                 @Query("format") format: String): Call<Json2KotlinArtists?>?

    @GET("2.0/")
    fun getTopTracks(@Query("method") method: String,
                  @Query("tag") tag:String,
                  @Query("api_key") api_key: String,
                  @Query("format") format: String): Call<Json2KotlinTracks?>?

    @GET("2.0/")
    fun getAlbumInfo(@Query("method") method: String,
                     @Query("api_key") api_key: String,
                     @Query("artist") artist:String,
                     @Query("album") album:String,
                     @Query("format") format: String): Call<Json2KotlinInfoAlbum?>?

    @GET("2.0/")
    fun getArtistInfo(@Query("method") method: String,
                      @Query("artist") artist:String,
                      @Query("api_key") api_key: String,
                      @Query("format") format: String): Call<Json2KotlinArtistInfo?>?
}
