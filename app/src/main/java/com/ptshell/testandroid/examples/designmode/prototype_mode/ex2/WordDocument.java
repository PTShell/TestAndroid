package com.ptshell.testandroid.examples.designmode.prototype_mode.ex2;

import java.util.ArrayList;

/**
 * 文档类型，扮演的是ConcretePrototype角色，而cloneable是代表prototype角色
 */
public class WordDocument implements Cloneable {
    //文本
    private String mText;
    //图片名列表
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument() {
        System.out.println("-------- WordDocument构造函数 --------");
    }

    public String getText() {
        return this.mText;
    }

    public void setText(String text) {
        this.mText = text;
    }

    public ArrayList<String> getImages() {
        return this.mImages;
    }

    public void setImages(ArrayList<String> images) {
        this.mImages = images;
    }

    public void addImage(String img) {
        this.mImages.add(img);
    }

    /**
     * 打印文档
     */
    public void showDocument() {
        System.out.println("-------- Word Content Start --------");
        System.out.println("Text : " + this.mText);
        System.out.println("Images List : ");
        for (String image : mImages) {
            System.out.println("image name : " + image);
        }
        System.out.println("-------- Word Content End --------");
    }

    //浅拷贝
    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            doc.mImages = this.mImages;
            return doc;
        } catch (Exception e) {
        }
        return null;
    }
    //深拷贝
//    @Override
//    protected WordDocument clone(){
//        try{
//            WordDocument doc = (WordDocument)super.clone();
//            doc.mText = this.mText;
//            //对mImages对象也调用clone()函数，进行深拷贝
//            doc.mImages = (ArrayList<String>)this.mImages.clone();
//            return doc;
//        }catch(Exception e){}
//        return null;
//    }
}