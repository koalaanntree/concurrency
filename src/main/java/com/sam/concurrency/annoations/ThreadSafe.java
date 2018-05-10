package com.sam.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标志性注解
 * 用来标记线程安全的类或者写法
 * @Author: huangxin
 * @Date: Created in 上午9:53 2018/5/10
 * @Description:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadSafe {

    String value() default "";

}
