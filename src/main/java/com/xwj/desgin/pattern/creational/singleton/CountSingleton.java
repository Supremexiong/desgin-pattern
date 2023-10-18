package com.xwj.desgin.pattern.creational.singleton;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Filename:    CountSingleton.java
 * Description: 计数单例
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2023/10/16 18:19
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2023/10/16   xwenjun  1.0 Version
 */
public class CountSingleton {

    @Getter
    private String name;

    private static int maxNum = 2;

    private static List<CountSingleton> singletonList = new ArrayList<>();

    private static int currentNum = 0;

    private CountSingleton(){

    }

    private CountSingleton(String name){
        this.name = name;
    }

    static {
        for (int i = 0; i < maxNum; i++) {
            singletonList.add(new CountSingleton("单例：" + i));
        }
    }

    public static CountSingleton getInstance(){
        Random random = new Random();
        currentNum = random.nextInt(maxNum);
        return singletonList.get(currentNum);
    }

}
