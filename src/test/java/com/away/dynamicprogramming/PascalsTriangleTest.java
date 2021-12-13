package com.away.dynamicprogramming;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author away
 * @date 2021-12-13 17:27
 */
public class PascalsTriangleTest {

    @Test
    public void generate() {
        for (List<Integer> integers : PascalsTriangle.generate(3)) {
            System.out.println(integers);
        }
    }
}