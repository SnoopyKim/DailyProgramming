package com.practice;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

// Implement a queue using stacks.
public class Q20190929 {

    public Q20190929() {
        Queue queue = new Queue();

        while (true){
            System.out.println("1. Print Queue");
            System.out.println("2. EnQueue");
            System.out.println("3. Dequeue");
            System.out.println("4. Quit");
            int option = new Scanner(System.in).nextInt();
            switch (option) {
                case 1:
                    System.out.println(queue.getQueue()); break;
                case 2:
                    System.out.print("Input value: ");
                    queue.enQueue(new Scanner(System.in).next());
                    break;
                case 3:
                    Object returnValue = queue.deQueue();
                    if (returnValue == null)
                        System.out.println("Queue is empty!");
                    else
                        System.out.println("Return value: " + returnValue);
                    break;
                case 4:
                    return;
            }
        }
    }

    private static class Queue {
        private Stack<String> inBox;
        private Stack<String> outBox;

        Queue() {
            inBox = new Stack<>();
            outBox = new Stack<>();
        }

        public void enQueue(String item) {
            inBox.push(item);
        }

        public Object deQueue() {
            if (outBox.empty()) {
                while(!inBox.empty()) { outBox.push(inBox.pop()); }
            }

            try { return outBox.pop(); }
            catch (EmptyStackException e) { return null; }
        }

        public Stack<Object> getQueue() {
            Stack<Object> tempBox = new Stack<>();
            Stack<Object> showBox = new Stack<>();
            tempBox.addAll(outBox);

            while(!tempBox.empty()) { showBox.push(tempBox.pop()); }
            showBox.addAll(inBox);
            return showBox;
        }
    }
}
