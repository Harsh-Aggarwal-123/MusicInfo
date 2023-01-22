package com.harsh.myapplication.fragemnts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.harsh.myapplication.GenreDetailsActivity
import com.harsh.myapplication.databinding.FragmentAlbumsBinding

class Albums : Fragment() {

    private lateinit var mViewModel: AlbumsViewModel
    private lateinit var binding: FragmentAlbumsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAlbumsBinding.inflate(inflater,container,false)

        mViewModel = ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(requireActivity().application)
        )[AlbumsViewModel::class.java]

        val genre=(activity as GenreDetailsActivity?)?.getGenre()
        if (genre != null) {
            genre.name?.let { mViewModel.loadAlbums(it) }
        }
        mViewModel.getAlbums().observe(viewLifecycleOwner) {
            binding.dataList = it }




        return binding.root
    }

}