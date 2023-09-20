package com.xwj.desgin.pattern.behavior.responsibility.allexe.impl;

import com.xwj.desgin.pattern.behavior.responsibility.allexe.Duty;
import com.xwj.desgin.pattern.behavior.responsibility.allexe.IHandler;

/**
 * Filename:    EncryptChainHandler.java
 * Description:
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2023/9/19 17:45
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2023/9/19   xwenjun  1.0 Version
 */
@Duty(type = "Login", order = 2)
public class EncryptChainHandler implements IHandler<String, String> {
    @Override
    public String handle(String s) {
        System.out.println("开始加密。");
        return "加密";
    }
}
