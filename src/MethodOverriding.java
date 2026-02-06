class Employee {
    public void display(){
            System.out.println("Name of class is Employee");
    }
}

class Engineer extends Employee {
    public void display(){
            System.out.println("Name of class is Engineer");
    
            super.display();
    }
    // TODO: Override display() method
    // 1. Print "Name of class is Engineer"
    // 2. Call super.display() to print the parent's message
}

public class MethodOverriding {
   public static void main(String args[]){
        Employee e1 = new Employee();
        Engineer eng1= new Engineer();
        eng1.display();
   }
        // TODO: Create an Engineer object
        // TODO: Call the display() method
    
}
