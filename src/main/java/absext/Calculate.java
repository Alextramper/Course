package absext;

public class Calculate {
    public static void main(String[] args) {

        Rectangle R = new Rectangle(10, 20);
        Triangle T = new Triangle(15, 16);
        Figure link;

        link = R;
        System.out.println("Площадь равна " + link.area());

        link = T;
        System.out.println("Площадь равна " + link.area());
    }
}
