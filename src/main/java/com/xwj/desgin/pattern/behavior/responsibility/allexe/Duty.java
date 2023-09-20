package com.xwj.desgin.pattern.behavior.responsibility.allexe;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Component
public @interface Duty {
    /** 业务场景 */
    String type() default "";

    /** 执行顺序，越小越前 */
    int order() default 0;
}
