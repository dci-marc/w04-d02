package org.dcistudent;

import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public class StringChallenge {
    public boolean isValid(String str) {
        // Fifth implementation by going deeper into object-oriented programming in Java.
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        AtomicBoolean isValid = new AtomicBoolean(true);

        str.chars().mapToObj(c -> (char) c).forEach(character -> {
            if (bracketMap.containsValue(character) == true) {
                stack.push(character);
                return;
            }

            if (bracketMap.containsKey(character) == false) {
                return;
            }

            if (stack.isEmpty() || stack.pop().equals(bracketMap.get(character)) == false) {
                isValid.set(false);
            }

        });

        return isValid.get();

//        Fourth implementation, still for assisting.
//        Stack<Character> stack = new Stack<>();
//
//        HashMap<Character, Character> bracketMap = new HashMap<>();
//        bracketMap.put(')', '(');
//        bracketMap.put('}', '{');
//        bracketMap.put(']', '[');
//
//        str.chars().forEach(i -> {
//            char c = str.charAt(i);
//            if (bracketMap.containsValue(c)) {
//                stack.push(c);
//                return true;
//            }
//
//            if (stack.isEmpty()) {
//                return false;
//            }
//
//            if (bracketMap.get(c) != stack.pop()) {
//                return false;
//            }
//        });
//
//        return stack.isEmpty();

//        Third implementation by using Stack again instead of StringBuilder, still for assisting.
//        String openBrackets = "({[";
//        String closeBrackets = ")}]";
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//
//            if (openBrackets.indexOf(c) != -1) {
//                stack.push(c);
//                continue;
//            }
//
//            if (stack.isEmpty()) {
//                return false;
//            }
//
//            int openIndex = openBrackets.indexOf(stack.peek());
//            int closeIndex = closeBrackets.indexOf(c);
//            if (openIndex != closeIndex) {
//                return false;
//            }
//
//            stack.pop();
//        }
//
//        return stack.isEmpty();

//        Second implementation, still for assisting.
//        String openBrackets = "({[";
//        String closeBrackets = ")}]";
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (openBrackets.indexOf(c) != -1) {
//                sb.append(c);
//                continue;
//            }
//
//            if (sb.isEmpty() == true) {
//                return false;
//            }
//
//            if (closeBrackets.indexOf(c) != openBrackets.indexOf(sb.charAt(sb.length() - 1))) {
//                return false;
//            }
//
//            sb.deleteCharAt(sb.length() - 1);
//        }
//
//        return sb.isEmpty();

//        I will leave the old implementation here for reference since it is also correct, but slightly easier
//        to understand when assisting someone.
//        Stack<Character> stack = new Stack<>();
//
//        for (char c : str.toCharArray()) {
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//                continue;
//            }
//
//            if (stack.isEmpty() == true) {
//                return false;
//            }
//
//            char top = stack.pop();
//            if (top == '(' && c != ')') {
//                return false;
//            }
//            if (c != ']' && top == '[') {
//                return false;
//            }
//            if (c != '}' && top == '{') {
//                return false;
//            }
//        }
//
//        return stack.isEmpty();
    }
}
