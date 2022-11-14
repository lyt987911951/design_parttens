package com.inev1te.study.designpattern.behavioral.command;

/**
 * 命令模式 发送者->命令->接受者依次注入，接受者为接口，其他需要引用故为抽象类。在具体命令类中调用被命令这的具体方法（即命令做某件事）
 */
public class CommandTest {

    public static void main(String[] args) {
        Sender sender = new ConcreteSender(new ConcreteCommand(new Executor() {
            @Override
            public void exe() {
                System.out.println("custom Executor executing！");
            }
        }));
        sender.send();
    }
}
