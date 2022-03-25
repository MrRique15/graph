import java.util.*;

class Node {
    private String name;
    private List<Node> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    private Map<Node, Integer> adjacentNodes = new HashMap<>();
    private int number;

    public Node(String name, int num) {
        this.name = name;
        this.number = num;
    }

    public String getName() {
        return name;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }
    
    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setShortestPath(LinkedList<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }
}
