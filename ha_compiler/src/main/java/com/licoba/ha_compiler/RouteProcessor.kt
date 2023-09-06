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
        println("RouteProcessor 初始化")
    }

    override fun process(
        annotations: MutableSet<out TypeElement>,
        roundEnv: RoundEnvironment
    ): Boolean {
        logger.n("RouteProcessor 开始处理了")
        println("RouteProcessor 开始处理了")
        return true
    }

    // 只处理使用 @Route 的注解，其它注解不会处理
    override fun getSupportedAnnotationTypes() = mutableSetOf(Route::class.java.canonicalName)


}
