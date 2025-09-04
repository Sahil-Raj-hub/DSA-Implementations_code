import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
         int []arr={51,37,78,96,45,41,25,10,32};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    public static void sort(int []a){
        quickSort(0, a.length-1, a);
    }

    
    public static void quickSort(int start,int end,int[]a){
        if(start>=end)return;
        
        int i=start;
        int j=end;
        int pivot=a[(start+end)/2];
        while(i<=j){
            while(a[i]<pivot)i++;
            while(a[j]>pivot)j--;
            if(i<=j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;j--;
            }
        }
        quickSort(start, j, a);
        quickSort(i, end, a);
    
    }
    
}
