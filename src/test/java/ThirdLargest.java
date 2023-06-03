public class ThirdLargest {
    public static void main(String args[]){
        int arr[] = {5,4,6,2,3,50};
        int min = arr[0];
        int max = arr[0];
        for(int i =0; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }

        int min2 =arr[0];
        int max2=arr[0];
        for(int i =0; i<arr.length;i++){
            if(min2>arr[i] && arr[i] != min){
                min2 = arr[i];
            }
            if(max2<arr[i] && arr[i] != max){
                max2 = arr[i];
            }
        }

        int max3 =arr[0];
        for(int i =0; i<arr.length;i++){
            if(arr[i] != max && arr[i] != max2 && max3<arr[i] ){
                max3 = arr[i];
            }
        }

        System.out.println("Third Largest value: "+max3);
        System.out.println("Third Lowest value: "+min2);
    }
}
