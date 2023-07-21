package Assesment;
class Member {
    String name;
    int age;
    String phone;
    String address;
    double salary;

    public Member(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}


class Employee extends Member {
    String specialization;

    public Employee(String name, int age, String phone, String address, double salary, String specialization) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, String phone, String address, double salary, String department) {
        super(name, age, phone, address, salary);
        this.department = department;
    }
}
Employee emp = new Employee("John", 25, "1234567890", "123 Main St, Anytown USA", 50000, "Software Engineer");
Manager man = new Manager("Jane", 35, "0987654321", "456 Broadway Ave, Somewhere USA", 80000, "Engineering");

System.out.println("Employee Details:");
System.out.println("Name: " + emp.name);
System.out.println("Age: " + emp.age);
System.out.println("Phone: " + emp.phone);
System.out.println("Address: " + emp.address);
System.out.println("Salary: " + emp.salary);
System.out.println("Specialization: " + emp.specialization);
emp.printSalary();

System.out.println("\nManager Details:");
System.out.println("Name: " + man.name);
System.out.println("Age: " + man.age);
System.out.println("Phone: " + man.phone);
System.out.println("Address: " + man.address);
System.out.println("Salary: " + man.salary);
System.out.println("Department: " + man.department);
man.printSalary();

