package com.xwj.desgin.pattern.creational.singleton;

/**
 * Filename:    LazySingleton.java
 * Description: 懒汉式
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2023/10/16 14:48
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2023/10/16   xwenjun  1.0 Version
 */
public class LazySingleton {


    public static final class InstanceHolder{
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    public static LazySingleton getInstance(){
        return InstanceHolder.INSTANCE;
    }

    private LazySingleton() {
        if (InstanceHolder.INSTANCE != null){
            throw new RuntimeException("非法创建单例模式。");
        }
    }

    private static LazySingleton INSTANCE = null;

    public static LazySingleton getInstance1() {
        if (INSTANCE == null){
            synchronized (LazySingleton.class){
                // 第二层if用于进来多个线程时不会创建多个实例
                if ( INSTANCE == null ) {
                    INSTANCE = new LazySingleton();
                }
            }
        }

        return INSTANCE;
    }
}
