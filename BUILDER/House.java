public class House {
    private int NumberOfRooms;
    private int NumberOfBathrooms;
    private int NumberOfTVs;
    private String SofaColor;
    private String WallsColor;

    public House(int NumberOfRooms, int NumberOfBathrooms, int NumberOfTVs, String SofaColor, String WallsColor){
        this.NumberOfRooms = NumberOfRooms;
        this.NumberOfBathrooms = NumberOfBathrooms;
        this.NumberOfTVs = NumberOfTVs;
        this.SofaColor = SofaColor;
        this.WallsColor = WallsColor;
    }
    public int getNumberOfRooms() {
        return NumberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        NumberOfRooms = numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return NumberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        NumberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfTVs() {
        return NumberOfTVs;
    }

    public void setNumberOfTVs(int numberOfTVs) {
        NumberOfTVs = numberOfTVs;
    }

    public String getSofaColor() {
        return SofaColor;
    }

    public void setSofaColor(String sofaColor) {
        SofaColor = sofaColor;
    }

    public String getWallsColor() {
        return WallsColor;
    }

    public void setWallsColor(String wallsColor) {
        WallsColor = wallsColor;
    }
}
