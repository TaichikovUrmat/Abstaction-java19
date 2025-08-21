import java.time.LocalDate;
import java.util.Arrays;

public class Person {

    private Long id;
    private String Name;
    private String email;
    private LocalDate dadeOfBirth;
    private String phoneNumber;

    public Person() {
    }

    public Person(Long id, String name, String email, LocalDate dadeOfBirth, String phoneNumber) {
        this.id = id;
        this.Name = name;
        this.email = email;
        this.dadeOfBirth = dadeOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDadeOfBirth() {
        return dadeOfBirth;
    }

    public void setDadeOfBirth(LocalDate dadeOfBirth) {
        this.dadeOfBirth = dadeOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", dadeOfBirth=" + dadeOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


    Person[] peopleMassiv = new Person[0];

    // todo create method  - метод  добавление
    public void createPerson(Person newPerson) {
        peopleMassiv = Arrays.copyOf(peopleMassiv, peopleMassiv.length + 1);
        peopleMassiv[peopleMassiv.length - 1] = newPerson;
        System.out.println(" create Person   ");;
    }
    // todo get all - ввести все данные
    public void getAllPersons() {
        for (Person person : peopleMassiv) {
            System.out.println(person);
        }
    }

    // todo  get by id person
    public void  getByIdPerson(Long personId) {
        boolean isbloc = false;
        for (Person person : peopleMassiv) {
            if (person.getId().equals(personId)) {
                isbloc = true;
                System.out.println(person);
            }
        }
        if (!isbloc) {
            System.out.println("Myndai person id jok !!");
        }
    }

    // todo update person by id
    public void  updatePerson(Long personId,Person newPerson){
        boolean isbloc = false;
        for (Person person : peopleMassiv) {
            if (person.getId().equals(personId)) {
                isbloc = true;
              person.setName(newPerson.getName());
              person.setEmail(newPerson.getEmail());
              person.setDadeOfBirth(newPerson.getDadeOfBirth());
              person.setPhoneNumber(newPerson.getPhoneNumber());
                System.out.println(" Almashty person");
            }
        }
        if (!isbloc) {
            System.out.println("Myndai person id jok !!");
        }
    }

    // todo delete by personId
    public void  deleteByPersonId(Long personId){

        for (int i = 0; i < peopleMassiv.length; i++) {
            if (peopleMassiv[i].getId().equals(personId)){
                peopleMassiv[peopleMassiv.length - 1 ]  = peopleMassiv[i];
                System.out.println("delete");
            }
        }

//
//        boolean isbloc = false;
//        for (Person person : peopleMassiv) {
//            if (person.getId().equals(personId)) {
//                isbloc = true;
//                peopleMassiv[peopleMassiv.length -1 ] = person;
//                System.out.println("deleted");
//            }
//        }
//        if (!isbloc) {
//            System.out.println("Myndai person id jok !!");
//        }
    }


    ;


}
