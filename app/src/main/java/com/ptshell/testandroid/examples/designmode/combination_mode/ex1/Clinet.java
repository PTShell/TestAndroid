package com.ptshell.testandroid.examples.designmode.combination_mode.ex1;

public class Clinet {
    public void test() {
        //创建网站根页面 root
        PageElement root = new Column("网站页面");
        //网站页面添加两个栏目：音乐,视屏;以及一个广告内容。
        PageElement music = new Column("音乐");
        PageElement video = new Column("视屏");
        PageElement ad = new Content("广告");
        root.addPageElement(music);
        root.addPageElement(video);
        root.addPageElement(ad);

        //音乐栏目添加两个子栏目：国语,粤语
        PageElement chineseMusic = new Column("国语");
        PageElement cantoneseMusic = new Column("粤语");
        music.addPageElement(chineseMusic);
        music.addPageElement(cantoneseMusic);

        //国语,粤语栏目添加具体内容
        chineseMusic.addPageElement(new Content("十年.mp3"));
        cantoneseMusic.addPageElement(new Content("明年今日.mp3"));

        //视频栏目添加具体内容
        video.addPageElement(new Content("唐伯虎点秋香.avi"));

        //打印整个页面的内容
        root.print("");
    }
}
