package year2015;

public class Exam2015_94 {

    public static void main(String[] args) {
        System.out.println(longOrdNum("x12y3348"));
    }

    public static int longOrdNum(String s){
        return longOrdNum(s, 0, 0, (char)('0'-1), 0);
    }

    private static int longOrdNum(String s, int i, int count, char prevDigit, int max) {
        if (i == s.length()){
            return max;
        }
        char c = s.charAt(i);
        if (c >= '0' && c <= '9'){

            if (prevDigit < c){
                count++;
                max = Math.max(max, count);
                return longOrdNum(s, i+1, count, c, max);
            }

            return longOrdNum(s, i+1, 1, c, max);

        }

        return longOrdNum(s, i+1, 0, (char)('0'-1), max);
    }
}
