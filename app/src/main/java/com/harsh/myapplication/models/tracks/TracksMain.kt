package com.harsh.myapplication.models.tracks

import com.google.gson.annotations.SerializedName
import com.harsh.myapplication.models.tracks.TracksDataClass

data class TracksMain (

    @SerializedName("track" ) var track : ArrayList<TracksDataClass> = arrayListOf(),
//    @SerializedName("@attr" ) var @attr : @attr?           = @attr()

)
