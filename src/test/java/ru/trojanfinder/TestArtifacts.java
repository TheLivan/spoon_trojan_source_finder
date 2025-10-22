package ru.trojanfinder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestArtifacts {

    @Test
    void testNegative() {
        List<String> analyzeMessages = new Main().analyzeSources("./src/test/resources/Negative.java");
        assertTrue(analyzeMessages.isEmpty());
    }

    @Test
    void testArtifact1() {
        List<String> analyzeMessages = new Main().analyzeSources("./src/test/resources/CommentingOut.java");
        assertTrue(analyzeMessages.size() == 1);
        // code
    }

    @Test
    void testArtifact2() {
        // code
    }

    @Test
    void testArtifact3() {
        // code
    }
}
