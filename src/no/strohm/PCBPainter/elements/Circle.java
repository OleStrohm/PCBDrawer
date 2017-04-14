package no.strohm.PCBPainter.elements;

/**
 * Created by Ole on 14.04.2017.
 */
public class Circle {

	private Point center;
	private float radius;

	public Circle(Point center, float radius) {
		if (center != null)
			this.center = center;
		else
			this.center = new Point(0.0f, 0.0f);

		this.radius = Math.abs(radius);
	}

	public Point getCenter() {
		return center;
	}

	public Circle setCenter(Point center) {
		if (center != null)
			this.center = center;
		return this;
	}

	public float getRadius() {
		return radius;
	}

	public Circle setRadius(float radius) {
		this.radius = Math.abs(radius);
		return this;
	}
}
