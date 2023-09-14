package com.xwj.desgin.pattern.behavior.responsibility.duty;

import java.util.List;
import java.util.Map;

/**
 * Filename:    HandlerChainManager.java
 * Description:
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2022/12/9 11:52
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2022/12/9   xwenjun  1.0 Version
 */
public class HandlerChainManager<T, R> {
    /**
     * key - @Duty的type，业务线
     * value - 对应的责任链
     */
    private Map<String, List<IHandler<T, R>>> handlerMap;

    public void setHandlerMap(List<IHandler<T, R>> handlers){
        handlers.stream()
                .sorted();
    }
}
