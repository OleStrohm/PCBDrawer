package no.strohm.PCBPainter.util;

/**
 * Created by Ole on 14.04.2017.
 */
public class Vector2f {

    private float x, y;

    public Vector2f() {
        x = 0.0f;
        y = 0.0f;
    }

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float distance(Vector2f other) {
        return (float) Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
    }

    public static float distance(Vector2f p1, Vector2f p2) {
        return p1.distance(p2);
    }

    public Vector2f set(float x, float y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public Vector2f setX(float x) {
        this.x = x;
        return this;
    }

    public Vector2f setY(float y) {
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
