package br.com.melol.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        br.com.melol.queue.QueueTest.class,
        br.com.melol.stack.StackTest.class,
        br.com.melol.linkedList.LinkedListTest.class,
        br.com.melol.hashMap.HashMapTest.class
})
public class RunAllTests {
}
