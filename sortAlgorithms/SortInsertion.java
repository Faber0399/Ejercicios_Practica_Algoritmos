package sortAlgorithms;

public class SortInsertion{

    public static void main(String[] args) {
        int [] A ={11,9,7,6,4,6,4};

        for (int j = 1 ; j <A.length;j++){
            int key =A[j];
            int i = j-1;
            while (i>=0 && A[i]<key ){
                A[i+1]=A[i];
                i=i-1; 
            }
            A[1+i]=key;
        }
        
    }
}