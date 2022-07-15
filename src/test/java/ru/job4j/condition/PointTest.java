package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when23to18Then7dot0710() {
        double expected = 7.0710;
        int x1 = 2;
        int x2 = 3;
        int y1 = 1;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to21Then1dot4142() {
        double expected = 1.4142;
        int x1 = 1;
        int x2 = 2;
        int y1 = 2;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to32Then1() {
        double expected = 1;
        int x1 = 2;
        int x2 = 2;
        int y1 = 3;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}