package src;

public class Exam2022_96 {


    public static void main(String[] args) {
        int[] a = {3,0,0,4,7,9,0,0,0,0,11,15,0,19,20,0,0,31,40,0};
        System.out.println(kAlmostSorted(a, 9));
    }


    public static int[] findTrue (boolean[][] tmp) {
        int low = 0;
        int high = tmp.length - 1;
        int[] result = {-1,-1};
        while (low <= high && result[0] == -1) {
            int mid = (low+high) / 2;
            int[] arr = null;//ask(mid,mid);
            if (arr[0] == 0){
                result[0] = mid;
            }
            if (arr[0] == 1){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        low = 0;
        high = tmp.length - 1;
        while (low <= high && result[1] == -1) {
            int mid = (low+high) / 2;
            int[] arr = null;//ask(mid,mid);
            if (arr[1] == 0){
                result[1] = mid;
            }
            if (arr[1] == 1){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return result;
    }




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
