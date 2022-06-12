package DobleListaEnlazada;

public class Node <E> {
	private E data ;
    private Node <E > next ;
    private Node <E > previous ;
    
    public Node ( E data , Node <E > next , Node <E > previous ) {
        this.data = data ;
        this.next = next ;
        this.previous = previous ;
    }
    public Node ( E data , Node <E > next ) {
        this(data,next,null);
    }
    public Node ( E data ) {
    	 this(data,null,null);
    }
    public Node () {
        this(null,null,null);
    }
    public E getData() {
		return this.data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public Node<E> getNext(){
		return this.next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	public Node<E> getPrevious(){
		return this.previous;
	}
	public void setPrevious(Node<E> previous) {
		this.previous = previous;
	}
	public String toString() {
		return this.data.toString();
	}
}
