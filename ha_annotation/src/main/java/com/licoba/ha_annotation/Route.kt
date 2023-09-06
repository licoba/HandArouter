package com.licoba.ha_annotation

import kotlin.annotation.Retention
import kotlin.annotation.AnnotationRetention
import kotlin.annotation.Target

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
annotation class Route(
    /**
     * 路由的路径
     */
    val path: String

)
