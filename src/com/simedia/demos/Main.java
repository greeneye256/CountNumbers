package com.simedia.demos;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        for (int i = 1; i<5; i++){
            for (int j = 1; j<5; j++){
                for (int k = 1; k<5; k++){
                    if (i!=j && i!=k && j!=k) {
                        number = 100*i + 10*j + k;
                        count +=1;
                        System.out.println(number);
                    }


                }
            }
        }
        System.out.println("There are " + count + " unique 3 digit numbers using 1,2,3 and 4. ");
    }
}
