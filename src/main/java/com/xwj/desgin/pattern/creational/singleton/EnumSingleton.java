package com.xwj.desgin.pattern.creational.singleton;

public enum EnumSingleton {

    INSTANCE;

    private String bankName;
    private String bankNumber;

    // 私有构造函数，在枚举创建时初始化银行名称和银行号
    private EnumSingleton() {
        this.bankName = "My Bank";
        this.bankNumber = "12345";
    }

    // 获取银行名称
    public String getBankName() {
        return bankName;
    }

    // 获取银行号
    public String getBankNumber() {
        return bankNumber;
    }

    public String doSomething() {
        System.out.println(this.bankName);
        System.out.println(this.bankNumber);
        return "支付成功";
    }

}
