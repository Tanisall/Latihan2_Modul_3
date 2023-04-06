package Modul3WithoutLib;

public class FirstLastList {
    public Link first;
    public Link last;
    private int queueSize;

    public FirstLastList(){
        first = null;
        last = null;
        queueSize = 0;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public int size(){
        return queueSize;
    }
    public void insertLast(String dd){
        Link newLink = new Link(dd);
        if(isEmpty()){
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
        queueSize++;
    }

    public String deleteFirst(){
        String temp =(String) first.dData;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        queueSize--;
        return temp;
    }

    public void displayList(){
        Link current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
}
