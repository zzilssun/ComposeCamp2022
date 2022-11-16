package com.codelabs.basicstatecodelab

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

/**
 * Created by Son Aujili on 2022/11/16.
 */
data class WellnessTask(
    val id: Int,
    val label: String,
    val initialChecked: Boolean = false
) {
    var checked by mutableStateOf(initialChecked)
}