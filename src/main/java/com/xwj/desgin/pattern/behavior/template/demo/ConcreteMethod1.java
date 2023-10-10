package com.xwj.desgin.pattern.behavior.template.demo;

/**
 * Filename:    ConcreteMethod1.java
 * Description: 具体实现类1
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
public class ConcreteMethod1 extends AbstractTemplate{
    @Override
    protected void doSomething1() {
        System.out.println("im method1 do something 1");
    }

    @Override
    protected void doSomething2() {
        System.out.println("im method1 do something 2");
    }

    // 覆写父类的方法，从而实现不执行doSomething2，而实现类2不需要改动
    @Override
    protected boolean isExecuteDoSomething2() {
        return false;
    }
}
