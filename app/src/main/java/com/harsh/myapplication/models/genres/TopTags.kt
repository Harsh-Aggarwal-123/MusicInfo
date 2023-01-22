package com.harsh.myapplication.models.genres

import com.google.gson.annotations.SerializedName
import com.harsh.myapplication.models.genres.Attr
import com.harsh.myapplication.models.genres.Tag


data class TopTags (

    @SerializedName("@attr") var Attr : Attr?= Attr(),
    @SerializedName("tag") var tag   : ArrayList<Tag> = arrayListOf()

)
