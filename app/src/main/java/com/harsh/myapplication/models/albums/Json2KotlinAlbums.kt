package com.harsh.myapplication.models.albums


import com.google.gson.annotations.SerializedName
import com.harsh.myapplication.models.albums.AlbumsDataMain

data class Json2KotlinAlbums (

    @SerializedName("albums" ) val albumsDataMain : AlbumsDataMain? = AlbumsDataMain()
//    @SerializedName("@attr" ) var  attr : attr?           = attr()


)
