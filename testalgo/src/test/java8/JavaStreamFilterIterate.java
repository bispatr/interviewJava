package test.java8;

import java.util.*;  
class ProductJavaStreamFilterIterate{  
    int id;  
    String name;  
    float price;  
    public ProductJavaStreamFilterIterate(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamFilterIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProductJavaStreamFilterIterate> productsList = new ArrayList<ProductJavaStreamFilterIterate>();  
        //Adding Products  
        productsList.add(new ProductJavaStreamFilterIterate(1,"HP Laptop",25000f));  
        productsList.add(new ProductJavaStreamFilterIterate(2,"Dell Laptop",30000f));  
        productsList.add(new ProductJavaStreamFilterIterate(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductJavaStreamFilterIterate(4,"Sony Laptop",28000f));  
        productsList.add(new ProductJavaStreamFilterIterate(5,"Apple Laptop",90000f));  
        // This is more compact approach for filtering data  
        productsList.stream()  
                             .filter(product -> product.price == 30000)  
                             .forEach(product -> System.out.println(product.name));    
	}

}
