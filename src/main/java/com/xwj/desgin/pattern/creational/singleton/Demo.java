package com.xwj.desgin.pattern.creational.singleton;

/**
 * Filename:    Demo.java
 * Description:
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2023/10/16 15:45
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2023/10/16   xwenjun  1.0 Version
 */
public class Demo {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            CountSingleton instance = CountSingleton.getInstance();
            System.out.println("第" + i + "次，获取到了：" + instance.getName());
        }
    }
}
