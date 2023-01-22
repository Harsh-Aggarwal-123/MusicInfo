package com.harsh.myapplication.databindingadapters

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.*
import com.harsh.myapplication.models.albums.AlbumDataClass
import com.harsh.myapplication.models.artists.ArtistsDataClass
import com.harsh.myapplication.models.genres.Tag
import com.harsh.myapplication.models.tracks.TracksDataClass
import com.harsh.myapplication.recyclerview_adapters.AlbumAdapter
import com.harsh.myapplication.recyclerview_adapters.ArtistsAdapter
import com.harsh.myapplication.recyclerview_adapters.GenreAdapter
import com.harsh.myapplication.recyclerview_adapters.TracksAdapter


@BindingAdapter("bindgenrecyclerview")
fun bindGenreRecyclerView(view: RecyclerView, dataList: List<Tag>?) {

    val gridLayoutManager = GridLayoutManager(view.context,3)
    val layoutManager = view.layoutManager
    if (layoutManager == null) {
        view.layoutManager = gridLayoutManager
    }

    view.itemAnimator = DefaultItemAnimator()
//    view.addItemDecoration(DividerItemDecoration(view.context, DividerItemDecoration.VERTICAL))

    view.setHasFixedSize(true)

    var adapter: GenreAdapter? = view.adapter as GenreAdapter?

    if (adapter == null) {
        if (dataList != null) {
            adapter = GenreAdapter(view.context, dataList.toMutableList())
            view.adapter = adapter
        }
    }

    if (dataList != null) {
        adapter?.updateData(dataList)
    }
}


@BindingAdapter("bind_album_recyclerview")
fun bindAlbumRecyclerView(view: RecyclerView, dataList: List<AlbumDataClass>?) {

    val linearLayoutManager = LinearLayoutManager(view.context)
    val layoutManager = view.layoutManager
    if (layoutManager == null) {
        view.layoutManager = linearLayoutManager
    }

    view.itemAnimator = DefaultItemAnimator()
//    view.addItemDecoration(DividerItemDecoration(view.context, DividerItemDecoration.VERTICAL))

    view.setHasFixedSize(true)

    var adapter: AlbumAdapter? = view.adapter as AlbumAdapter?

    if (adapter == null) {
        if (dataList != null) {
            adapter = AlbumAdapter(view.context, dataList.toMutableList())
            view.adapter = adapter
        }
    }

    if (dataList != null) {
        adapter?.updateData(dataList)
    }
}

@BindingAdapter("bind_artist_recyclerview")
fun bindArtistsRecyclerView(view: RecyclerView, dataList: List<ArtistsDataClass>?) {

    val linearLayoutManager = LinearLayoutManager(view.context)
    val layoutManager = view.layoutManager
    if (layoutManager == null) {
        view.layoutManager = linearLayoutManager
    }

    view.itemAnimator = DefaultItemAnimator()
//    view.addItemDecoration(DividerItemDecoration(view.context, DividerItemDecoration.VERTICAL))

    view.setHasFixedSize(true)

    var adapter: ArtistsAdapter? = view.adapter as ArtistsAdapter?

    if (adapter == null) {
        if (dataList != null) {
            adapter = ArtistsAdapter(view.context, dataList.toMutableList())
            view.adapter = adapter
        }
    }

    if (dataList != null) {
        adapter?.updateData(dataList)
    }
}


@BindingAdapter("bind_track_recyclerview")
fun bindTracksRecyclerView(view: RecyclerView, dataList: List<TracksDataClass>?) {

    val linearLayoutManager = LinearLayoutManager(view.context)
    val layoutManager = view.layoutManager
    if (layoutManager == null) {
        view.layoutManager = linearLayoutManager
    }

    view.itemAnimator = DefaultItemAnimator()
//    view.addItemDecoration(DividerItemDecoration(view.context, DividerItemDecoration.VERTICAL))

    view.setHasFixedSize(true)

    var adapter: TracksAdapter? = view.adapter as TracksAdapter?

    if (adapter == null) {
        if (dataList != null) {
            adapter = TracksAdapter(view.context, dataList.toMutableList())
            view.adapter = adapter
        }
    }

    if (dataList != null) {
        adapter?.updateData(dataList)
    }
}


