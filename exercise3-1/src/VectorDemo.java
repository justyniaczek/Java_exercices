public class VectorDemo {
    public static void main(String[] args) {
        Vector vector1 = new Vector(555,4,9);
        Vector vector2 = new Vector ( 2,3,6);
        Vector vector3 = new Vector();


        System.out.println("v1 on the beginning : " + vector1);
        System.out.println("v2 on the beginning : " + vector2);
        System.out.println("v3 on the beginning : " + vector3);

        vector1.add(vector2);
        vector2.minus(vector3);

        System.out.println("v1: " + vector1);
        System.out.println("v2: " + vector2);
        System.out.println("v3: " + vector3);

    }
}
