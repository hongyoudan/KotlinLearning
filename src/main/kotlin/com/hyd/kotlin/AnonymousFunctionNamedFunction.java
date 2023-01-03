package com.hyd.kotlin;

/**
 * 对应 19-AnonymousFunction&NamedFunction.kt
 */
public class AnonymousFunctionNamedFunction {

    public void main() {

        /**
         * 匿名输出
         */
        showInfo("lisi", "男", 18, new IShowInfo() {
            @Override
            public void result(String str) {
                System.out.println("匿名输出" + str);
            }
        });

        /**
         * 具名输出
         */
        showInfo("lisi", "男", 18, new ShowInfoImpl());
    }

    void showInfo(String name, String gender, Integer age, IShowInfo iShowInfo) {
        String str = String.format("name:%s gender:%s age:%d", name, gender, age);
        iShowInfo.result(str);
    }
}

class ShowInfoImpl implements IShowInfo {

    @Override
    public void result(String str) {
        System.out.println("具名输出" + str);
    }
}

interface IShowInfo {
    void result(String str);
}
