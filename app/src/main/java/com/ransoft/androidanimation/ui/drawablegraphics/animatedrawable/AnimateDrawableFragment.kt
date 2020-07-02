package com.ransoft.androidanimation.ui.drawablegraphics.animatedrawable

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ransoft.androidanimation.R

class AnimateDrawableFragment : Fragment() {

    companion object {
        fun newInstance() = AnimateDrawableFragment()
    }

    private lateinit var viewModel: AnimateDrawableViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.animate_drawable_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AnimateDrawableViewModel::class.java)
        // TODO: Use the ViewModel
    }

}