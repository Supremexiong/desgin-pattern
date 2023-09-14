package com.xwj.desgin.pattern.behavior.responsibility;

import lombok.Data;

/**
 * Filename:    RequestHandler.java
 * Description:
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2022/12/9 9:47
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2022/12/9   xwenjun  1.0 Version
 */
@Data
public abstract class BaseRequestHandler implements IRequestHandler{

    protected IRequestHandler next;

    public void next(IRequestHandler next){
        this.next = next;
    }

}
