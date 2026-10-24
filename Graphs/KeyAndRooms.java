package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyAndRooms {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1,0,0));
        rooms.add(Arrays.asList(0,1,0));
        rooms.add(Arrays.asList(0,0,1));
//        rooms.add(List.of(0));

        System.out.println(canVisitAllRooms(rooms));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(0, rooms, visited);
        System.out.println("visted array "+ Arrays.toString(visited));

        for (boolean i : visited) {
            if (!i) return false;
        }
        return true;
    }

    public static void dfs(int i, List<List<Integer>> rooms, boolean[] visited) {
        if (visited[i]) return;
        visited[i] = true;
        for (int key : rooms.get(i)) {
            dfs(key, rooms, visited);
        }
    }
}
