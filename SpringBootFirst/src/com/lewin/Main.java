package com.lewin;

public class Main {

    public static void main(String[] args) {

        int salary = 3000 ;
        int total =  10_800 ;

        for(int i = 4 ; i <= 40 ; i++){
            for(int j = 1 ; j % 12 != 0 ;j++){
                total += salary ;
            }
            salary += 1000 ;
        }
        System.out.println(total);
	// write your code here
    }
}
