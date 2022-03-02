// Expenses.java
class Expenses{
    private String expenseType;
    private Double cost;
    Expenses(){}
    Expenses(String expenseType, Double cost){
        //Fill your code here
        this.expenseType = expenseType;
        this.cost = cost;
    }
    String getExpenseType(){
        return this.expenseType;
    }
    Double getCost(){
        return this.cost;
    }
}

// Main.java
import java.util.*; 
import java.util.stream.*; 

class Main
{
    public static void main(String args[]) {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        List<Expenses> budget = new ArrayList<>();
        System.out.println("Enter expense for food");
        budget.add( new Expenses("food",sc.nextDouble()) );
        System.out.println("Enter expense for rent");
        budget.add( new Expenses("rent",sc.nextDouble()) );
        System.out.println("Enter expense for shopping");
        budget.add( new Expenses("shopping",sc.nextDouble()) );
        System.out.println("Enter expense for groceries");
        budget.add( new Expenses("groceries",sc.nextDouble()) );
        System.out.println("Enter expense for electricity");
        budget.add( new Expenses("electricity",sc.nextDouble()) );
        System.out.println("Enter salary");
        double salary = sc.nextDouble();
        double sum = budget.stream().reduce(0.0, (addition, user) -> addition + user.getCost(), Double::sum);
        if(sum <= salary){
            salary -= sum;
            System.out.println("Savings amount will be Rs."+salary);
        }
        else System.out.println("Expenses exceeds Salary");
    }
}