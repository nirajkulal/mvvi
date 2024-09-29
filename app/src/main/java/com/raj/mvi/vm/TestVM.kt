package com.raj.mvi.vm

import com.raj.mylibrary.MviEffect
import com.raj.mylibrary.MviEvent
import com.raj.mylibrary.MviState
import com.raj.mylibrary.MviViewModel

class TestVM : MviViewModel<ViewState, ViewEvents, ViewEffect>(ViewState("")) {
    override suspend fun handleEvents(event: ViewEvents) {

    }

    override suspend fun handleEffects(effect: ViewEffect) {
    }
}

data class ViewState(
    var status: String = "",
) : MviState

sealed class ViewEvents : MviEvent {

}

sealed class ViewEffect : MviEffect