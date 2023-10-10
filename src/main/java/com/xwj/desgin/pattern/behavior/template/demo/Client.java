package com.xwj.desgin.pattern.behavior.template.demo;

/**
 * Filename:    Client.java
 * Description:
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2023/9/20 18:36
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2023/9/20   xwenjun  1.0 Version
 */
public class Client {

    public static void main(String[] args) {
        AbstractTemplate template1 = new ConcreteMethod1();
        AbstractTemplate template2 = new ConcreteMethod2();

        // 调用模板方法
        template1.templateMethod();
        template2.templateMethod();

    }
}
