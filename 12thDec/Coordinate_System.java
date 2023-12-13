// We will make a class called Point, a class called Shape (Line, Circle), and a class called Coordinate System

// Point class
class Point {
    // Attributes
    private int x;
    private int y;

    // Constructor

    // Default Constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Methods

    // Getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y= y;
    }

    // toString
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    // equals
    public boolean equals(Point p) {
        return (this.x == p.x && this.y == p.y);
    }

    // distance
    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

// Shape class
class Shape {
    // Attributes
    private int slope;
    private int intercept;
    private Point center;
    private int radius;
    private boolean isCircle;

    // Constructor

    // Default Constructor
    public Shape() {
        this.slope = 0;
        this.intercept = 0;
        this.center = new Point();
        this.radius = 0;
        this.isCircle = false;
    }

    // Parameterized Constructor
    public Shape(int slope, int intercept, Point center, int radius, boolean isCircle) {
        this.slope = slope;
        this.intercept = intercept;
        this.center = new Point(center);
        this.radius = radius;
        this.isCircle = isCircle;
    }

    // Parameterized Constructor for Line
    public Shape(int slope, int intercept) {
        this.slope = slope;
        this.intercept = intercept;
        this.center = new Point();
        this.radius = 0;
        this.isCircle = false;
    }

    // Parameterized Constructor for Circle
    public Shape(Point center, int radius) {
        this.slope = 0;
        this.intercept = 0;
        this.center = new Point(center);
        this.radius = radius;
        this.isCircle = true;
    }

    // Copy Constructor
    public Shape(Shape s) {
        if (s.getIsCircle()) {
            this.slope = 0;
            this.intercept = 0;
            this.center = new Point(s.getCenter());
            this.radius = s.getRadius();
            this.isCircle = true;
        } else {
            this.slope = s.getSlope();
            this.intercept = s.getIntercept();
            this.center = new Point();
            this.radius = 0;
            this.isCircle = false;
        }
    }

    // Methods

    // Getters
    public int getSlope() {
        return this.slope;
    }

    public int getIntercept() {
        return this.intercept;
    }

    public Point getCenter() {
        return this.center;
    }

    public int getRadius() {
        return this.radius;
    }

    public boolean getIsCircle() {
        return this.isCircle;
    }


    // Setters

    public void setSlope(int slope) {
        this.slope = slope;
    }

    public void setIntercept(int intercept) {
        this.intercept = intercept;
    }

    public void setCenter(Point center) {
        this.center = new Point(center);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setIsCircle(boolean isCircle) {
        this.isCircle = isCircle;
    }

    // toString
    public String toString() {
        if (this.isCircle) {
            return "Circle with center " + this.center.toString() + " and radius " + this.radius;
        } else {
            return "Line with slope " + this.slope + " and intercept " + this.intercept;
        }
    }

    // equals
    public boolean equals(Shape s) {
        if (this.isCircle != s.isCircle) {
            return false;
        } else {
            if (this.isCircle) {
                return (this.center.equals(s.center) && this.radius == s.radius);
            } else {
                return (this.slope == s.slope && this.intercept == s.intercept);
            }
        }
    }

    // distance
    public double distance(Shape s) {
        if (this.isCircle != s.isCircle) {
            return -1;
        } else {
            if (this.isCircle) {
                return this.center.distance(s.center);
            } else {
                return Math.abs(this.intercept - s.intercept) / Math.sqrt(1 + Math.pow(this.slope, 2));
            }
        }
    }
}

// Coordinate System class
class Coordinate_System {
    // Attributes

    // Axes
    private Shape x_axis;
    private Shape y_axis;

    // Array of Points
    private Point[] points;

    // Array of Shapes
    private Shape[] shapes;

    // Constructor

    // Default Constructor
    public Coordinate_System() {
        this.x_axis = new Shape(0, 0); // this is the line y = 0
        this.y_axis = new Shape(0, 0); // but this is not the line x = 0, so this is a shortcoming of y = mx + c
        this.points = new Point[0];
        this.shapes = new Shape[0];
    }

