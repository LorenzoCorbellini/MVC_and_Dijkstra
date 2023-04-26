package model;

public class Node {
	private String previousNode;
	private int distance;
	
	public Node() {
		this.previousNode = "";
		this.distance = Integer.MAX_VALUE;
	}

	public String getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(String previousNode) {
		this.previousNode = previousNode;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public String toString() {
		return "weight: "+distance+" previousNode: "+previousNode;
	}
}
