
package pattern;


public class TA implements staff {

    private int salary;


    @Override
    public void getyearswork() {
    }
    
    @Override
    public void show() {
        System.out.println(" this is TA");
    }

    @Override
    public void getsalary() {
        salary=6000;
         System.out.println("salary is  " + salary);
    }

    @Override
    public void calculatesalary(int bonus) {
         {
       System.out.println(salary+bonus);
   }
    }
}