public class Circle{

	private double radius;

	Point centerPoint;

		public void setPoint(Point p){
			centerPoint = p;
		}

		public Point getPoint(){
			return centerPoint;
		}
	
		public void setRadius(double radius){
			this.radius = radius;
		}

		public double getRadius(){
			return radius;
		}

}