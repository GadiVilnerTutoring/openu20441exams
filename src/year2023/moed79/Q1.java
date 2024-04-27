package year2023.moed79;

public class Q1 {//TODO find code

    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 10, 10, 4, 3, 10, 10};
        System.out.println(longestAlmostPalindrome(arr));//should print 6
    }

    public static int longestAlmostPalindrome(int[] arr) {
        return longestAlmostPalindrome(arr, 0, 0, 0);
    }


    //first recursive is to reach all sub arrays
    //starting at 0-0, 0-1, 0-2... 0..arr.length-1 and then increment the first index (i)
    //1-1, 1-2,1-3.... and so on
    //until first index (i) reached the end of the array
    private static int longestAlmostPalindrome(int[] arr, int i, int j, int longest) {
        if (i == arr.length) {
            return longest;//finished, returning longest
        }
        if (j == arr.length) {//second index reached the end of the array
            return longestAlmostPalindrome(arr, i + 1, i + 1, longest);//increasing first index and second index with same value
        }
        //for each subarray, we want to check if it's an almost palindrome sub array
        if (arr[i] == arr[j]//the indexes in edges must be the same, as stated in question
                && isAlmostPalinrome(arr,i,j, false)){//starting flag of found fault to false
            int length = j-i+1;//calculating the length of the sub array
            longest = Math.max(longest, length);//updating longest, if necessary
        }
        return longestAlmostPalindrome(arr, i, j + 1, longest);//moving on with second index
    }

    private static boolean isAlmostPalinrome(int[] arr, int i, int j, boolean foundFault) {
        if (i >= j){//i passed ort equals to j and didn't return false so far, we have almost palindrome
            return true;
        }
        if (arr[i] != arr[j]){//2 numbers in the opposite sides don't match
            if (foundFault){//if not for the first time, game over
                return false;
            }
            foundFault = true;//first time, yellow card
        }
        return isAlmostPalinrome(arr, i+1, j-1, foundFault);//increasing i and decreasing j, continuing to check if palindrome
    }
}