    // Parameterized Constructor
    public Coordinate_System(Shape x_axis, Shape y_axis, Point[] points, Shape[] shapes) {
        this.x_axis = new Shape(x_axis);
        this.y_axis = new Shape(y_axis);
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i]);
        }
        this.shapes = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            this.shapes[i] = new Shape(shapes[i]);
        }
    }

    // Copy Constructor
    public Coordinate_System(Coordinate_System c) {
        this.x_axis = new Shape(c.x_axis);
        this.y_axis = new Shape(c.y_axis);
        this.points = new Point[c.points.length];
        for (int i = 0; i < c.points.length; i++) {
            this.points[i] = new Point(c.points[i]);
        }
        this.shapes = new Shape[c.shapes.length];
        for (int i = 0; i < c.shapes.length; i++) {
            this.shapes[i] = new Shape(c.shapes[i]);
        }
    }

    // Methods

    // Getters
    public Shape getXAxis() {
        return this.x_axis;
    }

    public Shape getYAxis() {
        return this.y_axis;
    }

    public Point[] getPoints() {
        return this.points;
    }

    public Shape[] getShapes() {
        return this.shapes;
    }

    // Setters
    public void setXAxis(Shape x_axis) {
        this.x_axis = new Shape(x_axis);
    }

    public void setYAxis(Shape y_axis) {
        this.y_axis = new Shape(y_axis);
    }

    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i]);
        }
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            this.shapes[i] = new Shape(shapes[i]);
        }
    }

    // toString
    public String toString() {
        String s = "Coordinate System with x-axis " + this.x_axis.toString() + " and y-axis " + this.y_axis.toString() + "\n";
        s += "Points: ";
        for (int i = 0; i < this.points.length; i++) {
            s += this.points[i].toString() + " ";
        }
        s += "\nShapes: ";
        for (int i = 0; i < this.shapes.length; i++) {
            s += this.shapes[i].toString() + " ";
        }
        return s;
    }

    // equals
    public boolean equals(Coordinate_System c) {
        if (!this.x_axis.equals(c.x_axis) || !this.y_axis.equals(c.y_axis)) {
            return false;
        }
        return true;
    }


    // Main method to test the code
    public static void main(String args[]) {
        // Testing Point class
        Point p1 = new Point();
        Point p2 = new Point(1, 2);
        Point p3 = new Point(p2);
        System.out.println("Point 1: " + p1.toString());
        System.out.println("Point 2: " + p2.toString());
        System.out.println("Point 3: " + p3.toString());
        System.out.println("Point 1 equals Point 2: " + p1.equals(p2));
        System.out.println("Point 2 equals Point 3: " + p2.equals(p3));
        System.out.println("Distance between Point 1 and Point 2: " + p1.distance(p2));
        System.out.println("Distance between Point 2 and Point 3: " + p2.distance(p3));

        // Testing Shape class
        Shape s1 = new Shape();
        Shape s2 = new Shape(1, 2);
        Shape s3 = new Shape(p2, 3);
        Shape s4 = new Shape(s2);
        System.out.println("Shape 1: " + s1.toString());
        System.out.println("Shape 2: " + s2.toString());
        System.out.println("Shape 3: " + s3.toString());
        System.out.println("Shape 4: " + s4.toString());
        System.out.println("Shape 1 equals Shape 2: " + s1.equals(s2));
        System.out.println("Shape 2 equals Shape 3: " + s2.equals(s3));
        System.out.println("Shape 2 equals Shape 4: " + s2.equals(s4));
        System.out.println("Distance between Shape 1 and Shape 2: " + s1.distance(s2));
        System.out.println("Distance between Shape 2 and Shape 3: " + s2.distance(s3));
        System.out.println("Distance between Shape 2 and Shape 4: " + s2.distance(s4));

        // Testing Coordinate_System class
        Coordinate_System c1 = new Coordinate_System();
        Coordinate_System c2 = new Coordinate_System(s2, s3, new Point[]{p1, p2, p3}, new Shape[]{s1, s2, s3, s4});
        Coordinate_System c3 = new Coordinate_System(c2);
        System.out.println("Coordinate System 1: " + c1.toString());
    }
}