package Modul3WithoutLib;

public class Main {
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();

        queue.enqueue("Java");
        queue.enqueue("DotNet");
        queue.enqueue("PHP");
        queue.enqueue("HTML");
        queue.dequeue(); // remove head
        queue.displayQueue(); // menampilkan

        queue.dequeue(); // remove head
        queue.displayQueue();
        System.out.println("Queue/Data is Empty: " + queue.isEmpty());

        System.out.println("Size of the queue: " + queue.sizeData());
    }
}
