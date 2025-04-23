class Circle {
    private Point center;
    private int radius;
    
    public Circle(Point center, int radius) {
        center = center;
        radius = radius;
    }
    
    public Point getCenter() {
        return center;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void setCenter(Point center) {
        center = center;
    }
    
    public void setRadius(int radius) {
        radius = radius;
    }
    
    public boolean equals(Circle other) {
        return radius == other.radius;
    }
    
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    
    public String toString() {
        return "Circle with center at " + center + " and radius of " + radius;
    }
}