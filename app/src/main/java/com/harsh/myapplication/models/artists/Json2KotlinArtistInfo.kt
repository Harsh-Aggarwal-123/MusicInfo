package com.harsh.myapplication.models.artists

import com.google.gson.annotations.SerializedName
import com.harsh.myapplication.models.artists.ArtistsDataClass

data class Json2KotlinArtistInfo (

    @SerializedName("artist" ) var artistDataClass : ArtistsDataClass? = ArtistsDataClass()

)
