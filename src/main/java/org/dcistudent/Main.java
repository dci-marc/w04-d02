package org.dcistudent;

public class Main {
    public static void main(String[] args) {
        String output1 = "()";
        String output2 = "()[]{}";
        String output3 = "(]";
        String output4 = "([])";

        StringChallenge sc = new StringChallenge();
        System.out.println(sc.isValid(output1) == true ? "It is correct" : "Failed");
        System.out.println(sc.isValid(output2) == true ? "It is correct" : "Failed");
        System.out.println(sc.isValid(output3) == false ? "It is correct" : "Failed");
        System.out.println(sc.isValid(output4) == true ? "It is correct" : "Failed");
    }
}
