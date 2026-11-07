
package com.example.maven_github_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Gradetest {

    @Test
    void testTotal() {
        assertEquals(225,
            Gradecalc.calculateTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0,
            Gradecalc.calculateAverage(75, 68, 82), 0.001);
    }

    @Test
    void testAGrade() {
        assertEquals("A",
            Gradecalc.calculateGrade(270));
    }

    @Test
    void testBGrade() {
        assertEquals("B",
            Gradecalc.calculateGrade(255));
    }

    @Test
    void testCGrade() {
        assertEquals("C",
            Gradecalc.calculateGrade(225));
    }

    @Test
    void testPass() {
        assertEquals("Pass",
            Gradecalc.calculateGrade(150));
    }

    @Test
    void testFail() {
        assertEquals("Fail",
            Gradecalc.calculateGrade(90));
    }
}
