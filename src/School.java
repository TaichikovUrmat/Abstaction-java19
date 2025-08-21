public class School extends  EDUCATIONCENTER {

    public School(){};
    public School(String name, String locatedCountry, int foundationData) {
        super(name, locatedCountry, foundationData);
    }

    @Override
    public String toString() {
        return "School{} " + super.toString();
    }
}
