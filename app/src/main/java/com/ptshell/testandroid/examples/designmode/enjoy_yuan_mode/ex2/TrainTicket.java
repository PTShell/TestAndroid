package com.ptshell.testandroid.examples.designmode.enjoy_yuan_mode.ex2;

import java.util.Random;

public class TrainTicket implements Ticket {
    public String from; // 始发地  
    public String to; // 目的地    
    public String bunk; // 铺位       

    TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        int price = new Random().nextInt(300);
        System.out.println("From:" + from + "To:" + to + "Bunk:" + bunk + "Price:" + price);
    }
}