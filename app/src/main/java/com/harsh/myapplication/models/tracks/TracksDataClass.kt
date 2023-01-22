package com.harsh.myapplication.models.tracks

import com.google.gson.annotations.SerializedName
import com.harsh.myapplication.models.tracks.TrackArtist
import com.harsh.myapplication.models.tracks.TrackImage

data class TracksDataClass (

    @SerializedName("name") var name       : String?          = null,
    @SerializedName("duration") var duration   : String?          = null,
    @SerializedName("mbid") var mbid       : String?          = null,
    @SerializedName("url") var url        : String?          = null,
//    @SerializedName("streamable" ) var streamable : Streamable?      = Streamable(),
    @SerializedName("artist") var artist     : TrackArtist?          = TrackArtist(),
    @SerializedName("image") var image      : ArrayList<TrackImage> = arrayListOf(),
//    @SerializedName("@attr"      ) var @attr      : @attr?           = @attr()

)