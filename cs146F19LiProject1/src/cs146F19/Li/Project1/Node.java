package cs146F19.Li.Project1;

class Node {

	private int data;
	private Node next;

	Node(int data) {
		this.data = data;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}

	int getData() {
		return data;
	}
}
