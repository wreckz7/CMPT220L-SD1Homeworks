// Awais Razaque
// Homework 8
// 4/8/24

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();

        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);
        System.out.println("Your stack: " + stax);

        // Q1, Q2
        int max = stax.peek();
        int min = stax.peek();
        int count = stax.size();
        stax.pop();
        for (int i = 0; i < stax.size(); i++) {
            if (stax.peek() > max){
                max = stax.peek();
            }
            if (stax.peek() < min) {
                min = stax.peek();
            }
            stax.pop();
        }
        System.out.println("The minimum value of this stack is: " + min);
        System.out.println("The maximum value of this stack is: " + max);
        System.out.println("Number of elements in this stack: " + count);

        System.out.println();

        // Q3
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);
        System.out.println("Your linkedlist: " + linky);
        while (linky.size() != 1 ) {
            linky.removeFirst();
            linky.removeLast();
        }
        System.out.println("The middle value of this linkedlist is: " + linky.getFirst());

        System.out.println();

        // Q4: Orders at a Restaurant
        System.out.println("Welcome to Awais's Restaurant!");
        Scanner sc = new Scanner(System.in);
        Queue<String> orders = new LinkedList<>();
        while (orders.size() != 5) { // Get Orders
            System.out.println("Please give me your first and last name to track your order of...(insert random food): ");
            String ordertoAdd = sc.nextLine();
            orders.add(ordertoAdd);
        }
        System.out.println();
        System.out.println("Orders Queue: " + orders);
        for (int i = 0; i < 5; i++) {
            System.out.println("Currently Making: " + orders.element());
            orders.remove();
            System.out.println();
            System.out.println("Orders Queue: " + orders);
        }
        System.out.println("All Orders Completed in Order of Line!");

    }
}