import java.util.Scanner;

public class Shop{

	private String shopName;
	private String address;
	private Person owner;
	private Product productList[] = new Product[100];

	private static int productCount = 0;
	private static double revenue;

	public Shop(String shopName, String address, Person owner){
		this.shopName = shopName;
		this.address = address;
		this.owner = owner;
		this.productList = new Product[100];
		initializeProducts();
	}

	public void addProduct(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t---Enter Product details---\n");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);
		productList[productCount++] = product;
		System.out.println("\t---Product added Successfully---");
	}


	public void sellProduct(){
		System.out.println("\n\t---Sale Menu---\n");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Product id: ");
		String id = scanner.nextLine();

		boolean found = false;

		for(int i = 0; i < productCount; i++) {
			if(productList[i].getId().equals(id)) {
				productList[i].setQuantity(productList[i].getQuantity()-1);
				revenue = revenue + productList[i].getPrice();
				System.out.println("\n\t---Product sold successfully---");
				found = true;
				break;
			}
		}
		if(!found){
			System.out.println("\t---Product not found---\n");
		}
	}

	
	public void updateProduct(){

		System.out.println("\n\t---Update product menu---\n");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the product id: ");
		String id = sc.nextLine();

		boolean found = false;

		for(int i = 0; i < productCount; i++){
			if(productList[i].getId().equals(id)) {
				System.out.print("Enter the new name of Product: ");
				String newName = sc.nextLine();
				productList[i].setName(newName);
				System.out.println("\t---Product name updated successfully---");
				found = true;
				break;
			}
		}
		if(!found){
			System.out.println("\t---Product not found---\n");
		}
	}


	public void removeProduct(){

		System.out.println("\n\t---Delete product menu---\n");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the product id: ");
		String id = sc.nextLine();

		boolean found = false;

		for(int i = 0; i < productCount; i++) {
			if(productList[i].getId().equals(id)) {
				for(int j = i; j < productCount-1; j++) {
					productList[j] = productList[j+1];
				}
			productList[--productCount] = null;
			System.out.println("\n\t---Product removed successfully---");
			found = true;
			break;
			}
		}
		if(!found) {
			System.out.println("\t---Product not found---\n");
		}
	}

	
	public void displayProduct(){
		System.out.println("\n\t---The products details---\n");
		for(int i = 0; i < productCount; i++){
			System.out.println(productList[i]);
		}
	}

	public void displayShopDetails(){
		System.out.println("\n\t---Shop Details---\n");
		System.out.printf("Shop Name: %21s\n", shopName);
		System.out.println(owner);
		System.out.printf("Shop Address: %8s\n", address);

	}

	public void initializeProducts(){

		productList[productCount++] = new Product("Computer", 500, 10);
		productList[productCount++] = new Product("Laptop", 800, 9);
		productList[productCount++] = new Product("Bat", 200, 20);
		productList[productCount++] = new Product("Mouse", 100, 10);
		productList[productCount++] = new Product("Rice", 300, 15);
		productList[productCount++] = new Product("Charger", 5050, 17);
		productList[productCount++] = new Product("Wheat", 5100, 18);
		productList[productCount++] = new Product("Apple", 100, 4);
		productList[productCount++] = new Product("Mango", 200, 5);
		productList[productCount++] = new Product("Banana", 550, 12);

	}	













}