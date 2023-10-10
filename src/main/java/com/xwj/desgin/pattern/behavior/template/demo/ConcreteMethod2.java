package com.xwj.desgin.pattern.behavior.template.demo;

/**
 * Filename:    ConcreteMethod1.java
 * Description: 具体实现类2
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2023/9/20 18:34
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2023/9/20   xwenjun  1.0 Version
 */
public class ConcreteMethod2 extends AbstractTemplate{
    @Override
    protected void doSomething1() {
        System.out.println("im method2 do something 1");
    }

    @Override
    protected void doSomething2() {
        System.out.println("im method2 do something 2");
    }
}
