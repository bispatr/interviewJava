package test.java8;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface  //It is optional  
interface Drawable{  
    public void draw();  
}  
interface Addable{  
    int add(int a,int b);  
}  
@FunctionalInterface  
interface Sayable{  
    String say(String message);  
}  
public class LambdaExpressionExample2 {  
    public static void main(String[] args) { 
    	multipleStementsDemo();
    	simpleDemo();
        addableDemo();
        listMethod();

    }  
    public static void multipleStementsDemo() {
    	 Sayable person = (message)-> {  
             String str1 = "I would like to say, ";  
             String str2 = str1 + message;   
             return str2;  
         };  
             System.out.println(person.say("time is precious."));  
    }
    public static void simpleDemo() {
    	int width=10;  
        
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw(); 
    }
    public static void addableDemo() {
    	 Addable ad1=(a,b)->(a+b);  
         System.out.println(ad1.add(10,20));  
           
         // Multiple parameters with data type in lambda expression  
         Addable ad2=(int a,int b)->(a+b);  
         System.out.println(ad2.add(100,200)); 
    }
    public static void listMethod() {
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }
}  