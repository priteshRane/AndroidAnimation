package com.ransoft.androidanimation.ui.propertyanimation.objectanimator

import android.animation.ObjectAnimator
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ransoft.androidanimation.R
import kotlinx.android.synthetic.main.object_animator_fragment.*
import kotlinx.coroutines.delay

class ObjectAnimatorFragment : Fragment() {

    companion object {
        fun newInstance() = ObjectAnimatorFragment()
    }

    private lateinit var viewModel: ObjectAnimatorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.object_animator_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ObjectAnimatorViewModel::class.java)
        // TODO: Use the ViewModel

        ObjectAnimator.ofFloat(iv_image, "translationX", 600f).apply {
            duration = 1000
            start()
        }
    }

}