package com.ransoft.androidanimation.ui.propertyanimation.animatorset

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.opengl.ETC1.getHeight
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.view.animation.DecelerateInterpolator
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ransoft.androidanimation.R
import kotlinx.android.synthetic.main.animator_set_fragment.*


class AnimatorSetFragment : Fragment() {

    companion object {
        fun newInstance() = AnimatorSetFragment()
    }

    private lateinit var viewModel: AnimatorSetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.animator_set_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AnimatorSetViewModel::class.java)
        // TODO: Use the ViewModel
        // https://android.googlesource.com/platform/development/+/master/samples/ApiDemos/src/com/example/android/apis/animation/BouncingBalls.java

        val bouncer = AnimatorSet().apply {
            //play(boun)
        }
        val fadeAnim = ObjectAnimator.ofFloat(iv_image, "alpha", 1f, 0f).apply {
            duration = 250
        }
        AnimatorSet().apply {
            play(bouncer).before(fadeAnim)
            start()
        }
    }
}