import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[]arr={32,65,4,1,24,26,85,97,62,45,42};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int []a){
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]) 
                    min=j;
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
}
