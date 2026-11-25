package productCatalog;

public class Main {

	public static void main(String[] args) {

		ProductService service = new ProductService();
		
		service.addProduct(new Product(1,"Laptop", "Electronics", 20000));
		service.addProduct(new Product(2,"Mobile","Electronics",12000));
		service.addProduct(new Product(3,"Mouse","Accessories",2000));
		service.addProduct(new Product(4,"KeyBoard","Accessories",4000));
		

		System.out.println("Display Products");
		System.out.println("----------------");
		service.displayProducts();
		
		System.out.println("----------------------");
		System.out.println("Get Products");
		System.out.println("--------------");
		System.out.println(service.getProduct());
		
		System.out.println("----------------------");
		System.out.println("get Highest Product");
		System.out.println("---------------------");
		System.out.println(service.gethighestProduct());
		
		System.out.println("----------------------");		
		System.out.println("get Lowest Product");
		System.out.println("----------------------");
		System.out.println(service.getLowestProduct());
		
		System.out.println("----------------------");
		System.out.println("get Product By Id");
		System.out.println("------------------");
		System.out.println(service.getProductById(2));

		System.out.println("----------------------");
		System.out.println("Sort Products Ascending order");
		System.out.println("-----------------------------");
		System.out.println(service.sortProductASC());
		
		System.out.println("----------------------");
		System.out.println("sort Products in Descending order");
		System.out.println("-----------------------------------");
		System.out.println(service.sortProductDESC());
		
		System.out.println("----------------------");
		System.out.println("Group products by Category");
		System.out.println("------------------------------");
		System.out.println(service.groupByCategory());
	
		System.out.println("----------------------");
		System.out.println("Count Products by category");
		System.out.println("--------------------------");
		System.out.println(service.countByCategory());
		
		System.out.println("----------------------");
		System.out.println("Search Products");
		System.out.println("-----------------");
		System.out.println(service.searchProduct(3));
		
		System.out.println("----------------------");
		System.out.println("Update Products");
		System.out.println("-----------------");
		service.updateProducts(2, 400000);
		
		System.out.println("----------------------");
		System.out.println("Delete Products");
		System.out.println("---------------------");
		service.deleteProduct(4);
		
		System.out.println("----------------------");
		System.out.println("Display Final Products");
		System.out.println("--------------------------");
		service.displayProducts();
	}

}
