package graph;

import java.util.*;


public class DepthFirst {
    public static List<Node> depthFirstPreOrder(Graph graph) {
        List<Node> answer = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node current;

//        answer.add((Node) graph.vertices.iterator().next());
//        stack.push((Node) graph.vertices.iterator().next());
        for (Node n : (HashSet<Node>) graph.vertices) {
            if (!answer.contains(n)) {
                stack.push(n);
                try {
                    while (stack.peek() != null) {
                        current = stack.pop();
                        if (!answer.contains(current)) {
                            answer.add(current);
//                            System.out.println(current.value);
                            for (Edge m : (HashSet<Edge>) current.neighbors) {
//                                System.out.println("eeeeeeee");
                                if (!answer.contains(m.end)) {
                                    stack.push(m.end);
//                                System.out.println(m.end.value);
                                }
                            }
                        }
                    }
                } catch (EmptyStackException e) {
                    // Do nothing
                }
            }
        }
        return answer;
    }
}
