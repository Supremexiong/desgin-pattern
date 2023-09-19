package com.xwj.desgin.pattern.behavior.responsibility;

/**
 * Filename:    Client.java
 * Description:
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2022/12/9 9:43
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2022/12/9   xwenjun  1.0 Version
 */
public class Client {
    public static void main(String[] args) {
        ARequestHandler a = new ARequestHandler();
        BRequestHandler b = new BRequestHandler();
        a.next(b);
        a.doHandler("haha");
    }
}
