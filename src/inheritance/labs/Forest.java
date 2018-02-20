package inheritance.labs;

public class Forest {
    private double treeCanopyCover; // Percentage
    private String forestFloor; // Describes the characteristics of the forest floor
    private String understory; // Describes the characteristics of the understory
    private String canopy; // Describes the characteristics of the canopy
    private double area; // Square miles
    private double avgRainfall; // Inches


    public Forest() {
        treeCanopyCover = 0.6;
        forestFloor = "";
        understory = "";
        canopy = "";
        area = 0.0;
        avgRainfall = 0.0;
    }

    public Forest(double area) {
        this.area = area;
        treeCanopyCover = 0.6;
        forestFloor = "";
        understory = "";
        canopy = "";
        avgRainfall = 0.0;
    }

    public Forest(double treeCanopyCover, String forestFloor, String understory, String canopy, double area, double avgRainfall) {
        this.treeCanopyCover = treeCanopyCover;
        this.forestFloor = forestFloor;
        this.understory = understory;
        this.canopy = canopy;
        this.area = area;
        this.avgRainfall = avgRainfall;
    }

    public double getTreeCanopyCover() {
        return treeCanopyCover;
    }

    public void setTreeCanopyCover(double treeCanopyCover) {
        this.treeCanopyCover = treeCanopyCover;
    }

    public String getForestFloor() {
        return forestFloor;
    }

    public void setForestFloor(String forestFloor) {
        this.forestFloor = forestFloor;
    }

    public String getUnderstory() {
        return understory;
    }

    public void setUnderstory(String understory) {
        this.understory = understory;
    }

    public String getCanopy() {
        return canopy;
    }

    public void setCanopy(String canopy) {
        this.canopy = canopy;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAvgRainfall() {
        return avgRainfall;
    }

    public void setAvgRainfall(double avgRainfall) {
        this.avgRainfall = avgRainfall;
    }
}