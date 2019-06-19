package com.netty;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Ron
 * @date : 2019/1/3 下午3:24
 * @description Copyright (C) 2018 TL.Crop, All Rights Reserved.
 */
public class BusinessThreadPoolUtil {

    private final static ExecutorService executorService = Executors.newCachedThreadPool();

    public final static void submit(Runnable runnable){
        executorService.submit(runnable);
    }

    public final static Future<?> submit(Callable callable){
        return executorService.submit(callable);
    }

}
