package com.company;

import java.util.*;


public class Graph {
    //Iterator ite;
    private int numVertices;
    private LinkedList<Integer> adjLists[];
    private boolean visited[];
    private String str = "";

    public Graph(int vertices) {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    public void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    public void addArrayEdges(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                this.addEdge(i, array[i][j]);
            }
        }
    }

    public String depthFirstSearch(int vertex) {
        visited[vertex] = true;

        str += vertex + " ";
        System.out.print(vertex + " ");


        Iterator ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = (int) ite.next();
            if (adj < 0) {
                throw new ArrayIndexOutOfBoundsException();
            } else if (adj > adjLists.length-1) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (!visited[adj])
                depthFirstSearch(adj);
            else
                str += adj + "v ";
        }
        return str.trim();
    }
}