package no.strohm.PCBPainter.elements;

import no.strohm.PCBPainter.util.Vector2f;

/**
 * Created by Ole on 14.04.2017.
 */
public class Line {

	private Vector2f p1;
	private Vector2f p2;

	public Line(Vector2f p1, Vector2f p2) {
		if(p1 != null)
			this.p1 = p1;

		this.p2 = p2;
	}

	public Vector2f getClosestEndPointTo(Vector2f cursor) {
		return cursor.distance(p1) < cursor.distance(p2) ? p1 : p2;
	}

}
