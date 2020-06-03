package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	input input = new input();
	input.request();
    Data database = new Data();
    database.connect();
    }
}
