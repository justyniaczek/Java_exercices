public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(){
        this.x = 0;
        this.y= 0;
        this.z = 0;
    }
    public Vector(double x, double y, double z ){
        this.x = x;
        this.y= y;
        this.z = z;
    }

    public void add(Vector v){
        this.x += v.x;
        this.y += v.y;
        this.z += v.z;
    }

    public void minus(Vector v){
        this.x -= v.x;
        this.y -= v.y;
        this.z -= v.z;
    }

    @Override
    public String toString(){
        return "Vector " + x + " "+y+" " +z;
    }
}
