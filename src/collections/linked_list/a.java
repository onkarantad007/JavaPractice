package collections.linked_list;

import java.util.*;
class TestJavaCollection2{
    public static void main(String args[]){
        List<String> al=new LinkedList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}