package inferno.rejoit.client.models;

import org.joml.Vector3f;

public class ModelCube extends Model{
    public ModelCube() {
        super( new Triangle[]{
                new Triangle(new Vector3f(0,0,0), new Vector3f(1,0,0), new Vector3f(1,0,1)),
                new Triangle(new Vector3f(0,0,0), new Vector3f(0,0,1), new Vector3f(1,0,1)),

                new Triangle(new Vector3f(0,0,0), new Vector3f(1,0,0), new Vector3f(1,1,0)),
                new Triangle(new Vector3f(0,0,0), new Vector3f(0,1,0), new Vector3f(1,1,0)),

                new Triangle(new Vector3f(0,0,0), new Vector3f(0,0,1), new Vector3f(0,1,1)),
                new Triangle(new Vector3f(0,0,0), new Vector3f(0,1,0), new Vector3f(0,1,1)),

                new Triangle(new Vector3f(1,0,1), new Vector3f(1,1,1), new Vector3f(1,1,0)),
                new Triangle(new Vector3f(1,0,1), new Vector3f(1,0,0), new Vector3f(1,1,0)),

                new Triangle(new Vector3f(1,0,1), new Vector3f(1,1,1), new Vector3f(0,1,1)),
                new Triangle(new Vector3f(1,0,1), new Vector3f(0,0,1), new Vector3f(0,1,1)),

                new Triangle(new Vector3f(0,1,0), new Vector3f(0,1,1), new Vector3f(1,1,1)),
                new Triangle(new Vector3f(0,1,0), new Vector3f(1,1,0), new Vector3f(1,1,1))
        });
    }
}
