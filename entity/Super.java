package entity;
public class Super {

    private String name;
    private String gender;
    private String sexuality;
    private String type;
    private int height;
    private int weight;
    private String hairType;
    private String hairColor;
    private String nationality;
    private String ethnicity;
    private String skinColor;
    private String eyeColor;
    private String ability;

    public String getName() {return name;}

    public String getGender() {return gender;}

    public String getSexuality() { return sexuality; }

    public String getType() { return type; }

    public int getHeight() { return height;}

    public int getWeight() {  return weight; }

    public String getHairType() { return hairType; }

    public String getHairColor() { return hairColor;}

    public String getNationality() { return nationality; }

    public String getEthnicity() { return ethnicity; }

    public String getSkinColor() {return skinColor; }

    public String getEyeColor() { return eyeColor;}

    public String getAbility() { return ability; }

    public void setName(String name) { this.name = name;}

    public void setGender(String gender) { this.gender = gender; }

    public void setSexuality(String sexuality) { this.sexuality = sexuality; }

    public void setType(String type) {  this.type = type; }

    public void setHeight(int height) {this.height = height; }

    public void setWeight(int weight) {this.weight = weight; }

    public void setHairType(String hairType) {  this.hairType = hairType;}

    public void setHairColor(String hairColor) { this.hairColor = hairColor;}

    public void setNationality(String nationality) { this.nationality = nationality;}

    public void setEthnicity(String ethnicity) { this.ethnicity = ethnicity;}

    public void setSkinColor(String skinColor) { this.skinColor = skinColor;}

    public void setEyeColor(String eyeColor) { this.eyeColor = eyeColor;}

    public void setAbility (String ability) { this.ability = ability; }


    public Super () {
        name = "Unknown";
        gender = "Unknown";
        sexuality = "Unknown";
        type = "Unknown";
        height = 0;
        weight = 0;
        hairType = "Unknown";
        hairColor = "Unknown";
        nationality = "Unknown";
        ethnicity = "Unknown";
        skinColor = "Unknown";
        eyeColor = "Unknown";
        ability = "Unknown";
    }

    public Super (String n, String g, String s, String tY, int h, int w, String hT, String hC, String na, String e, String sC, String eC) {
        name = n;
        gender = g;
        sexuality = s;
        type = tY;
        height = h;
        weight = w;
        hairType = hT;
        hairColor = hC;
        nationality = na;
        ethnicity = e;
        skinColor = sC;
        eyeColor = eC;
    }

    @Override
    public String toString() {
        return ("Super Profile \n" +
                "____________________\n" +
                "Name: " + name + "\n" +
                "Gender: " + gender + "\n" +
                "Sexuality: " + sexuality + "\n" +
                "Type: " + type + "\n" +
                "Height: " + height + "\n" +
                "Weight: " + weight + "\n" +
                "Hair Type: " + hairType + "\n" +
                "Hair Color: " + hairColor + "\n" +
                "Nationality: " + nationality + "\n" +
                "Ethnicity: " + ethnicity + "\n" +
                "Skin Color: " + skinColor + "\n" +
                "Eye Color: " + eyeColor + "\n" +
                "Abilities: " + ability);

    }
}
