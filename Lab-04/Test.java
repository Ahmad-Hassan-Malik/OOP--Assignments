import java.util.Scanner;

public class Test{

	public static void main(String args[]){

		    System.out.println("To add product Enter: 1");
			System.out.println("To sell product Enter: 2");
			System.out.println("To update product Enter: 3");
			System.out.println("To delete product Enter: 4");
			System.out.println("To display products Enter: 5");
			System.out.println("To display Shop details Enter: 6");

		Shop shop = new Shop("The Ahmad's Shop","Lahore", new Person("Ali", "Ali@gmail.com"));
		Scanner sp = new Scanner(System.in);
		while(true){
			
			System.out.printf("\nEnter your choice: ");
			int choice = sp.nextInt();
			sp.nextLine();

		switch(choice) {
			case 1:
				shop.addProduct();
				break;
			case 2:
				shop.sellProduct();
				break;
			case 3:
				shop.updateProduct();
				break;
			case 4:
				shop.removeProduct();
				break;
			case 5:
				shop.displayProduct();
				break;
			case 6:
				shop.displayShopDetails();
				break;
			case 0:
				System.exit(0);
			break;
			default:
				System.out.println("Invalid choice. Try again.");

		}

		}

	}


}