package model;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	private List<Node> nodes;
	private List<Edge> edges;
	
	public Graph() {
		this.nodes = new ArrayList<Node>();
		this.edges = new ArrayList<Edge>();;
	}
	
	//Restituisce i nomi dei nodi 'A, B, C...'
	public List<String> setNodes(int nodesCount) {
		List<String> nodeNames = new ArrayList<>();
		
		char initNode = 'A';
		
		for (int i = 0; i < nodesCount; i++)
			nodeNames.add(String.valueOf(initNode++));
		
		System.out.println(nodeNames.toString());
		return nodeNames;
	}
}
