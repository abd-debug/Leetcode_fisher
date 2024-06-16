package com.fishercoder;

import com.fishercoder.solutions._3185;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3185Test {
    private static _3185.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3185.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.countCompleteDayPairs(new int[]{12, 12, 30, 24, 24}));
    }

}