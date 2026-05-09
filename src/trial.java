import java.util.Scanner;

public class sorting {
    public static void main(String[]args){
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr= new int[n];
        for(int i = 0; i < n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("array before sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // selection_sort(arr);
        // insertion_sort(arr);
        merge_sort(arr,0,arr.length-1);
//        if(linearSearch(arr,6)){
//            System.out.println("The key is in the array: "+6);
//        }
        if(binarySearchRecursive(arr,0,arr.length-1,7)){
            System.out.println("The key is: "+7);
        }else{
            System.out.println("The key is not there");
        }
        System.out.println();
        System.out.print("array after sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selection_sort(int[]arr){
        for(int i = 0;i < arr.length;i++){
            int minIndex=i;
            for(int j =i;j<arr.length;j++){
                if (arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            int a =arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=a;
        }
    }
    public static void insertion_sort(int[]arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    public static void merge(int[]arr,int low ,int mid,int high){
        int[]left= new int[mid-low+1];
        int[]right=new int[high-mid];
        for(int i=0;i<left.length;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<right.length;i++){
            right[i]=arr[mid+i+1];
        }
        int l = low;
        int li =0;
        int ri =0;
        while(li !=left.length || ri !=right.length){
            if(li==left.length){
                arr[l]=right[ri];
                ri++;
            }else if(ri==right.length){
                arr[l]=left[li];
                li++;
            }else if(left[li]< right[ri]){
                arr[l]= left[li];
                li++;
            }else{
                arr[l]=right[ri];
                ri++;
            }
            l++;
        }
    }
    public static void merge_sort(int[]arr,int low,int high){
        if(low < high){
            int mid =(low+high)/2;
            merge_sort(arr,low,mid);
            merge_sort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static boolean linearSearch(int[]arr,int key){
        for(int i =0;i<arr.length;i++){
            if(key==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static boolean binarySearchRecursive(int[]arr,int low,int high,int key){
        int mid =(low+high)/2;
        if(low>high){
            return false;
        }
        if(arr[mid]==key){
            return true;
        }else if(arr[mid]<key){
            return binarySearchRecursive(arr,mid+1, high,key);
        }else {
            return binarySearchRecursive(arr,low, mid-1,key);
        }
    }
}