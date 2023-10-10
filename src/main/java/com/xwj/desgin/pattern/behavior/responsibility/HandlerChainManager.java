package com.xwj.desgin.pattern.behavior.responsibility;

import cn.hutool.core.collection.CollectionUtil;
import org.springframework.core.annotation.AnnotationUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    /**
    * 设置存储所有责任链的map
    * @param
    *
    * @return
    * <br>-----------------------------------------------------<br>
    *
    * @author: xwenjun
    * @date: 2023/9/19 11:12
    */
    public void initHandlerMap(List<IHandler<T, R>> handlers){
         handlerMap = handlers.stream().sorted(Comparator.comparingInt(handler -> AnnotationUtils.findAnnotation(handler.getClass(), Duty.class).order()))
                .collect(Collectors.groupingBy(handler -> AnnotationUtils.findAnnotation(handler.getClass(), Duty.class).type()));
    }

    public R executeHandle(String type, T t){
        List<IHandler<T, R>> handlers = handlerMap.get(type);
        R r = null;
        if (CollectionUtil.isNotEmpty(handlers)){
            for (IHandler<T, R> handler : handlers) {
                r = handler.handle(t);
            }
        }
        return r;
    }

}
