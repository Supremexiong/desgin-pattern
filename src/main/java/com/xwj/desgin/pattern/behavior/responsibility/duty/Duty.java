package com.xwj.desgin.pattern.behavior.responsibility.duty;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Service
public @interface Duty {
    /** 业务场景 */
    String type() default "";

    /** 执行顺序，越小越前 */
    int order() default 0;
}
