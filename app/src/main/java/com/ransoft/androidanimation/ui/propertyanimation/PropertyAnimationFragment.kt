package com.ransoft.androidanimation.ui.propertyanimation

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ransoft.androidanimation.R

class PropertyAnimationFragment : Fragment() {

    companion object {
        fun newInstance() = PropertyAnimationFragment()
    }

    private lateinit var viewModel: PropertyAnimationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.property_animation_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PropertyAnimationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}