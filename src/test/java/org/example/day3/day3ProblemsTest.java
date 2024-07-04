package org.example.day3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Day3ProblemsTest {

    @Test
    void solution_181938() {
        Day3Problems d3 = new Day3Problems();
        int result = d3.solution_181938(2,91);
        assertEquals(364, result);
        assertThat(result, is(364));
    }

    @Test
    void testSolution_181938() {
    }
}