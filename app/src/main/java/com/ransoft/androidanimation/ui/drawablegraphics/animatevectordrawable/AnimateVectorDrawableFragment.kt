package com.ransoft.androidanimation.ui.drawablegraphics.animatevectordrawable

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ransoft.androidanimation.R

class AnimateVectorDrawableFragment : Fragment() {

    companion object {
        fun newInstance() = AnimateVectorDrawableFragment()
    }

    private lateinit var viewModel: AnimateVectorDrawableViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.animate_vector_drawable_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AnimateVectorDrawableViewModel::class.java)
        // TODO: Use the ViewModel
    }

}