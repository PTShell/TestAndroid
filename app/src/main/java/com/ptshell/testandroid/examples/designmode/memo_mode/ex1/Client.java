package com.ptshell.testandroid.examples.designmode.memo_mode.ex1;

public class Client {
    public void test() {
        System.out.println("首次进入游戏");
        Game game = new Game();
        game.play();//玩游戏
        Memento memento = game.createMemento();//创建存档
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);//保存存档
        game.exit();//退出游戏

        System.out.println("-------------");
        System.out.println("二次进入游戏");
        Game secondGame = new Game();
        secondGame.setMemento(caretaker.getMemento());//读取存档
        secondGame.play();//继续玩游戏
        secondGame.exit();//不存档,嘿嘿嘿

    }
}
