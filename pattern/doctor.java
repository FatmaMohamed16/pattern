
package pattern;

public class doctor implements staff {

    private int salary;

   
     @Override
    public void getyearswork() {
      
    }

   
//    public void print()
//    {
//       System.out.println(" the total salary of doctor "+salary+bonus);
//    
//    }

    @Override
    public void show() {
        System.out.println(" this is doctor");
    }

    @Override
    public void getsalary() {
        salary = 4000;
         System.out.println("salary is " + salary);
    }

    @Override
    public void calculatesalary(int bonus) {
         {
       System.out.println(salary+bonus);
   }
    }

   
}
