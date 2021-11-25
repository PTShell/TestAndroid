package com.ptshell.testandroid.examples.designmode.combination_mode.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * 透明的组合模式具体枝干节点：定义有子节点的那些枝干节点的行为，存储子节点
 */
public class Composite extends Component {
    /*
     * 存储节点的容器
     */
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if (components != null) {
            for (Component component : components) {
                component.doSomething();
            }
        }
    }

    @Override
    public void addChild(Component child) {
        components.add(child);
    }

    @Override
    public void removeChild(Component child) {
        components.remove(child);
    }

    @Override
    public Component getChildren(int index) {
        return components.get(index);
    }
}