package ex1;

public class LinkedStack<E> implements Stack<E> {

	private Node<E> top;
	private E elements[];
	private int contador;

	public LinkedStack(int maxSize) {
		elements = (E[]) new Object[maxSize];
		top = null;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
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
	public void push(E element) {
		if (isFull())
			throw new OverflowException();
		contador++;
		Node<E> ultimo = top;
		top = new Node<E>(element);
		top.setNext(ultimo);
	}

	@Override
	public E pop() throws UnderflowException {
		if (isEmpty())
			throw new UnderflowException();
		contador--;
		Node<E> ultimo = top;
		top = top.getNext();
		return ultimo.getElement();

	}

	@Override
	public E top() throws UnderflowException {
		if (isEmpty())
			throw new UnderflowException();
		return top.getElement();
	}

	@Override
	public int numElements() {
		return contador;
	}

	public String toString() {
		if (isEmpty())
			return "[Empty]";
		else {
			Node<E> top = this.top;
			String s = "[";
			for (int i = numElements() - 1; i >= 0; i--) {
				
				if (top ==  null) {
					s += "\nnull";
				} else {
					s += "\n" + top.getElement();
					top = top.getNext();
				}

			}
			s += "\n]";
			return s;
		}
	}

}
