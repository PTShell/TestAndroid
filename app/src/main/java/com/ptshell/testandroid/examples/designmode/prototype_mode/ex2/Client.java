package com.ptshell.testandroid.examples.designmode.prototype_mode.ex2;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.构建文档对象
        WordDocument originDoc = new WordDocument();
        //2.编辑文档，添加图片等
        originDoc.setText("这是一篇文档");
        originDoc.addImage("图片一");
        originDoc.addImage("图片二");
        originDoc.addImage("图片三");
        originDoc.showDocument();
        //以原始文档为原型，拷贝一份副本
        WordDocument doc2 = originDoc.clone();
        doc2.showDocument();
        //修改文档副本
        doc2.setText("这是修改过的Doc2文本");
        doc2.addImage("这是新添加的图片");
        originDoc.showDocument();
        doc2.showDocument();
    }
}