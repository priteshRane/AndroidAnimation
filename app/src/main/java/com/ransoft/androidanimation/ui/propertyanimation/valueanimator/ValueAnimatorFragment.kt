package com.ransoft.androidanimation.ui.propertyanimation.valueanimator

import android.animation.ValueAnimator
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ransoft.androidanimation.R
import kotlinx.android.synthetic.main.value_animator_fragment.*

class ValueAnimatorFragment : Fragment() {
    private var valueIs = 0

    companion object {
        fun newInstance() = ValueAnimatorFragment()
    }

    private lateinit var viewModel: ValueAnimatorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.value_animator_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ValueAnimatorViewModel::class.java)
        // TODO: Use the ViewModel

        ValueAnimator.ofInt(valueIs, valueIs + 10).apply {
            duration = 1000
            addUpdateListener {
                tv_text.setText(it.getAnimatedValue().toString())
            }
            start()
        }
    }
}