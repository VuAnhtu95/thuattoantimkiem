public class Timkiemnhiphan {
    int binarySearch(int arr[], int a , int r , int x){
        if (r>=1 && a<arr.length-1){
            int mid = a +(r-1)/2;
            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid]>x){
                return binarySearch(arr,a,mid-1,x);
            }
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Timkiemnhiphan ob = new Timkiemnhiphan();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
