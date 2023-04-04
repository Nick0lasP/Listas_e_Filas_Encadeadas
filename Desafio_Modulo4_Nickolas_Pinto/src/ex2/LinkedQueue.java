package ex2;

import ex1.Node;

public class LinkedQueue<E> implements Queue<E> {

	private Node<E> first;
	private Node<E> last;
	private E elements[];
	private int contador;

	public LinkedQueue(int maxSize) {
		elements = (E[]) new Object[maxSize];
		first = last = null;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public boolean isFull() {
		if (contador == elements.length) {
			return (true);
		} else {
			return (false);
		}
	}

	@Override
	public int numElements() {
		return contador;
	}

	@Override
	public void enqueue(E element) throws OverflowException {
		if (isFull())
			throw new OverflowException();
		else {
			Node<E> newNode = new Node<>(element);
			if (first == null) {
				first = last = newNode;
				contador++;
			} else if ( last == first) {
				first.setNext(newNode);
				last = last.getNext();
				contador++;
			}
			else {
				last.setNext(newNode);
				last = last.getNext();
				contador++;
			}

		}

	}

	@Override
	public E dequeue() throws UnderflowException {
		if (isEmpty())
			throw new UnderflowException();
		Node<E> antigoFirst = first;
		first = first.getNext();
		if (first == last)
			first = last;
		contador--;

		return antigoFirst.getElement();
	}

	@Override
	public E front() throws UnderflowException {
		if (isEmpty())
			throw new UnderflowException();
		return first.getElement();
	}

	@Override
	public E back() throws UnderflowException {
		if (isEmpty())
			throw new UnderflowException();
		return last.getElement();

	}

	public String toString() {
		if (isEmpty())
			return "[Empty]";
		else {
			Node<E> atual = this.first;
			String s;
			if (atual == null) {
				s = "[null";
				atual = atual.getNext();
			}
			else {
				s = "[" + atual.getElement();
				atual = atual.getNext();
			}
			int n = numElements();
			for (int i = 1; i < n; i++) {
				s += ", " + atual.getElement();
				atual = atual.getNext();
			}
			s += "]";
			return s;
		}
	}

}
