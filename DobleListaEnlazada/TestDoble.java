package DobleListaEnlazada;

public class TestDoble {
    public static void main(String[]args){
        DobleListaEnlazada<Integer> list = new DobleListaEnlazada<Integer>();
        list.insert(21);
		list.insert(40);
		list.insert(17);
		list.insert(7);
		list.insert(35);
        System.out.println(list);
        insertionSort(list);
        System.out.println(list);
    }
    public static DobleListaEnlazada<Integer> generarPeorCaso(int num) {
		DobleListaEnlazada<Integer> peorCaso = new DobleListaEnlazada<Integer>();
		for(int i = 0 ;i < num; i++)
			peorCaso.insert(num-i);
		return peorCaso;
	}
    public static void insertionSort(DobleListaEnlazada<Integer> a) {
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
