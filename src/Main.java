import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {






        Person person = new Person();
        Person person1 = new Person(1L, "Aina", "aiana@gmai.com",
                LocalDate.of(2008, 8, 7), "+996501026468");
        Person person2 = new Person(2L, "Tansuluu", "tansuluu@gmai.com",
                LocalDate.of(2004, 8, 7), "+996501026460");
//        // todo create method  - метод  добавление
        person.createPerson(person1);
        person.createPerson(person2);
//        // todo  get all  person
        person.getAllPersons();
        System.out.println("--------------------------------");
        person.deleteByPersonId(1L);
        System.out.println("--------------------------------");
//        person.getAllPersons();
        person.getAllPersons();






//        System.out.println("-------------");
//        // todo get by id person
//        Long id = 1L;
////        person.getByIdPerson(2L);
//        // todo  update person
//        System.out.println(" ----------------------------- updated -----------------------------");
////        person.updatePerson(1L, new Person(1L, "Tansuluu", "tansuluu@gmai.com",
////                LocalDate.of(2004, 8, 7), "+996501026460"));
////        System.out.println(" ----------------------------- get all-----------------------------");
////        // get all
////        person.getAllPersons();
//        // delete by person id
//        System.out.println("--------------------delete  -----------------");
//        person.deleteByPersonId(2L);
//        System.out.println("--------------------get all -----------------");
//// get all
//        person.getAllPersons();


//        School school1 = new School("nurmanbetov - 16","KGZ",2000);
//        School school2 = new School("№ -5 ","Rs",1990);

//        University university1 = new University("Aloo-Too","KGZ",2000);
//        University university2 = new University("MUKR","KGZ",2004);
//        University university3 = new University("Manas","KGZ",1992);
//        University university4 = new University("KTU","KGZ",1965);
//
//
//        College college1 = new College("KTU","KGZ",1965);
//        College college2 = new College("Manas","KGZ",1965);
//        College college3 = new College("MUKR","KGZ",1965);
//        College college4 = new College("Arabaeva","KGZ",1965);
//
//        Student[] students = new Student[10];
//        students[0] = new Student("Aibek", "Toktomamatov", "Male", LocalDate.of(2020, 9, 1), school1);
//        students[1] = new Student("Aizada", "Bekova", "Female", LocalDate.of(2019, 9, 1), university1);
//        students[2] = new Student("Nursultan", "Omurov", "Male", LocalDate.of(2021, 9, 1), college1);
//        students[3] = new Student("Meerim", "Asanova", "Female", LocalDate.of(2022, 9, 1), school2);
//        students[4] = new Student("Ruslan", "Kubanychbekov", "Male", LocalDate.of(2020, 9, 1), university2);
//        students[5] = new Student("Aigul", "Sadykova", "Female", LocalDate.of(2018, 9, 1), college2);
//        students[6] = new Student("Bakyt", "Erkinov", "Male", LocalDate.of(2021, 9, 1), college4);
//        students[7] = new Student("Saltanat", "Tursunova", "Female", LocalDate.of(2019, 9, 1), university3);
//        students[8] = new Student("Adilet", "Samatov", "Male", LocalDate.of(2022, 9, 1), college3);
//        students[9] = new Student("Gulnara", "Abdykadyrova", "Female", LocalDate.of(2020, 9, 1), university4);
//
//        for (Student student : students) {
//            System.out.println(student.getInfoStudent());
//
//        }


    }
}