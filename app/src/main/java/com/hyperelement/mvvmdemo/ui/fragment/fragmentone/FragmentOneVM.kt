package com.hyperelement.mvvmdemo.ui.fragment.fragmentone

import com.hyperelement.mvvmdemo.data.repository.FragmentOneRepository
import com.hyperelement.mvvmdemo.utilities.RootViewModel

private const val TAG = "FragmentOneViewModel"

class FragmentOneViewModel(
    private val fragmentOneRepository: FragmentOneRepository
) : RootViewModel() {
    val Str = "Printed"
}