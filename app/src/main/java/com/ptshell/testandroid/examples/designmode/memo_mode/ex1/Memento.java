package com.ptshell.testandroid.examples.designmode.memo_mode.ex1;

/**
 * 负责将游戏类的内部状态存储起来：
 */
public class Memento {//备忘录类
    public int level;//等级
    public int coin;//金币数量

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getLevel() {
        return level;
    }

    public int getCoin() {
        return coin;
    }
}