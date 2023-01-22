package com.harsh.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.harsh.myapplication.databinding.ActivityMainBinding
import com.harsh.myapplication.interfaces.IMainActivity
import com.harsh.myapplication.models.genres.Tag

class MainActivity : AppCompatActivity(), IMainActivity {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        mViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.
        getInstance(this.application))[MainActivityViewModel::class.java]

        mViewModel.loadJSON1()
        binding.expandView.setOnClickListener {
            mViewModel.expand()

        }
        mViewModel.getGenreList().observe(this) {
            binding.dataList = it
        }
    }

    override fun onGenreClick(tag: Tag) {
        //
        val intent:Intent= Intent(this@MainActivity, GenreDetailsActivity::class.java)
        intent.putExtra("genreItem",tag )
        startActivity(intent)
    }

    override fun getAlbumInfo(albumName: String, artistName: String) {
        TODO("Not yet implemented")
    }

    override fun getArtistInfo(artistName: String) {
        TODO("Not yet implemented")
    }

    override fun getTrackInfo(trackName: String) {
        TODO("Not yet implemented")
    }

}