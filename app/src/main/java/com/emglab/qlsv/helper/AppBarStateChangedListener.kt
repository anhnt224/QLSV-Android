package com.emglab.qlsv.helper

import com.google.android.material.appbar.AppBarLayout


abstract class AppBarStateChangedListener : AppBarLayout.OnOffsetChangedListener {

    private var mCurrentState = State.COLLAPSED

    enum class State {
        EXPANDED,
        COLLAPSED,
        IDLE
    }

    override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
        if (verticalOffset == 0) {
            setCurrentStateAndNotify(appBarLayout, State.EXPANDED)
        } else if (Math.abs(verticalOffset) >= appBarLayout.totalScrollRange) {
            setCurrentStateAndNotify(appBarLayout, State.COLLAPSED)
        } else {
            //setCurrentStateAndNotify(appBarLayout, State.IDLE)
        }
    }

    private fun setCurrentStateAndNotify(appBarLayout: AppBarLayout, state: State) {
        if (mCurrentState != state) {
            onStateChanged(appBarLayout, state)
        }
        mCurrentState = state
    }

    abstract fun onStateChanged(appBarLayout: AppBarLayout, state: State)
}
