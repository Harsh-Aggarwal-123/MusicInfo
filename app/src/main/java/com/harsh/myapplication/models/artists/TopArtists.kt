package com.harsh.myapplication.models.artists

import com.google.gson.annotations.SerializedName
import com.harsh.myapplication.models.artists.ArtistsDataClass


data class TopArtists (

    @SerializedName("artist" ) var artist : ArrayList<ArtistsDataClass> = arrayListOf()
//    @SerializedName("@attr"  ) var @attr  : @attr?            = @attr()

)
