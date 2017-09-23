package com.prikhodko.PatternBuilder2309;
import java.util.Date;
public class NewBuilderTest {
    public  static  void  main(String[] args){
/*
        Employer employer=new Employer.Builder()
                .name("Sergey")
                .lastName("Naaa")
                .middleName("Petrovich")
                .gender(Gender.MALE)
                .position("worker")
                .familyStatus(FamilyStatus.MARRIED)
                .birthdate(new Date(100000))
                .build();
*/

         //Employer.Builder q =new Employer.Builder("Sergey","Petrovich","Naaa");
/*
        Employer.Builder employer1=new Employer.Builder("Sergey","Petrovich","Naaa",
                Gender.MALE,FamilyStatus.MARRIED,new Date(100000),15000,"worker" );
*/
                /*
                .gender(Gender.MALE)
                .position("worker")
                .familyStatus(FamilyStatus.MARRIED)
                .birthdate(new Date(100000))
                .build();
*/
        //System.out.println(employer1);

       // System.out.println(employer1);

         //After LOMBOK
        /*
        Employer employer=new Employer(null, null, null);
        employer.setBirthdate(new Date(100000));
        System.out.println(employer.toString());
        System.out.println(employer.getSomeField().toString());

        Employer employer1=Employer
                .builder()
                .bonus(0)
                .build();
       // System.out.println(employer.getLastName());
        //System.out.println(employer.getBonus());
        System.out.println(employer1);
*/
        //System.out.println(q.getClass());

        Employer info=new Employer.Builder("Sergey","Petrovich","Naaa")
                .gender(Gender.MALE)
                .position("worker")
                .familyStatus(FamilyStatus.MARRIED)
                .birthdate(new Date(100000))
                .salary(10000)
                .build();
        System.out.println(info);
        System.out.println(info.getGender());
        Employer info1=new Employer.Builder("Sergey","Petrovich","Naaa")
        .familyStatus(FamilyStatus.SINGLE).build();
        System.out.println(info1);
        System.out.println(new Employer.Builder("Ivan","Petrovich","Naaa"){

        });

    }
}
