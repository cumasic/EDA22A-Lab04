package DobleListaEnlazada;

public class DobleListaEnlazada<E> {
    private int tamaño=0;
	private Node<E> root;
	
	public DobleListaEnlazada() {
		this.root = null;
	}
    public boolean isEmpty(){
		return this.root == null;
	}
	public int length() {
		return tamaño;
	}
	public void insert(E x) {
		if(isEmpty()) {
			this.root = new Node<E>(x);
		}
		else {
			Node<E> aux = this.root;
			Node<E> aux2 = new Node<E>(x);
			for(;aux.getNext() != null; aux = aux.getNext());
			aux2.setPrevious(aux);
			aux.setNext(aux2); 
		}
		tamaño++;
	}
	public void insertPos(E x,int indice) {
		if(indice<=tamaño) {
	        if(indice==0) {
	        	Node<E> aux = new Node<E>(x);
	        	this.root.setPrevious(aux);
	        	this.root = new Node<E>(x,this.root);
	        }
	        else if(indice==tamaño) {
	        	Node<E> aux1=this.get(indice-1);
	        	aux1.setNext(new Node<E>(x,aux1.getNext()));
	        	Node<E> aux2=this.get(indice);
	        	aux2.setPrevious(new Node<E>(x,null,aux2.getPrevious()));
	        }
	        else {
	        	Node<E> aux1=this.get(indice-1);
	        	aux1.setNext(new Node<E>(x,aux1.getNext()));
	        	Node<E> aux2=this.get(indice+1);
	        	aux2.setPrevious(new Node<E>(x,null,aux2.getPrevious()));
	        }
	        tamaño++;
	    }
	}
	public E getInd(int indice) {
	    Node<E> aux = this.get(indice);
	    return aux.getData();
	}
    public Node<E> get(int indice) {
	    Node<E> aux = root;
	    for(int i=0;i<indice;i++)
	        aux=aux.getNext();
	    return aux;
	}
	public void remove(int indice) {
	    if(indice<tamaño) {
	        if(indice==0) {
	            this.root=this.root.getNext();
	            this.root.setPrevious(null);
	        }
	        else if(indice==tamaño-1) {
	        	Node<E> posterior=this.get(indice);
	        	posterior.setPrevious(this.get(indice-1));
	        	Node<E> anterior=this.get(indice-1);
	        	anterior.setNext(this.get(indice+1));
	        }
	        else {
	            Node<E> posterior=this.get(indice+1);
	            posterior.setPrevious(this.get(indice-1));
	            Node<E> anterior=this.get(indice-1);
	            anterior.setNext(this.get(indice+1));
	        }
	        tamaño--;
	    }
	}
    public String toString() {
		String str = "";
		for(Node<E> aux = this.root; aux != null;aux = aux.getNext()) {
			str += aux.getData() + ", ";
		}
		return str;
	}
}
