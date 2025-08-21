import java.time.LocalDate;
import java.util.Locale;

public class Student {

    private  String name;
    private  String surName;
    private  String gender;
    private LocalDate  localDateDateOfStart;
    private EDUCATIONCENTER educationcenter;

    public Student(){};

    public Student(String name, String surName, String gender, LocalDate localDateDateOfStart, EDUCATIONCENTER educationcenter) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.localDateDateOfStart = localDateDateOfStart;
        this.educationcenter = educationcenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getLocalDateDateOfStart() {
        return localDateDateOfStart;
    }

    public void setLocalDateDateOfStart(LocalDate localDateDateOfStart) {
        this.localDateDateOfStart = localDateDateOfStart;
    }

    public EDUCATIONCENTER getEducationcenter() {
        return educationcenter;
    }

    public void setEducationcenter(EDUCATIONCENTER educationcenter) {
        this.educationcenter = educationcenter;
    }


    public String getInfoStudent(){
        return "Student : " + '\n'+
                "name :  " + name + '\n' +
                "surName : " + surName + '\n' +
                "gender : " + gender + '\n' +
                "localDateDateOfStart : " + localDateDateOfStart + '\n' +
                "educationcenter name : " + educationcenter.getName() + '\n' +
                "educationcenter Country : " + educationcenter.getLocatedCountry() + '\n' +
                "educationcenter FoundationData   : " + educationcenter.getFoundationData()+ '\n' +
                " ----------------------------------  -------------------------------------";
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\n' +
                ", surName='" + surName + '\n' +
                ", gender='" + gender + '\n' +
                ", localDateDateOfStart=" + localDateDateOfStart + '\n' +
                ", educationcenter=" + educationcenter +
                '}';
    }
}
