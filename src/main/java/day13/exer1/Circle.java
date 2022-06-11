package day13.exer1;

/**
 * @author capensis
 */
public class Circle extends GeometricObject {

	private double radius;
	
	public Circle(double radius,String color, double weight) {
		super(color, weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double findArea(){
		return 3.14 * radius * radius;
	}

}