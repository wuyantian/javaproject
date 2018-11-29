package com.company;

public class Main {

    public static void main(String[] args)throws Exception{
	// write your code here
        MyArrayList<Integer> mal = new MyArrayList<>();
        mal.add(0);
        mal.add(1);
        mal.add(2);
        mal.add(3);
        mal.add(4);
        mal.add(5);
        mal.add(6);
        mal.add(7);
        mal.add(8);
        mal.add(9);

        mal.remove(5);
        System.out.println("get"+" "+mal.get(7));

    }
}
