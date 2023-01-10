package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Swea1238 {
    static class Node {
        int from;
        int to;
        int level;

    public Node(int from, int to) {
        super();
        this.from = from;
        this.to = to;
    }

    public Node(int from, int to, int level) {
        super();
        this.from = from;
        this.to = to;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            Node pt = (Node) obj;
            return this.hashCode() == pt.hashCode();
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return (this.from + " " + this.to).hashCode();
    }
}

static Set<Node> set;
static int N, start;
static List<Integer> visited;
static List<Integer> levels;
static int maxLevel;

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = 10;
    for (int t = 0; t < T; ++t) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        set = new HashSet<>();
        N = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N / 2; i++) {
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            set.add(new Node(from, to));
        } // end of reading

        bfs(t);
    }

}

private static void bfs(int t) {
    visited = new ArrayList<Integer>();
    levels = new ArrayList<Integer>();
    Queue<Node> que = new LinkedList<Node>();
    Iterator<Node> it = set.iterator();
    maxLevel = Integer.MIN_VALUE;
    while (it.hasNext()) {
        Node n = it.next();
        if (n.from == start) {
            que.offer(new Node(n.from, n.to, 0));
            maxLevel = 0;
            levels.add(n.to);
//                visited.add(n.to);
            }
        }
        visited.add(start);
        while (!que.isEmpty()) {
//            int sz=que.size();
            Node cur = que.poll();
            int from = cur.from;
            int to = cur.to;
            if (check(to)) {
                visited.add(to);
                Iterator<Node> it2 = set.iterator();
                while (it2.hasNext()) {
                    Node n = it2.next();
                    if (n.from == to && check(n.to)) {
                        Node tmp = new Node(to, n.to, cur.level + 1);
                        que.offer(tmp);
                        visited.add(tmp.from);
                        if (tmp.level > maxLevel) {
                            maxLevel = tmp.level;

                            System.out.println(tmp.level);
                            System.out.println(Arrays.toString(levels.toArray()));
                            levels.clear();
                        }
                        levels.add(n.to);
                    }
                }
            }

    }
    int result = 0;
    for (int i = 0; i < levels.size(); i++) {
        result = Math.max(levels.get(i), result);
    }
    System.out.printf("#%d %d\n", t + 1, result);
//        System.out.println(Arrays.toString(levels.toArray()));
    }

private static boolean check(int to) {
    for (int i = 0; i < visited.size(); i++) {
        if (visited.get(i) == to) {
            return false;
        }
    }
    return true;
}
}
