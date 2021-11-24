package com.ptshell.testandroid.examples.designmode.visitor_mode.ex1;

/**
 * 实现抽象访问者中的方法，即对每一个元素都有其具体的访问行为。下面以闲人和忙人为例：
 */
public class Idler implements Visitor {//闲人

    private String name;

    public Idler(String name) {
        this.name = name;
    }

    @Override
    public void visit(Music music) {
        System.out.println(name + "浏览音乐网站：" + music.getName());
        music.playMusic();
    }

    @Override
    public void visit(Video video) {
        System.out.println(name + "浏览视频网站：" + video.getName());
        video.playVideo();
    }
}
