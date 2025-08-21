public class EDUCATIONCENTER {

//    NAME, LOCATEDCOUNTRY, FOUNDATIONDATE

    private String name;
    private String LocatedCountry;
    private int foundationData;

    public EDUCATIONCENTER() {
    }

    public EDUCATIONCENTER(String name, String locatedCountry, int foundationData) {
        this.name = name;
        LocatedCountry = locatedCountry;
        this.foundationData = foundationData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return LocatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        LocatedCountry = locatedCountry;
    }

    public int getFoundationData() {
        return foundationData;
    }

    public void setFoundationData(int foundationData) {
        this.foundationData = foundationData;
    }

    @Override
    public String toString() {
        return "EDUCATIONCENTER{" +
                "name='" + name + '\'' +
                ", LocatedCountry='" + LocatedCountry + '\'' +
                ", foundationData=" + foundationData +
                '}';
    }
}
