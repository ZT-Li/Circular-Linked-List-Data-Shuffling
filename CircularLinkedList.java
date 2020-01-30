package cs146F19.Li.Project1;

public class CircularLinkedList {

	private Node head;
	private Node tail;

	// create a circular linkedlist
	public CircularLinkedList(int n) {

		if (n < 1)
			head = null;
		else {
			int i = 1;
			Node node = new Node(i);
			head = node;
			while (i < n) {
				i++;
				node.setNext(new Node(i));
				node = node.getNext();
			}
			tail = node;
			tail.setNext(head);
		}
	}

	// remove a node from the linkedlist
	public void remove(int key) {
		if (head.getData() == key) {
			head = head.getNext();
			tail.setNext(head);
		} else {
			Node temp = head;
			while (temp.getNext().getData() != key)
				temp = temp.getNext();
			temp.setNext(temp.getNext().getNext());
			tail = temp;
		}
	}

	// the actual CLL game
	public int CLLgames(int k) {
		Node temp = head;
		while (temp.getNext().getData() != temp.getData()) {
			int counter = 1;
			while (counter != k) {
				temp = temp.getNext();
				counter++;
			}
			remove(temp.getNext().getData());
			temp = temp.getNext();
		}
		return temp.getData();
	}
	
	//check if the list is empty
	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}
	
	//check the size of the list
	public int size()
	{
		if (isEmpty())
			return 0;
		else
			return tail.getData();
	}
}
