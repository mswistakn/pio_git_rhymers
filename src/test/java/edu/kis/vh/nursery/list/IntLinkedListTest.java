package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

    @Test
    public void testPushAndPop() {
        IntLinkedList list = new IntLinkedList();

        Assert.assertTrue(list.isEmpty());

        list.push(2025_06_04);

        Assert.assertFalse(list.isEmpty());

        Assert.assertEquals(2025_06_04, list.top());

        int pop = list.pop();

        Assert.assertEquals(2025_06_04, pop);

        Assert.assertTrue(list.isEmpty());
    }
}
