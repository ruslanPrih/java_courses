package com.prikhodko.dbproject;

import com.prikhodko.dbproject.domain.Student;
import com.prikhodko.dbproject.domain.criteria.StudentCriteria;
import com.prikhodko.dbproject.repository.StudentRepository;
import com.prikhodko.dbproject.repository.impl.StudentMySqlRepository;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestDB {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentMySqlRepository();
        System.out.println("Start test");

/*
        ExecutorService executorService = Executors.newCachedThreadPool();

        int threadCount = 10;
        List<Future<?>> futures = new ArrayList<>();

        for (int i = 0; i < threadCount; i++) {
            futures.add(executorService.submit(new Runnable() {
                @Override
                public void run() {

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Student student = new Student();
                    student.setName(RandomStringUtils.randomAlphanumeric(10));
                    student.setLastName(RandomStringUtils.randomAlphanumeric(10));
                    student.setMiddleName(RandomStringUtils.randomAlphanumeric(10));

                    studentRepository.create(student);
                }
            }));
        }
        waitForFutures(futures);

        // close connection
        executorService.shutdown();
        */


/*        StudentService service = new StudentServiceImpl(studentRepository);

        System.out.println(service.getStudentById(13));

        System.out.println(service.findAll());

        service.deleteAll();
        *//*

        Student student = new Student();
        student.setName("Anna");
        student.setLastName("Ivanenko");
        student.setMiddleName("Petrivich");
        studentRepository.create(student);

        System.out.println(studentRepository.findAll());
*/

       /*       Student student1 = new Student();
        student1.setLastName("Ivanenko1");
        student1.setMiddleName("Petrivich1");
        studentRepository.create(student);

        System.out.println(studentRepository.findAll());
*/
       /*
    }

    private static void waitForFutures(List<Future<?>> futures) {
        futures.forEach(future -> {
            try {
                System.out.println(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        */
        //System.out.println(studentRepository.findByName("Kate"));
        //System.out.println(studentRepository.get(1));
        //System.out.println(studentRepository.findAll());
/*
        Student student1 = new Student();
        student1.setLastName("Ivanenko1");
        student1.setName("Anna1");
        student1.setMiddleName("Petrivich1");
        studentRepository.create(student1);
        System.out.println(studentRepository.findAll());
 */
/*
        StudentCriteria criteria=new StudentCriteria();
        criteria.setLastName("Ivanenko1");
        criteria.setName("Anna1");
        criteria.setMiddleName("Petrivich1");
        System.out.println(studentRepository.findByCriteria(criteria));
*/

        studentRepository.delete(1);
        System.out.println(studentRepository.findAll());

    }

}