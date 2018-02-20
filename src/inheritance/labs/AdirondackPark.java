package inheritance.labs;

/* Models a specific forest. While I suppose I could have put some of these instance variables in a ForestPark class or
   some such, there are only three classes in this example, so they seem appropriate here.
 */

public class AdirondackPark extends TemperateDeciduousForest {
    private String location;
    private int lowestElevation;
    private int highestElevation;
    private double amountPublicLand;
    private int touristNumbers;
    private int year;

    public AdirondackPark() {
        super(9375.0); // sq mi
        location = "New York";
        lowestElevation = 120; // feet
        highestElevation = 5344;
        amountPublicLand = 0.44; // percent
        touristNumbers = 0;
        year = 1900;
    }

    public AdirondackPark(double treeCanopyCover, String forestFloor, String understory, String canopy,
                          double area, double avgRainfall, String hemisphere, int touristNumbers, int year) {
        super(treeCanopyCover, forestFloor, understory, canopy, area, avgRainfall, hemisphere);
        this.touristNumbers = touristNumbers;
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLowestElevation() {
        return lowestElevation;
    }

    public void setLowestElevation(int lowestElevation) {
        this.lowestElevation = lowestElevation;
    }

    public int getHighestElevation() {
        return highestElevation;
    }

    public void setHighestElevation(int highestElevation) {
        this.highestElevation = highestElevation;
    }

    public double getAmountPublicLand() {
        return amountPublicLand;
    }

    public void setAmountPublicLand(double amountPublicLand) {
        this.amountPublicLand = amountPublicLand;
    }

    public int getTouristNumbers() {
        return touristNumbers;
    }

    public void setTouristNumbers(int touristNumbers) {
        this.touristNumbers = touristNumbers;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Calls on the immediate superclass to change the season.
    public void changeSeason() {
        super.changeSeason();
    }
}