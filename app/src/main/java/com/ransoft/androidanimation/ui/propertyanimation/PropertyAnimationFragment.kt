package com.ransoft.androidanimation.ui.propertyanimation

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.ransoft.androidanimation.R
import kotlinx.android.synthetic.main.property_animation_fragment.*

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
        viewModel = ViewModelProvider(this).get(PropertyAnimationViewModel::class.java)
        // TODO: Use the ViewModel

        btn_value_animator.setOnClickListener {
            val action = PropertyAnimationFragmentDirections.actionGoToValueAnimator()
            Navigation.findNavController(it).navigate(action)
        }

        btn_object_animator.setOnClickListener {
            val action = PropertyAnimationFragmentDirections.actionGoToObjectAnimator()
            Navigation.findNavController(it).navigate(action)
        }

        btn_animator_Set.setOnClickListener {
            val action = PropertyAnimationFragmentDirections.actionGoToAnimatorSet()
            Navigation.findNavController(it).navigate(action)
        }
    }
}