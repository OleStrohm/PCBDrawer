package no.strohm.PCBPainter.elements;

/**
 * Created by Ole on 14.04.2017.
 */
public class Point {

	private float x, y;

	public Point() {
		x = 0.0f;
		y = 0.0f;
	}

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float distance(Point other) {
		return (float) Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
	}

	public static float distance(Point p1, Point p2) {
		return p1.distance(p2);
	}

	public Point set(float x, float y) {
		this.x = x;
		this.y = y;
		return this;
	}

	public Point setX(float x) {
		this.x = x;
		return this;
	}

	public Point setY(float y) {
		this.y = y;
		return this;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

}
