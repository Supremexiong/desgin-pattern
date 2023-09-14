package com.xwj.desgin.pattern.behavior.responsibility;

import lombok.Data;

/**
 * Filename:    ARequestHandler.java
 * Description:
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2022/12/9 10:08
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2022/12/9   xwenjun  1.0 Version
 */
@Data
public class ARequestHandler extends BaseRequestHandler{
    @Override
    public void doHandler(String param) {
        System.out.println("AHandler do something...");
        if (next != null){
            next.doHandler(param);
        }
    }
}
