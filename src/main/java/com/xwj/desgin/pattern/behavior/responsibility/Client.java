package com.xwj.desgin.pattern.behavior.responsibility;

import com.xwj.desgin.pattern.behavior.responsibility.impl.EncryptChainHandler;
import com.xwj.desgin.pattern.behavior.responsibility.impl.RequestChainHandler;
import com.xwj.desgin.pattern.behavior.responsibility.impl.SignChainHandler;

import java.util.ArrayList;
import java.util.List;

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

        List<IHandler<String, String>> handlerList = new ArrayList<>();
        RequestChainHandler requestChainHandler = new RequestChainHandler();
        handlerList.add(requestChainHandler);
        EncryptChainHandler encryptChainHandler = new EncryptChainHandler();
        handlerList.add(encryptChainHandler);
        SignChainHandler signChainHandler = new SignChainHandler();
        handlerList.add(signChainHandler);

        HandlerChainManager<String, String> handlerChainManager = new HandlerChainManager<>();
        handlerChainManager.initHandlerMap(handlerList);

        String res = handlerChainManager.executeHandle("Login", "start");
        System.out.println(res);
    }
}
