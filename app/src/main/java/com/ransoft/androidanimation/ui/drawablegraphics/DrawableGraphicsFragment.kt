package com.ransoft.androidanimation.ui.drawablegraphics

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.ransoft.androidanimation.R
import com.ransoft.androidanimation.ui.propertyanimation.PropertyAnimationFragmentDirections
import kotlinx.android.synthetic.main.drawable_graphics_fragment.*

class DrawableGraphicsFragment : Fragment() {

    companion object {
        fun newInstance() = DrawableGraphicsFragment()
    }

    private lateinit var viewModel: DrawableGraphicsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.drawable_graphics_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DrawableGraphicsViewModel::class.java)
        // TODO: Use the ViewModel

        btn_animate_drawable.setOnClickListener {
            val action = DrawableGraphicsFragmentDirections.actionGoToAnimateDrawable()
            Navigation.findNavController(it).navigate(action)
        }

        btn_animate_vector_drawable.setOnClickListener {
            val action = DrawableGraphicsFragmentDirections.actionGoToAnimateVectorDrawable()
            Navigation.findNavController(it).navigate(action)
        }
    }

}