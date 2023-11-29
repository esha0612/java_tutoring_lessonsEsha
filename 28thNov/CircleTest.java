package 28thNov;

class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point obj) {
        this.x = obj.x;
        this.y = obj.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public double distance(Point obj) {
        return Math.sqrt(Math.pow((this.x - obj.x), 2) + Math.pow((this.y - obj.y), 2));
    }
}

class Circle {
    private Point center;
    private int radius;

    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }

    public Circle(Point center, int radius) {
        this.center = new Point(center);
        this.radius = radius;
    }

    public Circle(Circle obj) {
        this.center = new Point(obj.center);
        this.radius = obj.radius;
    }

    public void setCenter(Point center) {
        this.center = new Point(center);
    }

    public Point getCenter() {
        return this.center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    // Returns the area of the circle
    public double area() {
        // YOUR CODE HERE
        return Math.PI*getRadius()*getRadius();
    }

    // Returns the circumference of the circle
    public double circumference() {
        // YOUR CODE HERE
        return 2*Math.PI*getRadius();
    }

    // Returns the distance between the centers of the two circles
    public double distance(Circle obj) {
        // YOUR CODE HERE
        return this.center.distance(obj.getCenter());
    }

    // Returns the distance between the center of the circle and the point
    public double distance(Point obj) {
        // YOUR CODE HERE
        return this.center.distance(obj);
    }
    
    // Return true if the point lies inside the circle, false otherwise
    public boolean isInside(Point obj) {
        // YOUR CODE HERE
        return this.center.distance(obj) < getRadius();
    }

    // Return true if the circle lies inside the circle, false otherwise
    public boolean isInside(Circle obj) {
        // YOUR CODE HERE
        return this.center.distance(obj.getCenter()) < getRadius() - obj.getRadius();
    }

    // Return true if the circle intersects the circle, false otherwise
    public boolean intersects(Circle obj) {
        // YOUR CODE HERE
        return this.center.distance(obj.getCenter()) <= getRadius() + obj.getRadius() && !isInside(obj) && !obj.isInside(this);
    }

    // Return true if the cirlces have a common tangent, false otherwise
    // This is the same as the cirecles having a common point
    public boolean tangent(Circle obj) {
        // YOUR CODE HERE
        return this.center.distance(obj.getCenter()) == getRadius() + obj.getRadius();
    }

    // Return true if the circle lies outside the circle, false otherwise
    public boolean isOutside(Circle obj) {
        // YOUR CODE HERE
        return this.center.distance(obj.getCenter()) > getRadius() + obj.getRadius();
    }
}

public class CircleTest {    
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(p1);
        p2.setX(3);
        System.out.println(p1.getX() + " " + p2.getX());

        Circle c1 = new Circle();
        Circle c2 = new Circle(c1);
        c2.setRadius(5);
        System.out.println(c1.getRadius() + " " + c2.getRadius());

        Circle c3 = new Circle(p1, 5);
        System.out.println(c3.getCenter().getX() + " " + c3.getRadius());

        System.out.println(c3.area());
        System.out.println(c3.circumference());

        System.out.println(c3.distance(c2));
        System.out.println(c3.distance(p1));
        
        System.out.println(c3.isInside(c2));
        System.out.println(c3.isInside(p1));

        System.out.println(c3.intersects(c2));

        System.out.println(c3.tangent(c2));

        System.out.println(c3.isOutside(c2));
    }
}
