class RotateArray{
void rotateLeft(int arr[], int d, int n){
for(int i=0; i<d; i++){
rotateLeftByOne(arr,n);
 }
}

void rotateLeftByOne(int arr[], int n)
{ int i,temp;
  temp = arr[0];
 for(i=0; i<n-1; i++) //push elements one by one to left till last element
 {
    arr[i] = arr[i+1];
  }
  //replace last element by first element
  arr[i] = temp;
 }
 
 void printArray(int arr[], int n){
 for(int i=0; i<n; i++)
 {
   System.out.print(arr[i]+"");
  }
 }
 
 public static void main(String[] args){
 RotateArray rotate = new RotateArray();
 int arr[] = {1,2,3,4,5,6,7};
 rotate.rotateLeft(arr,2,7);
 rotate.printArray(arr,7);
  }
}