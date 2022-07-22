package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then() {
    int left = 1;
    int right = 2;
    int result = Max.max(left , right);
    int expected = 2;
        Assert.assertEquals(result , expected);
    }
    @Test
    public void whenMax2To5Then() {
        int left = 2;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax7To7Then() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}