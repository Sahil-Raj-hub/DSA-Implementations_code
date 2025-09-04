import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        
        int []arr={51,37,78,96,45,41,25,10,32};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    
}
