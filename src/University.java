public class University  extends  EDUCATIONCENTER{

    public University() {
    }

    public University(String name, String locatedCountry, int foundationData) {
        super(name, locatedCountry, foundationData);
    }

    @Override
    public String toString() {
        return "University{} " + super.toString();
    }
}
