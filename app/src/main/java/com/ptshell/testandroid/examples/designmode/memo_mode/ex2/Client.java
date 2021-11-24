package com.ptshell.testandroid.examples.designmode.memo_mode.ex2;

public class Client {
    public static void main(String[] args) {
        //构建游戏对象
        CallOfDuty game = new CallOfDuty();
        //1.打游戏
        game.play();

        Caretaker caretaker = new Caretaker();
        //2.游戏存档
        caretaker.archive(game.createMemento());
        //3.退出游戏
        game.quit();
        //4.恢复游戏
        CallOfDuty newGame = new CallOfDuty();
        newGame.restore(caretaker.getMemento());
    }
}