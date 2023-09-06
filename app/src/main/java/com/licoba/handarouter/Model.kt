package com.licoba.handarouter

import com.licoba.ha_annotation.Encapsulate

@Encapsulate
data class Model(
    val counter: Int,
    val post: String
)