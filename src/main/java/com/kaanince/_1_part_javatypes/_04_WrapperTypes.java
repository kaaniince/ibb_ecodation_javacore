package com.kaanince._1_part_javatypes;

public class _04_WrapperTypes {
    public static void main(String[] args) {
        // PRIMITIVE TYPE
        // Veri değişken isimlerini yazarken;

        // WRAPPER TYPE
        // Primitive Type - Wrapper Typen Arasındaki farklar ?
        /*
        ✅Primitive Type
        Hafızada Stack bölgesinde saklanır.
        Değeri doğrudan bellekte tutulur.
        int num = 10; // Stack bellekte direkt olarak 10 değeri tutulur.

        // Stack
        ✅Wrapper Typen
        Nesne olarak saklanır, yani Heap bellekte tutulur.
        Heap'teki nesnenin referansı Stack bellekte tutulur.
        Daha fazla bellek kullanır ve daha yavaştır.
        Primitive Type: Daha hızlı, bellek verimli, doğrudan Stack’te saklanır.
        Wrapper Type: Nesne tabanlı, metodlarla zengin, koleksiyonlarla çalışabilir ama daha yavaştır.
        Integer num = new Integer(10); // Heap bellekte bir Integer nesnesi oluşturulur, Stack içinde sadece referansı tutulur.
        Integer wrappedNum = Integer.valueOf(300); // Boxing
        int num = wrappedNum.intValue(); // Unboxing


        */
    }
}
