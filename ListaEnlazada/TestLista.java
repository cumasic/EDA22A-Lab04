package ListaEnlazada;

public class TestLista {
    public static void main(String[]args) {
        ListaEnlazada<Integer> list = new ListaEnlazada<Integer>();
		list.insert(10);
		list.insert(17);
		list.insert(18);
		list.insert(19);
		list.insert(9);
		System.out.println("Lista no ordenada: "+list);
        insertionSort(list);
        System.out.println("Lista ordenada: "+list);
    }
    public static ListaEnlazada<Integer> generarPeorCaso(int num) {
		ListaEnlazada<Integer> peorCaso = new ListaEnlazada<Integer>();
		for(int i = 0 ;i < num; i++)
			peorCaso.insert(num-i);
		return peorCaso;
	}
    public static void insertionSort(ListaEnlazada<Integer> a) {
        int key;
		int i;
		for (int j=1; j<a.length(); j=j+1) {
			key = a.getInd(j);
			//Insertar A[j] en la secuencia ordenada A[1..j-1]
			i=j-1;
			while(i>-1 && a.getInd(i)>key) {
				a.remove(i+1);
				a.insertPos(a.getInd(i), i+1);
				i = i-1;
			}
			a.remove(i+1);
			a.insertPos(key, i+1);
		}			
    }
}
