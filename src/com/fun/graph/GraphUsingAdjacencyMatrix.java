package com.fun.graph;

public class GraphUsingAdjacencyMatrix
{

    public static void main(String[] args)
    {
        Graph g1 = new Graph(7, false);
        int[] u = { 0,
                    2,
                    4,
                    5 };
        int[] v = { 1,
                    3,
                    2,
                    6 };
        g1.addEdges(u, v);
        g1.print();
    }

}


class Graph
{

    private int count;
    private boolean[][] adjMat;
    boolean isDirected;

    Graph(int a,
          boolean flag)
    {
        this.count = a;
        adjMat = new boolean[a][a];
        isDirected = flag;
    }

    boolean addEdges(int[] u,
                     int[] v)
    {
        if (!(u.length == v.length && v.length < count))
        {
            return false;
        }
        for (int i = 0; i < u.length; ++i)
        {
            addEdge(u[i], v[i]);
        }
        return true;
    }

    void addEdge(int u,
                 int v)
    {
        adjMat[u][v] = true;
        if (isDirected)
        {
            adjMat[v][u] = true;
        }
    }

    boolean isConnected(int u,
                        int v)
    {
        return adjMat[u][v];
    }

    void print()
    {
        for (int i = 0; i < count; ++i)
        {
            for (int j = 0; j < count; ++j)
            {
                if (isConnected(i, j))
                {
                    System.out.println(i + " @------@ " + j);
                }
            }
        }
    }
}