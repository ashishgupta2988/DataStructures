package com.practice.array.Extras;

import java.util.HashMap;

public class StringTest {

//    public static void main(String[] args) {
//
//
//        Runtime rt = Runtime.getRuntime();
//        long prevTotal = 0;
//        long prevFree = rt.freeMemory();
//
//        for (int i = 0; i < 200000; i++) {
//            long total = rt.totalMemory();
//            long free = rt.freeMemory();
//            if (total != prevTotal || free != prevFree) {
//                long used = total - free;
//                long prevUsed = (prevTotal - prevFree);
//                System.out.println(
//                        "#" + i +
//                                ", Total: " + total +
//                                ", Used: " + used +
//                                ", ∆Used: " + (used - prevUsed) +
//                                ", Free: " + free +
//                                ", ∆Free: " + (free - prevFree));
//                prevTotal = total;
//                prevFree = free;
//            }
//            String test = new String("Ashish");
//        }
//    }

    public static void main(String[] args) throws  Exception{

        System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        for (int i = 0; i < 200000; i++) {
            String test = new String("Ashish");
        }
        Thread.sleep(1000);
        System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        Thread.sleep(2000);
    }
}
