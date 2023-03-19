package com.example.template;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.template.utils.Barsic;

public class MyUnitTests {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void count() {
        Barsic barsic = new Barsic();
        assertEquals(101, barsic.count());
    }
    @Test
    public void amount() {
        Barsic barsic = new Barsic();
        assertEquals(201, barsic.amount());
    }
    @Test
    public void quantity() {
        Barsic barsic = new Barsic();
        assertEquals(301, barsic.quantity());
    }
}