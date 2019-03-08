class pairsum{
static int pairsinSortedrotatedArr(int arr[], int n, int x){

//find pivot element - largest
int i;
for(i=0; i<n-1; i++)
{ if(arr[i] > arr[i+1]){
  break;
  }
 }
 
 //l index of smallest element
 int l=(i+1)%n;
 
 // r index of largest element;
 int r= i;
 
 
 //variable to store count of pairs
 
 int cnt=0;
 
 while(l != r){
 
 if (arr[l] + arr[r] == x)
 { 
  cnt++;
  
  
  //loop terminates before l and r cross each other
  if( l == (r-1 + n)% n){
   return cnt;
   }
   
   l=(l+1) %n;
   r=(r-1 + n)%n;
 }
 
 
 else if(arr[l] + arr[r] < x)
 { 
   l = (l+1)%n;
   }
   
   else {
   r = (n + r-1)%n;
   }
 }
   
 return cnt;
}

public static void main(String[] args){
int arr[] = { 11, 15, 6, 7, 8, 9, 10};
int sum=16;
int n=arr.length;
System.out.println(pairsinSortedrotatedArr(arr,n,sum));
 }
}