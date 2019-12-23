package inferno.rejoit.client.models;

import org.joml.Vector3f;

public class Triangle {
    private Vector3f point1;
    private Vector3f point2;
    private Vector3f point3;

    public Triangle(Vector3f point1, Vector3f point2, Vector3f point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Vector3f getPoint1() {
        return point1;
    }

    public Vector3f getPoint2() {
        return point2;
    }

    public Vector3f getPoint3() {
        return point3;
    }
}
