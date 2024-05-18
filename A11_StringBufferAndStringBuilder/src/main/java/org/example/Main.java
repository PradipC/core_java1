package org.example;

public class Main {
    public static void main(String[] args) {


        String name = new String("india");
        System.out.println("before concat name : "+name+ "  hashcode "+name.hashCode()  );


        name = name.concat(" country ");
        System.out.println("after concat name : "+name+ "  hashcode "+name.hashCode()  );


        System.out.println("***************************************");

        StringBuffer name1 = new StringBuffer("india");
        System.out.println("before append name1 : "+name1+ "  hashcode "+name1.hashCode()  );


        name1.append(" country ");
        System.out.println("after append name1 : "+name1+ "  hashcode "+name1.hashCode()  );


        System.out.println("############################################");

        StringBuffer product = new StringBuffer("laptop");
        product.deleteCharAt(2);
        System.out.println(product);

        product.insert(2,'p');
        System.out.println(product);


        // equals
        // equalsIgnoreCase
        // trim
        // contains
        // length













        System.out.println("#####################################");

        StringBuilder name2 = new StringBuilder("india");
        System.out.println("before append name2 : "+name2+ "  hashcode "+name2.hashCode()  );

        name2.append(" country ");
        System.out.println("after append name2 : "+name2+ "  hashcode "+name2.hashCode()  );

        System.out.println("********************************");

        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb.hashCode());

        StringBuffer sb1 = new StringBuffer("hello");
        System.out.println(sb1.hashCode());


    // StringBuffer is Thread safe , because it having methods with synchronized keyword
        // It is thread safe , so it will execute slow compare to StringBuilder

    // StringBuilder is non-Thread safe , because it not having methods with synchronized keyword
         // It is non-thread safe , so it will execute fast compare to  StringBuffer

    // StringBuffer and StringBuilder objects we create using new keyword ,
         // and Object will create inside heap area

    //   StringBuffer and StringBuilder Objects are mutable , so
      // when we update / modify it will update the existing Object only , It will not create new Object



    }
}