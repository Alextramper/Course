class Box {
    int Pi;
    int r;
}
class Box1 {
    public static void main (String args []) {
        Box mybox = new Box();
        int s;
        mybox.Pi = 13;
        mybox.r = 19;
        s = mybox.Pi + mybox.r;
        System.out.println(s);
    }
}