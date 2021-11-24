package com.ptshell.testandroid.examples.designmode.visitor_mode.ex2;

import android.util.Log;

public class CTOVisitor implements Visitor {
    private static final String TAG = CTOVisitor.class.getName();

    @Override
   public void visit(Engineer engineer) {
       Log.v(TAG, "engineer:"+ engineer.name + ",codeslines:" + engineer.getCodeLines());
   }

   @Override
   public void visit(Manager manager) {
       Log.v(TAG, "manager:" + manager.name + "productsNumber:" + manager.getProducts());
   }
}
