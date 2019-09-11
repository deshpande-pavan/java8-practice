package com.javapractice.interviewprograms;

public class LinkedList {

	protected Node start;
	protected Node end;

	public int size;

	public LinkedList() {
		start = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		return size;
	}

	public void insertAtStart(int value) {
		Node nptr = new Node(value);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			nptr.setLink(start);
			start = nptr;
		}
	}

	public void insertAtEnd(int value) {
		Node nptr = new Node(value);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			end.setLink(nptr);
			end = nptr;
		}
	}

	public void insertAtPos(int value, int pos) {
		Node nptr = new Node(value);
		Node ptr = start;
		pos = pos - 1;
		/*
		 * for (int i = 1; i < size; i++) { if (i != pos) { ptr = ptr.getLink(); } else
		 * { Node temp = ptr.getLink(); ptr.setLink(nptr); nptr.setLink(temp); } }
		 */
		size++;
		int i = 0;
		Node p = start;
		while (i != pos) {
			p = ptr;
			ptr = ptr.getLink();
			i++;
		}
		p.setLink(nptr);
		nptr.setLink(ptr);

	}

	public void deleteAtPos(int pos) {
		if (pos == 1) {
			start = start.getLink();
			size--;
			return;
		}

		if (pos == size) {
			Node s = start;
			Node t = start;

			while (s != end) {
				t = s;
				s = s.getLink();
			}
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		pos = pos - 1;
		Node ptr = start;
		Node p = start;
		int i = 0;
		while (pos != i) {
			p = ptr;
			ptr = ptr.getLink();
			i++;
		}
		p.setLink(ptr.getLink());
		size--;
	}

	public void display() {
		if (size == 0) {
			System.out.println("Empty");
			return;
		}
		Node ptr = start;
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData());
	}
}
