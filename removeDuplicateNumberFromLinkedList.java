import java.util.Hashtable;

public class removeDuplicateNumberFromLinkedList {
	public static void main(String [] args){
		ListNode a = new ListNode(7);
		AddNode(a, 9);
		AddNode(a, 1);
		AddNode(a, 3);
		AddNode(a, 2);
		AddNode(a, 7);
		AddNode(a, 9);
		ListNode c = a;
		ListNode result = checkDuplicateWithoutBuf(c);
		while (result != null){
			System.out.println(result.value);
			result = result.next;
		}
		/*checkDuplicate(a);
		ListNode b = a;
		while (b != null){
			System.out.println(b.value);
			b = b.next;
		}
		ListNode result1 = reverse(a);
		while (result1 != null){
			System.out.println(result1.value);
			result1 = result1.next;
		}*/
	}
	static ListNode checkDuplicateWithoutBuf(ListNode c) {
		ListNode cur = c;
		ListNode newlist = new ListNode(cur.value);
		while (cur!=null){
			ListNode runner = cur;
			while (runner.next != null){
				if (runner.next.value == cur.value)
					runner.next = runner.next.next;
				else
					runner = runner.next;
			}
			if (newlist.value != cur.value)
				AddNode(newlist, cur.value);
			cur = cur.next;
		}
		return newlist;
	}
	static ListNode reverse(ListNode a) {
		ListNode pre = null;
		ListNode next;
		while (a!=null){
			next = a.next;
			a.next = pre;
			pre = a;
			a = next;
		}
		return pre;
	}
	static void checkDuplicate(ListNode a) {
		Hashtable ht = new Hashtable();
		ListNode pre = null;
		while (a != null){
			if (!ht.containsKey(a.value)){
				ht.put(a.value, true);
				pre = a;
			}
			else
				pre.next = a.next;
			a = a.next;
		}
	}
	static void AddNode(ListNode a, int i) {
		ListNode node = new ListNode(i);
		while (a.next != null){
			a = a.next;
		}
		a.next = node;
		
	}
	static class ListNode{
		int value;
		ListNode next;
		public ListNode(int value){
			this.value = value;
		}
			
	}
}
