import java.util.*;
import java.lang.*;
 
class GFG{
 
// Function to calculate the
// salary of the person
static int computeSalary(int basic,
                        char grade)
{
    double allowance;
    double hra, da, pf;
     
    hra = 0.2 * basic;
    da = 0.5 * basic;
    pf = 0.11 * basic;
     
    // Condition to compute the
    // allowance for the person
    if (grade == 'A')
    {
        allowance = 1700.0;
    }
    else if (grade == 'B')
    {
        allowance = 1500.0;
    }
    else
    {
        allowance = 1300.0;
    }
    double gross;
     
    // Calculate gross salary
    gross = Math.round(basic + hra + da +
                         allowance - pf);
                          
    return (int)gross;
}
 
// Driver Code
public static void main (String[] args)
{
    int basic = 10000;
    char grade = 'A';
     
    // Function call
    System.out.println(computeSalary(basic, grade));
}
}
 
// This code is contributed by jana_sayantan
