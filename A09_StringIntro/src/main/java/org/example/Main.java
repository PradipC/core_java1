package org.example;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(101,"dhoni");
        System.out.println(student.toString());
        System.out.println("1st student : "+student.hashCode());

        Student student2 = new Student(102,"sachin");
        System.out.println(student2);
        System.out.println("2nd student : "+student2.hashCode());

        student2.setName("virat");
        System.out.println(student2);
        System.out.println("2nd student : "+student2.hashCode());


        Student student3 = new Student(101,"dhoni");
        System.out.println(student3);
        System.out.println("3rd student : "+student3.hashCode());


        System.out.println("*****************************");
        String s1 = "Hello";
        System.out.println(s1.hashCode());
        String s2 = "Java";
        System.out.println(s2.hashCode());
        String s3 = "Hello";
        System.out.println(s3.hashCode());

        String s4 = new String("Hello");
        System.out.println(s4.hashCode());

        String s5 = new String("Hello");
        System.out.println(s5.hashCode());




        s3  = s3.toUpperCase();  // HELLO
        System.out.println(s3);
        System.out.println(s3.hashCode());



        String name = "pradip"; // 1

        String name2 = "pradip"; // 1 ( reuse )

        String name3 = new String("pradip"); // 1 + 1( reuse)
        System.out.println("name 2 haschode :"+name2.hashCode());
        System.out.println("name 3 haschode :"+name3.hashCode());
        System.out.println("Before concat method : "+name+"  hashcode : "+name.hashCode());

        name = name.concat(" kumar");
        System.out.println("after concat method : "+name+"  hashcode : "+name.hashCode());



        String city = "mumbai";

        String city2 = "delhi";

        String city3 = "mumbai";

        String city4 = "Mumbai";


       boolean isSame  = city.equals(city2);
        System.out.println(isSame);
        System.out.println(city.equals(city3));

        System.out.println(city.equals(city4));

        System.out.println(city.equalsIgnoreCase(city4));


       int lastIndex =  city.lastIndexOf('m');
        System.out.println(lastIndex);


       int firstIndex =  city.indexOf('m');
        System.out.println(firstIndex);

        boolean startsWith = city.startsWith("rt");
        System.out.println(startsWith);


        String replace = city.replace('m', 'p');
        System.out.println(replace);


        String email = " pradip@gmail.com  ";
        System.out.println(email.length());
        System.out.println(email);
        email = email.trim();
        System.out.println(email);



    }
}