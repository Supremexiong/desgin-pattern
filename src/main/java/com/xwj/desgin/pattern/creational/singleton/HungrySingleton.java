package com.xwj.desgin.pattern.creational.singleton;

/**
 * Filename:    HungrySingleton.java
 * Description: 饿汉式
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2023/10/10 21:06
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2023/10/10   xwenjun  1.0 Version
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){
        // 防止通过反射创建对象破坏单例
        if (INSTANCE != null){
            throw new RuntimeException("非法创建对象。");
        }
        System.out.println("创建单例模式处理逻辑。。。");
    }

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }

}
