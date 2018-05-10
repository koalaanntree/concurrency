package com.sam.concurrency.example.atomic;

import com.sam.concurrency.annoations.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: huangxin
 * @Date: Created in 上午10:29 2018/5/10
 * @Description:
 */
@Slf4j
@ThreadSafe
public class AtomicExample5 {

    /**
     * 有volatile和非static修饰
     */
    private static AtomicIntegerFieldUpdater<AtomicExample5> updater =
            AtomicIntegerFieldUpdater.newUpdater(AtomicExample5.class, "count");

    @Getter
    public volatile int count = 100;


    public static void main(String[] args) {

        AtomicExample5 example5 = new AtomicExample5();

        if (updater.compareAndSet(example5, 100, 120)) {
            log.info("update success1,{}",example5.getCount());
        }

        if (updater.compareAndSet(example5, 100, 120)) {
            log.info("update success2,{}", example5.getCount());
        } else {
            log.info("update failed2,{}", example5.getCount());
        }

    }
}
