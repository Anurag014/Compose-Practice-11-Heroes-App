package com.example.cp11heroesmaterial.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val imageId: Int
)
