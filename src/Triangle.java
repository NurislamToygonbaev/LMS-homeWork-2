import static java.lang.StringTemplate.STR;

public class Triangle {
    int a;
    int b;
    int c;

    public void area() {
        int d = (a + b + c) / 2;
        int areaOfTriangle = (int) Math.sqrt(d * (d - a) * (d - b) * (d - c));
        System.out.println(STR. "прощадь триугольника: \{ areaOfTriangle }" );
        ;
    }
}