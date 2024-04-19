class Ball{
    double radius;
    String color;
}
class Box {
    double height;
    Ball ball;
    Box(double h){
        height = h;
    }
    double getRadius(){
        return ball.radius;
    }
    double getVolume(){
        return height * height * height;
    }
}

public class Classes {
    public static void main(String[] args) {
        Ball blueBall = new Ball();
        blueBall.color = "blue";
        blueBall.radius = 2.0;
        System.out.println("Second ball is " + blueBall.color + ". Ball's radius is " + blueBall.radius);
        Box box = new Box(2);
        box.ball = blueBall;
        System.out.println("Color of ball in the box is " + box.ball.color);
        System.out.println("Radius of ball in the box is " + box.getRadius());
        System.out.println("Volume of the box is " + box.getVolume());
        Box bigBox = new Box(5);
        System.out.println("Volume of big box is " + bigBox.getVolume());
    }
}
