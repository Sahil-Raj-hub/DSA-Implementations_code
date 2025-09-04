import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
         int []arr={51,37,78,96,45,41,25,10,32};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void insertionSort(int[]a){
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
    
}
