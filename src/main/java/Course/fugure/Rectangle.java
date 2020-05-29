package Course.fugure;

public class Rectangle extends Figure implements Drawable{
    int length = 10;
    int width = 10;

    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.draw(rectangle);

    for(int i=0; i<3; i++) {
        System.out.println();
        for(int j=0; j<10; j++ ) {
            if(i == 1 & j>0 & j<9 ) {
                System.out.print(" ");
            } else if (i==1) {
                System.out.print("|");
                if(j==9) System.out.print(" - прямоугольник цвета " + rectangle.getColor());
            } else {
                System.out.print("-");
            }
        }
    }
    }

    public String figureCheck() {
        int length = this.length;
        int width = this.width;
        String whatIs = null;
        if (length == width) {
            whatIs = "Square";
        } else {
            whatIs = "Rectangle";
        }
        return whatIs;
    }

    @Override
    int area() {
        int a = this.length;
        int b = this.width;
        return a*b;
    }

    @Override
    int perimeter() {
        int a = this.length;
        int b = this.width;
        return (a+b)*2;
    }

    @Override
    public void draw(Rectangle rectangle) {
        rectangle.setColor("Green");
        System.out.println(rectangle.figureCheck() + ", " + rectangle.length + "x" + rectangle.width +
                ", " + rectangle.area() + ", " + rectangle.perimeter() + ", " + rectangle.getColor());
    }
}

