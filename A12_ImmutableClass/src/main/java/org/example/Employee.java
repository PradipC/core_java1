package org.example;

public final class Employee {

    private int empId;
    private String name;
    private Address address;


    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }


    public Employee(int empId, String name, Address address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

   /* public void setEmpId(int empId) {
        this.empId = empId;
    }*/

    public String getName() {
        return this.name;
    }

   /* public void setName(String name) {
        this.name = name;
    }*/


    public Address getAddress() {
      // return this.address;
        Address address1 = new Address();
        address1.setCity(  this.address.getCity()      );
        address1.setStreetName(   this.address.getStreetName()       );
        return address1;
    }

    public void register(){
         System.out.println("register");
     }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
