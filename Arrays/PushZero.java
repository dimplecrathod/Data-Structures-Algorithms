class PushZero{
static void pushzerostoend(int arr[], int n){
int count=0;

//traverse array, if element encountered non zero replace element at index count with this element
for(int i=0; i<n; i++){
 if(arr[i] !=0){
 arr[count++] = arr[i];
 }
 }
 while(count < n){
 arr[count++] = 0;
 }
}

public static void main(String[] args){
int arr[]={ 1, 9, 8, 0, 0, 2, 3, 0, 4};
int n=arr.length;
pushzerostoend(arr,n);
System.out.println("Array after pushing zeros to back:");
for(int i=0; i<n; i++){
System.out.print(arr[i]+" ");
 }
 }
}