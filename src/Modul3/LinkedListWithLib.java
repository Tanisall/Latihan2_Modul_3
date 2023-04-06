package Modul3;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListWithLib {
    public void queueExample(){
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("Remove: " + queue.remove());
        System.out.println("Element: " + queue.element());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Peek: " + queue.peek());

    }
    public static void main(String[] args) {
        new LinkedListWithLib().queueExample();
    }
}
