package year2024.moed63;

public class Q2 {
    public static int get(int[] b , int k){
        if (k == 0)
        {
            return b[0];
        }

        return b[k]-b[k-1];
    }

    public static int find(int[] b , int x)
    {
        int low = 0;
        int high = b.length-1;
        while (low <= high)
        {
            int mid = (low+high)/2;
            if (get(b, mid) == x){
                return mid;
            }
            if (get(b, mid) < x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return -1;
    }

}
