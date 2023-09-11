package maturka;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {


//        int A [] = {1,1,3,2,2,2,1};
//        int A [] = {3,3,3,2,2,1,1,1,6};
//        int A [] = {1,1,1,2,2,3,1,4};
//        int A [] = {1,2,1,1,2,1,1,3};
//        int A [] = {4,4,4,5,5,5,5};
        int A [] = {1,1,1,1,4};
//        int A [] = {2,2,2,2,2,2};

        int li = 1;
        int bi = 0;
        int n = A.length;
        List<Integer> B = new ArrayList<>();

        for (int i = 0; i < n-1; i++){
            if (A[i] == A[i + 1]) {
                ++li;
                if (li == n){
                    B.add(n);
                    B.add(A[1]);
                    bi = bi + 2;
                }else if ((i == n-2) && (li < i)){
                    B.add(li);
                    B.add(A[n-1]);
                    bi = bi + 2;
                }

            }if (A[i] != A[i + 1]) {
                B.add(li);
                B.add(A[i]);
                bi = bi + 2;
                li = 1;
                if ((i == n-2) && (A[n-2] != A[n-1])){
                    B.add(1);
                    B.add(A[n-1]);
                    bi = bi + 2;
                }

            }
        }

        System.out.println(B + "\n" + bi);

    }



}
