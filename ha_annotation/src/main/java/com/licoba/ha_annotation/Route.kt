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
    val path: String,
    /**
     * 将路由节点进行分组，可以实现动态加载
     */
    val group: String = ""
)
