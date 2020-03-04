class Box {
    private double width;
    private double height;
    private double depth;
    private double mass;
    private double density;

    void setWidth (double width) {
        this.width = width;
    }
    void setHeight (double height) {
        this.height = height;

    }
    void setDepth (double depth) {
        this.depth = depth;
    }
    void setMass (double mass) {
        this.mass = mass;

    }
    double getDensity() {
        density = mass / (width*height*depth);
        return density;
    }
    Box (double width, double height, double depth) {
     this.width = width;
     this.height = height;
     this.depth = depth;
    }
     
}