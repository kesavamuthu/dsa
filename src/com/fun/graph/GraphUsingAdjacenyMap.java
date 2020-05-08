package com.fun.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

class GraphUsingAdjacenyMap
{

    private HashMap<Integer, Boolean> visited = new HashMap<>();
    private HashMap<Integer, LinkedList<Integer>> connectionDetails = new HashMap<>();
    private boolean flag = true;

    void addEdge(int src,
                 int dest)
    {
        if (!visited.containsKey(src))
        {
            visited.put(src, true);
            connectionDetails.put(src, new LinkedList<Integer>());
        }
        if (!visited.containsKey(dest))
        {
            visited.put(dest, true);
            connectionDetails.put(dest, new LinkedList<Integer>());
        }
        connectionDetails.get(src).addFirst(dest);
    }

    int totalVertices()
    {
        return visited.size();
    }

    void printConnectionDetails()
    {
        for (Map.Entry me : connectionDetails.entrySet())
        {
            System.out.print("The source " + me.getKey() + " <-> ");
            LinkedList<Integer> tmp = (LinkedList<Integer>) me.getValue();
            for (int a : tmp)
            {
                System.out.print(a + " <-> ");
            }
            System.out.println();
        }
    }

    void DFS()
    {
        System.out.println();
        Map.Entry mp = visited.entrySet().iterator().next();
        Stack<Integer> st = new Stack<>();
        int tmp = 20;
        if ((Boolean) mp.getValue() == flag)
        {
            st.push((Integer) mp.getKey());
            visited.put((Integer) mp.getKey(), !flag);
        }
        while (!st.isEmpty())
        {
            if (st.peek() != null)
            {
                tmp = st.pop();
            }
            else
            {
                st.pop();
            }
            System.out.print(tmp + " ");
            LinkedList<Integer> ll = connectionDetails.get(tmp);
            for (int i = 0; i < ll.size(); ++i)
            {
                if (visited.get(ll.get(i)) == flag)
                {
                    st.push(ll.get(i));
                    visited.put(ll.get(i), !flag);
                }
            }
        }
        flag = !flag;
    }

    void BFS(int startVertex)
    {
        System.out.println();
        Queue<Integer> q = new LinkedList<>();
        q.add(startVertex);
        visited.put(startVertex, !flag);
        int tmp = startVertex;

        while (!q.isEmpty())
        {
            tmp = q.poll();
            System.out.print(tmp + " ");
            LinkedList<Integer> ll = connectionDetails.get(tmp);
            for (int a : ll)
            {
                if (visited.get(a) == flag)
                {
                    visited.put(a, !flag);
                    q.add(a);
                }
            }
        }
        flag = !flag;
    }

    public static void main(String[] args)
    {
        GraphUsingAdjacenyMap graph = new GraphUsingAdjacenyMap();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 3);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(4, 5);
        graph.printConnectionDetails();
        graph.DFS();
        graph.BFS(0);
    }

}
