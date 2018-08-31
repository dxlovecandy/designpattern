package com.adapter.pattern;

/**
 * create time:2018/8/31 09:54
 */
public class Client {

    /**
     * 只需简单修改客户端的代码，不需要修改目标接口
     * @param args
     */
    public static void main(String[] args){
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
