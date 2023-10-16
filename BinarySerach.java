import java.util.*; 
import java.lang.*; 
class BinarySearch{ 
 int size; 
 int arr[]; 
 int binsearch(int arr[], int l, int r, int x) 
 { 
 while (l <= r) 
 { 
 int m = l + (r-l)/2; 
 // Check if x is present at mid 
 if (arr[m] == x) 
 return m; 
 // If x greater, ignore left half 
 if (arr[m] < x) 
 l = m + 1; 
 // If x is smaller, ignore right half 
 else 
 r = m - 1; 
 } 
 // if we reach here, then element was not present 
 return -1; 
 } 
 BinarySearch(int n) 
 { 
 size=n; 
 arr=new int[size]; 
 } 
 void read() 
 { 
 Scanner in=new Scanner(System.in); 
 System.out.println("Enter "+size+"elements of array:"); 
 for(int i=0;i<size;i++) 
 arr[i]=in.nextInt(); 
 } 
 } 
class BST 
{ 
 public static void main(String args[]) 
 { 
 Scanner input=new Scanner(System.in); 
 System.out.println("Enter size of array:"); 
 int size=input.nextInt(); 
 BinarySearch b=new BinarySearch(size); 
 b.read(); 
 System.out.println("Enter a key to search:"); 
 int x=input.nextInt(); 
 int result = b.binsearch(b.arr, 0, size-1, x); 
 if(result == -1) 
 System.out.println("Element is not present in array"); 
 else 
 System.out.println("Element is present at index "+result); 
 } 
