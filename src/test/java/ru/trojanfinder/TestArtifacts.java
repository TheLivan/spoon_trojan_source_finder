package ru.trojanfinder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestArtifacts {

    @Test
    void testArtifact1() {
        List<String> analyzeMessages = new Main().analyzeSources("./src/test/resources/CommentingOut.java");
        assertTrue(analyzeMessages.size() == 1);
    }
}
