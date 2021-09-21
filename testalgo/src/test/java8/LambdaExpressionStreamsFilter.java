package test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ProductLambda{  
    int id;  
    String name;  
    float price;  
    public ProductLambda(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class LambdaExpressionStreamsFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProductLambda> list=new ArrayList<ProductLambda>();  
        list.add(new ProductLambda(1,"Samsung A5",17000f));  
        list.add(new ProductLambda(3,"Iphone 6S",65000f));  
        list.add(new ProductLambda(2,"Sony Xperia",25000f));  
        list.add(new ProductLambda(4,"Nokia Lumia",15000f));  
        list.add(new ProductLambda(5,"Redmi4 ",26000f));  
        list.add(new ProductLambda(6,"Lenevo Vibe",19000f));  
          
        // using lambda to filter data  
        Stream<ProductLambda> filtered_data = list.stream().filter(p -> p.price > 20000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
	}

}
