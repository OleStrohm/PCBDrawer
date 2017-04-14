package no.strohm.PCBPainter.elements;

/**
 * Created by Ole on 14.04.2017.
 */
public class Line {

	private Point p1;
	private Point p2;

	public Line(Point p1, Point p2) {
		if(p1 != null)
			this.p1 = p1;

		this.p2 = p2;
	}

	public Point getClosestEndPointTo(Point cursor) {
		return cursor.distance(p1) < cursor.distance(p2) ? p1 : p2;
	}

}
