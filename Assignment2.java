class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month


    public Employee(String name, int age, Gender gender, double salary) {
        this.name = name ;
        this.age = age ;
        this.gender = gender ;
        this.salary = salary ;
    }

    public String getName() {
        return this.name ;
    }

    public void setName(String name) {
        this.name = name ;
    }
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */


    public double socialSecurityTax(Employee employee) {
        double socialSecurityTax ;
        if (employee.salary <= 8900){
            socialSecurityTax = 0.062d * employee.salary ;
        }
        else {
            socialSecurityTax = 0.062d * 106800 ;
        }     
        return socialSecurityTax;
 }

/**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
        double insurance;   
        if (employee.age <= 35){        
            insurance = 0.03d * employee.salary;
        }
        if (employee.age >35 && employee.age <= 50){
            insurance = 0.04d * employee.salary;
        }
        if (employee.age >50 && employee.age <= 60){    
            insurance = 0.05d * employee.salary;
        }
        if(employee.age > 60) {
            insurance = 0.06d * employee.salary;
        }
        System.out.println ("Employee's contribution for insurance coverage is"+insurance);
        return insurance;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        Employee[] employees = new Employee[3];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;

        for (int i =0 ; i < employees.length ; i++){
            for (int j = i+1; j < employees.length ; j++){
                if (employees[i].salary > employees[j].salary){
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }

            }
        }

        for (int i =0 ; i < employees.length ; i++){
            System.out.println(employees[i].name);
        }

    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        //double s = employee.salary ;        
        this.raiseSalary (300, employee) ;
    }

    public void raiseSalary (double byPercent, Employee employee){
        employee.salary = employee.salary  * (byPercent / 100);
    }

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     It is because in Java everything is passed by value. 
     So, the original variables (a, b) from the main() function still point to the same objects.
     In the swap() function, only the new variables (x, y) pointing to objects are interchanged.
    */


    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}









