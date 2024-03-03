package year2022.moed96;

public class Q2
{
    public static int kAlmostSorted(int[] a, int num){
        int low = 0;
        int  high = a.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            while (a[mid] == 0 && mid <= high){
                mid++;
            }
            if (mid > high){
                high = (low+high)/2-1;
            }else{
                if (a[mid] == num){
                    return mid;
                }
                if (a[mid] > num){
                    high = (low+high)/2-1;
                }else{
                    low = (low+high)/2+1;
                }
            }
        }

        return -1;
}

}
