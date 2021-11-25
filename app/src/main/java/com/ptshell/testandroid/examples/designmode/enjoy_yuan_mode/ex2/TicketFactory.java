package com.ptshell.testandroid.examples.designmode.enjoy_yuan_mode.ex2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {
    static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<String, Ticket>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (sTicketMap.containsKey(key)) { // 使用缓存
            return sTicketMap.get(key);
        } else { // 创建对象            
            Ticket ticket = new TrainTicket(from, to);
            sTicketMap.put(key, ticket);
            return ticket;
        }
    }
}