public class Demo{

	public static void main(String args[]){
		
		Circle c1 = new Circle();

			c1.setRadius(500);

			c1.setPoint(new Point() );

			Point a = c1.getPoint();

		Rectangle r1 = new Rectangle();

			r1.setLength(150);

			r1.setCenter(new Point() );

			Point c = r1.getCenter();

			System.out.println(c);


	}


}