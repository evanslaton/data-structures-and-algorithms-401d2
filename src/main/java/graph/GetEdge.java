package graph;

import java.util.HashSet;

public class GetEdge {
    public static String getEdge(Graph graph, String[] cities) {
        // Returns false if the graph and/or cities array is/are empty
        if (cities.length <= 0 || graph.vertices.size() == 0) return "False, $0";

        // Variable declarations
        Node currentCity = null;
        HashSet<Edge> neighbors;
        int cost = 0;
        boolean hasDirectFlight = false;

        // Sets currentCity to the node that has the first city as its value
        for (Node n : (HashSet<Node>) graph.vertices) {
            if (cities[0] == n.value) {
                currentCity = n;
            }
        }

        // If the city is not in the graph, returns negative message
        if (currentCity == null) return "False, $0";

        // Loops through the currentCity's neighbors to see if there is the next city in the array is a neighbor
        for (int i = 1; i < cities.length; i++) {
            neighbors = currentCity.neighbors;
            for (Edge e : neighbors) {
                if (e.end.value == cities[i]) {
                    cost+= (int) e.weight;
                    currentCity = e.end;
                    hasDirectFlight = true;
                }
            }

            // Checks to see if there was a direct flight
            if (hasDirectFlight) {
                hasDirectFlight = false;
            } else {
                return "False, $0";
            }
        }
        return "True, $" + cost;
    }
}
