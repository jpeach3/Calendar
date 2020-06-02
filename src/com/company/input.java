package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class input {
    private String request = "";

    public String request() {
        List<String> postpull = Arrays.asList("post", "pull");
        java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            do {
                System.out.println("What would you like to do today? Please enter post/pull: ");
                request = in.readLine();
            } while (!postpull.contains(request));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return request;
    }

}
