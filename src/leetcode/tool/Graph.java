package leetcode.tool;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuhe
 */
public class Graph {

    /**
     * 默认起始下标为0
     * @param input 字符串输入
     * @return 图
     */
    public static Node neighborsToGraph(String input) {
        return neighborsToGraph(input, 0);
    }

    /**
     *
     * @param input 字符串输入
     * @param firstIndex 下标从几开始
     * @return 图
     */
    public static Node neighborsToGraph(String input, int firstIndex) {
        int[][] neighbors = stringToGraphArray(input);
        return neighborsToGraph(neighbors, firstIndex);
    }

    /**
     * 默认起始下标为0
     * @param neighbors 邻接表
     * @return 图
     */
    public static Node neighborsToGraph(int[][] neighbors) {
        // 默认下标从0开始
        return neighborsToGraph(neighbors, 0);
    }

    /**
     *
     * @param neighbors 邻接表
     * @param firstIndex 下标从几开始
     * @return 图
     */
    public static Node neighborsToGraph(int[][] neighbors, int firstIndex) {
        Node[] nodes = new Node[neighbors.length];
        for (int i = firstIndex; i < nodes.length + firstIndex; i++) {
            nodes[i] = new Node(i);
        }
        for (int i = 0; i < neighbors.length; i++) {
            Node n = nodes[i];
            for (int neighbor : neighbors[i]) {
                n.neighbors.add(nodes[neighbor - firstIndex]);
            }
        }
        return nodes[0];
    }

    /**
     *
     * @param input 字符串输入
     * @return 无向图
     */
    public static Node edgesToUndirectedGraph(String input) {
        int[][] edges = stringToGraphArray(input);
        return edgesToUndirectedGraph(edges);
    }

    /**
     *
     * @param edges 边 数组
     * @return 无向图
     */
    public static Node edgesToUndirectedGraph(int[][] edges) {
        Map<Integer, Node> map = new HashMap<>(edges.length);
        for (int[] edge : edges) {
            buildGraph(map, edge);
            map.get(edge[1]).neighbors.add(map.get(edge[0]));
        }
        return map.get(edges[0][0]);
    }

    /**
     *
     * @param input 字符串输入
     * @return 有向图
     */
    public static Node edgesToDirectedGraph(String input) {
        int[][] edges = stringToGraphArray(input);
        return edgesToDirectedGraph(edges);
    }

    /**
     *
     * @param edges 边 数组
     * @return 有向图
     */
    public static Node edgesToDirectedGraph(int[][] edges) {
        Map<Integer, Node> map = new HashMap<>(edges.length);
        for (int[] edge : edges) {
            buildGraph(map, edge);
        }
        return map.get(edges[0][0]);
    }

    /**
     * 字符串处理函数
     * 将输入转换为邻居或边数组
     * @param input 输入
     * @return 邻居或边数组
     */
    private static int[][] stringToGraphArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        // 「邻居」或「边」数组
        String[] parts = input.split("],?");
        int[][] ans = new int[parts.length][];
        for (int i = 0; i < parts.length; i++) {

            String part = parts[i].trim();
            part = part.substring(1);
            String[] key = part.split(",");

            ans[i] = new int[key.length];
            for (int j = 0; j < key.length; j++) {
                ans[i][j] = Integer.parseInt(key[j].trim());
            }
        }
        return  ans;
    }

    private static void buildGraph(Map<Integer, Node> map, int[] edge) {
        if (!map.containsKey(edge[0])) {
            map.put(edge[0], new Node(edge[0]));
        }
        if (!map.containsKey(edge[1])) {
            map.put(edge[1], new Node(edge[1]));
        }
        map.get(edge[0]).neighbors.add(map.get(edge[1]));
    }
}
