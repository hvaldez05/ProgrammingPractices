package edu.ceu.programming.practices;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class GraphTest {

    @Test
    void shortestPath() {
        // Build the graph
        Graph<Integer> g = new Graph<>();
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(1, 5);
        g.addEdge(5, 4);

        // Expected shortest path from 1 to 4 is [1, 5, 4]
        List<Integer> expectedPath = List.of(1, 5, 4);

        // Check that the returned path matches the expected one
        assertEquals(expectedPath, g.shortestPath(1, 4));
    }
}