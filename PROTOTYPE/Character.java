public class Character {
    private double height;
    private String name;
    private String hairColor;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public Character(double height, String name, String hairColor){
        this.height = height;
        this.name = name;
        this.hairColor = hairColor;
    }

    public Character(){
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public Character clone(){
        Character CharacterClone = new Character();
        CharacterClone.setName(this.name);
        CharacterClone.setHeight(this.height);
        CharacterClone.setHairColor(this.hairColor);

        return CharacterClone;
    }
}
