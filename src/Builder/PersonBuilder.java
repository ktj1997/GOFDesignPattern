package Builder;

import java.time.LocalDate;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private LocalDate date;
    private String addressOne;
    private String addressTwo;
    private String sex;
    private boolean married;


    public PersonBuilder firstName(String fistName) {
        this.firstName = fistName;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder date(LocalDate date) {
        this.date = date;
        return this;
    }

    public PersonBuilder addressOne(String addressOne) {
        this.addressOne = addressOne;
        return this;
    }


    public PersonBuilder addressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
        return this;
    }

    public PersonBuilder sex(String sex) {
        this.sex = sex;
        return this;
    }


    public PersonBuilder married(boolean married) {
        this.married = married;
        return this;
    }

    public Person build() {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddressOne(addressOne);
        person.setAddressTwo(addressTwo);
        person.setDate(date);
        person.setMarried(married);

        return person;
    }
}
