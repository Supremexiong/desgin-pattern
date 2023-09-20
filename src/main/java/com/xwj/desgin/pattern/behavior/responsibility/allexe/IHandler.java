package com.xwj.desgin.pattern.behavior.responsibility.allexe;

/**
 * Filename:    IHandler.java
 * Description:
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2022/12/9 11:49
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2022/12/9   xwenjun  1.0 Version
 */
public interface IHandler<T,R> {
    R handle(T t);
}
