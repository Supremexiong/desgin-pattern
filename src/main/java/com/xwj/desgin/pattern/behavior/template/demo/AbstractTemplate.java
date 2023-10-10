package com.xwj.desgin.pattern.behavior.template.demo;

/**
 * Filename:    AbstractTemplate.java
 * Description: 公共模板类
 * Copyright:   Copyright (c) 2016-2022 All Rights Reserved.
 * Company:     yuanmao-soft.com Inc.
 *
 * @author: xwenjun
 * @version: 1.0
 * Create at:   2023/9/20 18:31
 * <p>
 * Modification History:
 * Date          Author      Version     Description
 * ------------------------------------------------------------------
 * 2023/9/20   xwenjun  1.0 Version
 */
public abstract class AbstractTemplate {

    /** 实现细节1 */
    protected  abstract void doSomething1();
    /** 实现细节2 */
    protected  abstract void doSomething2();


    /**
    * 公共方法
    * @param
    *
    * @return
    * <br>-----------------------------------------------------<br>
    *
    * @author: xwenjun
    * @date: 2023/9/20 18:33
    */
    public final void templateMethod(){
        this.doSomething1();
        if (isExecuteDoSomething2()){
            this.doSomething2();
        }
        System.out.println("im template method");
    }

    // 钩子方法，子类如何想要影响父类的执行结果，可以覆写这个方法，不去覆写默认执行，从而实现子类影响父类执行结果的扩展
    protected boolean isExecuteDoSomething2(){
        return true;
    }
}
