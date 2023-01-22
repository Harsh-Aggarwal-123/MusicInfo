package com.harsh.myapplication.interfaces

import com.harsh.myapplication.models.genres.Tag

interface IMainActivity {
    fun onGenreClick(tag: Tag)
    fun getAlbumInfo(albumName: String, artistName: String)
    fun getArtistInfo(artistName: String)
    fun getTrackInfo(trackName: String)
}