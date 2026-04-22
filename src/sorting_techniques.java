import java.util.Scanner;

public class sorting_techniques {
    public static void arrMinimum(Scanner sc, int[]a){
        int min = a[0];
        int minIndex=0; // i ... a.length-1
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("MINIMUM "+min);
        for(int i=0;i<a.length;i++){
            if(a[i]<a[minIndex]){
                minIndex=i;
            }
        }
        System.out.println("MININDEX "+minIndex);
    }

    public static void Swap(int a,int b){
        a=10;
        b=20;
        int c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b+" ");
    }

    public static void selection_sort(int[] arr) {
        // For each position i
        for(int i = 0; i < arr.length; i++) {
            // Find the minimum index between i to a.length-1
            int minIndex=i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int c = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The array before sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        selection_sort(arr);
        System.out.print("The array after sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}