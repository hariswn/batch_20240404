package com.tekicons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MySingleton {

    private static volatile MySingleton INSTANCE = new MySingleton();

    private MySingleton() {
        // hide
    }

    public static void main(String[] args) {

    }


}
