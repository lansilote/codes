
public class reserverLinkedList {
	public static void main(String [] args){
		LinkedList list = new LinkedList(7);
		addNode(list, 3);
		addNode(list, 2);
		LinkedList nlist = reverseList(list);
		while (nlist != null){
			System.out.println(nlist.value);
			nlist = nlist.next;
		}
	}

	static LinkedList reverseList(LinkedList list) {
		LinkedList pre = null;
		LinkedList runner;
		while (list != null){
			runner = list.next;
			list.next = pre;
			pre = list;
			list = runner;
		}
		return pre;
	}

	static void addNode(LinkedList list, int value){
		if (list == null)
			return;
		else{
			while (list.next != null){
				list = list.next;
			}
			list.next = new LinkedList(value);
		}
	}
	
	
}
class LinkedList{
	int value;
	LinkedList next;
	public LinkedList(int value){
		this.value  = value;
	}
}


