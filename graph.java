import java.util.LinkedList;


public class graph {
	
	public static void main(String [] args){
		Node bost = new Node("Boston");
	    Node worc = new Node("Worc");
	    Node hart = new Node("Hartford");
	    Node prov = new Node("Providence");
	    Node manc = new Node("Manchester");
	    bost.addEdge(worc);
	    bost.addEdge(prov);
	    worc.addEdge(bost);
	    prov.addEdge(hart);
	    manc.addEdge(bost);
	    	System.out.println(bost.connects.size());
	    
	}
}

class Node{
	String cityname;
	LinkedList<Node> connects;
	
	Node(String cityname){
		this.cityname = cityname;
		this.connects = new LinkedList<Node>();
	}
	
	void addEdge(Node toNode){
		this.connects.add(toNode);
	}
}
