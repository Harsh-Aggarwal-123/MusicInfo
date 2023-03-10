package com.harsh.myapplication.models.artists

import com.google.gson.annotations.SerializedName

data class ArtistsDataClass (

    @SerializedName("name"       ) var name       : String?          = null,
    @SerializedName("mbid"       ) var mbid       : String?          = null,
    @SerializedName("url"        ) var url        : String?          = null,
    @SerializedName("streamable" ) var streamable : String?          = null,
    @SerializedName("image"      ) var image      : ArrayList<ImageArtist> = arrayListOf(),

    @SerializedName("ontour"     ) var ontour     : String?          = null,
    @SerializedName("stats"      ) var stats      : Stats?           = Stats(),
    @SerializedName("bio"        ) var bio        : Bio?             = Bio()

)