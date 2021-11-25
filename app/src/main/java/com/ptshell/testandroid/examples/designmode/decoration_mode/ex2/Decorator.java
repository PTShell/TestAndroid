package com.ptshell.testandroid.examples.designmode.decoration_mode.ex2;

// 抽象装饰者
public abstract class Decorator extends Component {
    private Component component;// 持有一个 Component 对象的引用        

    /**
     * 必要的构造方法，需要一个 Component 类型的对象
     *
     * @param component Component 对象
     */
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}