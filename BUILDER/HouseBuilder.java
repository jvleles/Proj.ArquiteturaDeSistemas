public class HouseBuilder {
    private int NumberOfRooms;
    private int NumberOfBathrooms;
    private int NumberOfTVs;
    private String SofaColor;
    private String WallsColor;

    public HouseBuilder withNumberOfRooms(int NumberOfRooms){
        this.NumberOfRooms = NumberOfRooms;
        return this;
    }

    public HouseBuilder withNumberOfBathrooms(int NumberOfBathrooms){
        this.NumberOfBathrooms = NumberOfBathrooms;
        return this;
    }

    public HouseBuilder withNumberOfTVs(int NumberOfTVs){
        this.NumberOfTVs = NumberOfTVs;
        return this;
    }

    public HouseBuilder withSofaColor(String SofaColor){
        this.SofaColor = SofaColor;
        return this;
    }

    public HouseBuilder withWallsColor(String WallsColor){
        this.WallsColor = WallsColor;
        return this;
    }

    public HouseBuilder(){

    }

    public House toHouse() throws Exception{
        validateHouse();
        return new House(NumberOfRooms, NumberOfBathrooms, NumberOfTVs, SofaColor, WallsColor);
    }

    private void validateHouse() throws Exception{
        if(NumberOfRooms == 0){
            throw new Exception();
        }
    }
}
