package com.licoba.ha_compiler

import com.google.auto.service.AutoService
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.element.TypeElement
import com.licoba.ha_annotation.Route
import javax.annotation.processing.ProcessingEnvironment
import javax.annotation.processing.Processor

// 路由的注解处理器
@AutoService(Processor::class)
class RouteProcessor : AbstractProcessor() {

    private val logger by lazy { ProcessorLogger(processingEnv) }

    override fun init(processingEnv: ProcessingEnvironment) {
        super.init(processingEnv)
        logger.n("RouteProcessor 初始化")
    }

    override fun process(p0: MutableSet<out TypeElement>?, p1: RoundEnvironment?): Boolean {
        return true
    }

    // 只处理使用 @Route 的注解
    override fun getSupportedAnnotationTypes() = mutableSetOf(Route::class.java.canonicalName) // 3


}
