package activities;


import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
	
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("ram");
        myList.add("shyam");
        myList.add("manohar");
        myList.add("vikas");
        myList.add("kunal");
        
        System.out.println("Print All the names:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd name in the list is: " + myList.get(2));
        System.out.println("Is manohar is in list: " + myList.contains("manohar"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("kunal");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}