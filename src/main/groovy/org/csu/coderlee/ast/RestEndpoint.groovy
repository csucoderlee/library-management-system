package org.csu.coderlee.ast

import org.codehaus.groovy.transform.GroovyASTTransformationClass

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * @author by bixi.lx
 * @created on 2018 05 18 11:00
 */
@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.TYPE])
@GroovyASTTransformationClass(value = "org.csu.coderlee.ast.RestEndpointASTTransformation")
public @interface RestEndpoint{
    String[] value() default []
}