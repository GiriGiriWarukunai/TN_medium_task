public class Search {
    public int binarySearch(int[] a, int x){
        if(a == null){
            return -1;
        }
        else if(a.length == 0){
            return -1;
        }
        return binarySearchInner(a,x, 0, a.length - 1);
    }

    private int binarySearchInner(int[] a, int x, int left, int right)
    {
        if (right < left) {
            return -1;
        }
        int mid = (left + right) >> 1;
        if (x > a[mid]) {
            return binarySearchInner(a, x, mid + 1, right);
        }
        else if (x < a[mid]) {
            return binarySearchInner(a, x, left, mid - 1);
        }
        else {
            return mid;
        }
    }
}