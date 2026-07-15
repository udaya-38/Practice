package DSA;

import java.util.*;

public class Basics_Stack {
    public static void main(String[] args) {
        Stack <String> s1 = new Stack <String> ();
//        System.out.println(s1.empty());
        s1.push("Hello");
        s1.push("Everyone");
        s1.pop(); // pop() method removes the last element 
        System.out.println(s1);
    }
}
