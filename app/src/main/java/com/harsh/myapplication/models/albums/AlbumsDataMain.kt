package com.harsh.myapplication.models.albums

import com.google.gson.annotations.SerializedName
import com.harsh.myapplication.models.albums.AlbumDataClass


data class AlbumsDataMain (

    @SerializedName("album") val album : ArrayList<AlbumDataClass> = arrayListOf()
//    @SerializedName("@attr" ) var @attr : @attr?           = @attr()

)
