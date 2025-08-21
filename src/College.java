public class College extends EDUCATIONCENTER{
    public College() {
    }

    public College(String name, String locatedCountry, int foundationData) {
        super(name, locatedCountry, foundationData);
    }

    @Override
    public String toString() {
        return "College{} " + super.toString();
    }


}
