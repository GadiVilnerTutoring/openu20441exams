package year2010.moed92.q2;

public class IntVector {
    private int[] _arr;

    /**
     * Constructor for objects of class IntVector
     */
    public IntVector(int size) {
        _arr = new int[size];
    }

//    old given version:
//    public int what() {
//        int m = _arr[0];
//        for (int i = 0; i < _arr.length; i++)
//            for (int j = i; j < _arr.length; j++) {
//                int s = _arr[i];
//                for (int k = i + 1; k <= j; k++)
//                    s += _arr[k];
//                if (s > m)
//                    m = s;
//            }
//        return m;
//    }
    public int what() {
        int m = _arr[0];
        int s = _arr[0];
        for (int i = 1; i < _arr.length; i++) {
            if (s < 0) {
                s = _arr[i];
            } else {
                s += _arr[i];
            }

            m = Math.max(m, s);
        }

        return m;
    }
}

