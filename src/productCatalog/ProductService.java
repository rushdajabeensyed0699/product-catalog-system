package productCatalog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductService {

	
	//How to store Product data using ArrayList like create duplicate database
	
	List<Product> products = new ArrayList<>();
	
	
	//CRUD Operation
	
	//CREATE/addProduct()
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	//READ//View Products/display
	
	public void displayProducts() {
		products.forEach(System.out::println);
	}
	
   //getProducts
	public List<Product> getProduct(){
		return products;
		
	}
	
	//getHighestProduct
	public Product gethighestProduct() {
		return products.stream()
				.max(Comparator.comparing(Product :: getPrice))
				.orElse(null);
	}
	
	//getLowestProduct
	public Product getLowestProduct() {
		return products.stream()
				.min(Comparator.comparing(Product :: getPrice))
				.orElse(null);
	}
	
	//getProductById
	public Product getProductById(int id) {
		return products.stream()
				.filter(p -> p.getId() == id)
				.findFirst()
				.orElse(null);
	}
	
	//sortProductasc
	public List<Product> sortProductASC(){
		return products.stream()
				.sorted(Comparator.comparing(Product :: getPrice))
				.collect(Collectors.toList());
	}
	
	//sortProductDesc
	public List<Product> sortProductDESC(){
		return products.stream()
				.sorted(Comparator.comparing(Product :: getPrice).reversed())
				.collect(Collectors.toList());
	}
	
	//groupByCategory
	public Map<String,List<Product>> groupByCategory(){
		return products.stream()
				.collect(Collectors.groupingBy(Product::getCategory));
	}
	
	//count ByCategory
	public Map<String, Long> countByCategory(){
		return products.stream()
				.collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));
	}
	
	//Search Product
	public Product searchProduct(int id) {
		return products.stream()
				.filter(p -> p.getId() == id)
				.findFirst()
				.orElse(null);
	}
	//update Product
	public void updateProducts(int id, double newPrice) {
		Product product= searchProduct(id);
		if(product!=null) {
			product.setPrice(newPrice);
			System.out.println("Price Updated");
		}else {
			System.out.println(" product not found to update");
		}
		
	}
	//Remove Product
	public void deleteProduct(int id) {
		products.removeIf(p -> p.getId() == id);
		System.out.println("Deleted");
	
	}
}
