package year2015;

public class Exam2015_91 {

    public static void main(String[] args) {
        int[] lengths = {10,20};
        System.out.println(makeSum(lengths, 40, 4));
    }

    public static int makeSum(int[] lengths, int k, int num){
        return makeSum(lengths, k, num, 0);
    }

    private static int makeSum(int[] lengths, int k, int num, int i) {
        if (k < 0 || num < 0 || i == lengths.length){
            return 0;
        }
        if (k == 0){
            return 1;
        }
        //take
        int r1 = makeSum(lengths, k-lengths[i], num-1, i);
//no take
        int r2 = makeSum(lengths, k, num, i+1);

        return r1+r2;

    }
}
