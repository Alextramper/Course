package Course.fugure;

public  abstract class Figure {
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   abstract int area();
   abstract int perimeter();

}
