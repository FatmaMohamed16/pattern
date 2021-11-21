
package pattern;

import java.util.Scanner;
public class Pattern {

    public static void main(String[] args) {
     
       Scanner input = new Scanner(System.in);
        System.out.println("enter member ");
      //  double s = input.nextInt();
        //double b = input.nextInt();
        String name = input.nextLine();
        memberfactory mem = new memberfactory();
        staff st =mem.getinfo(name);
        st.show();
         System.out.println("salary is ");
     st.getsalary();
      System.out.println("salary and bonus is ");
        st.calculatesalary(200);
         
    }
    
}
