package no.strohm.PCBPainter.elements;

import no.strohm.PCBPainter.util.Vector2f;

/**
 * Created by Ole on 14.04.2017.
 */
public class Circle {

	private Vector2f center;
	private float radius;

	public Circle(Vector2f center, float radius) {
		if (center != null)
			this.center = center;
		else
			this.center = new Vector2f(0.0f, 0.0f);

		this.radius = Math.abs(radius);
	}

	public Vector2f getCenter() {
		return center;
	}

	public Circle setCenter(Vector2f center) {
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
