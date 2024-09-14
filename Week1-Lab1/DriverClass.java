public class DriverClass {

	public static void main(String[] args) {
	
	Rectangle r = new Rectangle();
	double area = r.calArea();
	System.out.printf("Area is %f\n",area);

	double perimeter = r.calPerimeter();
	System.out.printf("Perimeter is %f",perimeter);

	Circle c1 = new Circle();
	double area2 = c1.calArea();
	System.out.printf("Area of circle is = %.2f\n",area2);

	Circle c2 = new Circle();
	public double radius1 = 3.0;
	double circumpherence = c2.calCircumfarence();
	System.out.printf("circumpharence of Circle is = %.2f", circumpherence);
}


}