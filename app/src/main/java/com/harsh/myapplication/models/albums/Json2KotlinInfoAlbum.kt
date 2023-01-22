package com.harsh.myapplication.models.albums

import com.google.gson.annotations.SerializedName
import com.harsh.myapplication.models.albums.AlbumInfo


data class Json2KotlinInfoAlbum (

    @SerializedName("album" ) var albumInfo : AlbumInfo? = AlbumInfo()

)
