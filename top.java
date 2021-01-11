import top.mip;
class shape{
    String s = "this is a shape";
    // public String toString() {return s;}
    shape(){
        System.out.println("shape constructor");
    }
    void draw() { 
        System.out.println("shape.draw");
    }
}

class circle extends shape{
    circle(){
        System.out.println("circle constructor");
    }
    void draw() {
        System.out.println("circle.draw");
    }
}

class top {
    public static void main(String[] args){
        shape tes_shape = new shape();
        // System.out.println(tes_shape.s);
        // tes_shape.draw();
        top.draw_line(tes_shape);
        tes_shape = new circle();
        // System.out.println(tes_shape.s);
        // tes_shape.draw();
        top.draw_line(tes_shape);
    }
    static void draw_line(shape test_shape){
        test_shape.draw();
    }
}
