package test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class ProductStreamExample{  
    int id;  
    String name;  
    float price;  
    public ProductStreamExample(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 
public class JavaStreamExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProductStreamExample> ProductStreamExamplesList = new ArrayList<ProductStreamExample>();  
        //Adding ProductStreamExamples  
        ProductStreamExamplesList.add(new ProductStreamExample(1,"HP Laptop",25000f));  
        ProductStreamExamplesList.add(new ProductStreamExample(2,"Dell Laptop",30000f));  
        ProductStreamExamplesList.add(new ProductStreamExample(3,"Lenevo Laptop",28000f));  
        ProductStreamExamplesList.add(new ProductStreamExample(4,"Sony Laptop",28000f));  
        ProductStreamExamplesList.add(new ProductStreamExample(5,"Apple Laptop",90000f));  
        List<Float> ProductStreamExamplePriceList2 =ProductStreamExamplesList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(ProductStreamExamplePriceList2);  
	}

}
