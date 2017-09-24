package com.prikhodko.PatternBuilder2309;

import lombok.*;

import java.util.Date;

/*
@Setter
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode (callSuper = true, exclude = {"salary","bonus"})
//@RequiredArgsConstructor

//@Data(staticConstructor = "name")
@Builder
*/
public class Employer extends BaseClass {

    private String name;
    private String lastName;
    private String middleName;
    private Gender gender;
    private FamilyStatus familyStatus;
    private Date birthdate;
    private double salary;
    private String position;
   // private int bonus;


/*
    //Do Unchecked
    @SneakyThrows
    @Override
    protected Employer clone()  {
        return (Employer) super.clone();
    }
    */



/*
    public Employer(@NonNull String name, String lastName, String middleName) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
    }
*/

    private Employer(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.gender = builder.gender;
        this.familyStatus = builder.familyStatus;
        this.birthdate = builder.birthdate;
        this.salary = builder.salary;
        this.position = builder.position;
    }

    public static class Builder {
        private final String name;
        private final String lastName;
        private final String middleName;
        private Gender gender;
        private FamilyStatus familyStatus;
        private Date birthdate;
        private double salary;
        private String position;


        public Builder(String name, String lastName, String middleName) {
            this.name = name;
            this.lastName = lastName;
            this.middleName = middleName;
        }


/*
        //Because they are final
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
*/


        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder familyStatus(FamilyStatus familyStatus) {
            this.familyStatus = familyStatus;
            return this;
        }

        public Builder birthdate(Date birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Employer build() {
            return new Employer(this);

        }

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Gender getGender() {
        return gender;
    }

    public FamilyStatus getFamilyStatus() {
        return familyStatus;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }



    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", gender=" + gender +
                ", familyStatus=" + familyStatus +
                ", birthdate=" + birthdate +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}