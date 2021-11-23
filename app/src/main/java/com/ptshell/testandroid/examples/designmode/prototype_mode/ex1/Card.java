package com.ptshell.testandroid.examples.designmode.prototype_mode.ex1;

//具体原型类,卡片类
public class Card implements Cloneable {//实现Cloneable接口，Cloneable只是标识接口
    private int num;//卡号

    private Spec spec = new Spec();//卡规格

    public Card() {
        System.out.println("Card 执行构造函数");
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSpec(int length, int width) {
        spec.setLength(length);
        spec.setWidth(width);
    }

    @Override
    public String toString() {
        return "Card{" +
                "num=" + num +
                ", spec=" + spec +
                '}';
    }

    @Override
    protected Card clone() throws CloneNotSupportedException {//重写clone()方法，clone()方法不是Cloneable接口里面的，而是Object里面的
        System.out.println("clone时不执行构造函数");
        return (Card) super.clone();
    }
}
