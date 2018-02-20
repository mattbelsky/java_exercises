package inheritance.labs;

public class TemperateDeciduousForest extends Forest {
    private boolean hasWideLeaves;
    private boolean losesLeaves;
    private boolean understoryLightLevelHigh;
    private String hemisphere;
    private String season;

    public TemperateDeciduousForest() {
        super();
        hasWideLeaves = true;
        losesLeaves = true;
        understoryLightLevelHigh = false;
        hemisphere = "northern";
        season = "summer";
    }

    public TemperateDeciduousForest(double area) {
        super(area);
        hasWideLeaves = true;
        losesLeaves = true;
        understoryLightLevelHigh = false;
        hemisphere = "northern";
        season = "spring";
    }

    public TemperateDeciduousForest(String hemisphere) {
        super();
        this.hemisphere = hemisphere;
        hasWideLeaves = true;
        losesLeaves = true;
        understoryLightLevelHigh = false;
        hemisphere = "northern";
        season = "spring";
    }

    public TemperateDeciduousForest(double treeCanopyCover, String forestFloor, String understory, String canopy,
                                    double area, double avgRainfall, String hemisphere) {
        super(treeCanopyCover, forestFloor, understory, canopy, area, avgRainfall);
        this.hasWideLeaves = true;
        this.losesLeaves = true;
        this.understoryLightLevelHigh = false;
        this.hemisphere = hemisphere;
    }

    // Changes then calls the print method for the season using a predefined array.
    public void changeSeason() {
        String[] seasons = {"spring", "summer", "autumn", "winter"};
        int i = 0;
        try {
            season = seasons[i + 1];
            changeSeason(season);
            i++;
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            i = 0;
            season = seasons[i];
            changeSeason(season);
        }
        printSeason();
    }

    // Accepts the season name (which can be anything) and changes the value of the understory light level if winter.
    // Calls the print method.
    public void changeSeason (String season) {
        if (season.equals("winter")) {
            understoryLightLevelHigh = true;
        }
        else {
            understoryLightLevelHigh = false;
        }
        printSeason();
    }

    public void printSeason() {
        System.out.println("It is " + season + " in the " + hemisphere + " hemisphere");
    }
}