package sortAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int [] A ={11,9,7,6,4,6,3};
        int i=0;
        while (i<A.length-1){
            int min_index = i;
            int j = i+1;
            while(j<A.length){
                if (A[j]<A[min_index]) min_index=j;
                j++;
            }
            int aux=A[i];
            A[i]=A[min_index];
            A[min_index]=aux;
            i++;
        }
    }
}
