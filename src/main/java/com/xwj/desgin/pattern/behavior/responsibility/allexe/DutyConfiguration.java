package com.xwj.desgin.pattern.behavior.responsibility.allexe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Filename:    DutyConfiguration.java
 * Description:
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2023/9/19 17:49
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2023/9/19   xwenjun  1.0 Version
 */
@Configuration
public class DutyConfiguration {

    @Bean
    public HandlerChainManager newHandlerChainManager(List<IHandler> handlerList){
        HandlerChainManager chainManager = new HandlerChainManager<>();
        chainManager.initHandlerMap(handlerList);
        return chainManager;
    }
}
