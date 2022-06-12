package DobleListaEnlazada;

public class DobleListaEnlazada<E> {
    private int tamaño=0;
	private Node<E> root;
	
	public DobleListaEnlazada() {
		this.root = null;
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
}
