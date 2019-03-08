class min{
static int findmin(int arr[], int low, int high){
  if( high < low){
  return arr[0];}
  
  //if only one element left
  if(high==low){
  return arr[low];
  }
  
  //find mid
  int mid=(low) +(high-low)/2;
  
  //check if (mid+1) is min element
 if ( mid < high && arr[mid+1] < arr[mid]){
 return arr[mid+1];
 }
 
 // check if mid is min element
 if( mid > low && arr[mid] < arr[mid-1]){
 return arr[mid];
 }
 
 //whether to go left half or right half
 if ( arr[high] > arr[mid] )
 {
  return findmin(arr, low, mid-1);
  }
  else
  {
  return findmin(arr, mid+1,high);
  }
}
 
 
 public static void main(String[] args){
 int arr1[] = {5,6,1,2,3,4};
 int n1=arr1.length;
 System.out.println("min element is"+findmin(arr1,0,n1-1));
  }
 }