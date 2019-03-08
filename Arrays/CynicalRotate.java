class CynicalRotate{

void rotateRi(int arr[], int d, int n){
for(int i=0; i<d; i++){
rotateCyn(arr,n);
 }
}

void rotateCyn(int arr[], int n){
int x=arr[arr.length-1], i;
for(i=arr.length-1; i>0; i--){
 arr[i] = arr[i-1];
 }
arr[0] = x;
}

void printArray(int arr[], int n){
	for(int i=0; i<n; i++){
		System.out.print(arr[i]+"");
	}
}


public static void main(String[] args){ 
  CynicalRotate rotate = new CynicalRotate();
  int arr[] = {1,2,3,4,5};
  rotate.rotateRi(arr,1,5);
  System.out.println("Rotated Array is");
  rotate.printArray(arr,5);
   }
}
