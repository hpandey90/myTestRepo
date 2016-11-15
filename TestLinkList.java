class Node{
	public int data1;
	public String data2;
	public Node next;
	public Node(int i, String s){
		data1 = i;
		data2 = s;
	}
}
class LinkList{
	private Node first;
	public LinkList(){
		first = null;
	}
	public void insert(int i, String s){
		Node list = new Node(i,s);
		list.next = first;
		first = list;
	}
	public void printList(){
		Node currentnode = first; 
		while(currentnode!=null){
			System.out.println(currentnode.data1+"==="+currentnode.data2);
			currentnode = currentnode.next;
		}
	}
	public void delete(){
		Node currentnode = first;
		first = currentnode.next;
		currentnode.next = null;
	}
}
class TestLinkList{
	public static void main(String args[]){
		LinkList ob = new LinkList();
		ob.insert(1,"hello node 1");
		ob.insert(2,"hello node 2");
		ob.insert(3,"hello node 3");
		ob.printList();
		ob.delete();
		System.out.println("Deletion completed");
		ob.printList();
	}
}