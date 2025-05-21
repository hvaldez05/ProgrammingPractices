package edu.ceu.programming.practices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Graph<V> {
    // Adjacency list
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    /**
     * Adds the vertex `v` to the graph.
     *
     * @param v the vertex to be added.
     * @return `true` if it wasn't already present, `false` otherwise.
     */
    public boolean addVertex(V v) {
        if (!adjacencyList.containsKey(v)) {
            adjacencyList.put(v, new HashSet<>());
            return true;
        }
        return false;
    }

    /**
     * Adds a directed edge from vertex `v1` to vertex `v2`.
     * If either vertex does not exist in the graph, it should be added as well.
     *
     * @param v1 the source vertex.
     * @param v2 the destination vertex.
     * @return `true` if the edge didn't previously exist, `false` otherwise.
     */
    public boolean addEdge(V v1, V v2) {
        addVertex(v1);
        addVertex(v2);
        return adjacencyList.get(v1).add(v2);
    }

    /**
     * Retrieves the set of adjacent vertices to `v`.
     *
     * @param v the vertex whose adjacents are requested.
     * @return a set of adjacent vertices.
     * @throws Exception if the vertex does not exist.
     */
    public Set<V> getAdjacents(V v) throws Exception {
        if (!adjacencyList.containsKey(v)) {
            throw new Exception("Vertex does not exist: " + v);
        }
        return adjacencyList.get(v);
    }

    /**
     * Checks whether the graph contains the specified vertex.
     *
     * @param v the vertex to check.
     * @return `true` if the vertex is part of the graph.
     */
    public boolean containsVertex(V v) {
        return adjacencyList.containsKey(v);
    }

    /**
     * Returns a string representation of the graph's adjacency list.
     *
     * @return a string showing the adjacency list.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<V, Set<V>> entry : adjacencyList.entrySet()) {
            sb.append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    /**
     * Computes, if it exists, the shortest path between `v1` and `v2`.
     * If no path exists, return `null`.
     *
     * @param v1 the source vertex.
     * @param v2 the destination vertex.
     * @return a list containing the sequence of vertices in the shortest path.
     */
    public List<V> shortestPath(V v1, V v2) {
        if (!adjacencyList.containsKey(v1) || !adjacencyList.containsKey(v2)) {
            return null;
        }

        Queue<List<V>> queue = new LinkedList<>();
        Set<V> visited = new HashSet<>();

        List<V> startPath = new ArrayList<>();
        startPath.add(v1);
        queue.add(startPath);

        while (!queue.isEmpty()) {
            List<V> path = queue.poll();
            V last = path.get(path.size() - 1);

            if (last.equals(v2)) {
                return path;
            }

            if (!visited.contains(last)) {
                visited.add(last);
                for (V neighbor : adjacencyList.get(last)) {
                    List<V> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    queue.add(newPath);
                }
            }
        }

        return null; // No path found
    }
}
