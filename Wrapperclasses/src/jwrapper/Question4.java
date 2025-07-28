package jwrapper;
	class Employee implements Cloneable {
	    int id;
	    String name;
	    double salary;
	    Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }
	    public Employee clone() {
	        try {
	            return (Employee) super.clone(); // Shallow copy
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	    public void display() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
	    }
	}
	public class Question4 {
	    public static void main(String[] args) {
	        // Create original employee
	        Employee emp1 = new Employee(101, "John", 50000);
	        Employee emp2 = emp1.clone();
	        System.out.println("Before Modification:");
	        System.out.print("Original: ");
	        emp1.display();
	        System.out.print("Clone: ");
	        emp2.display();
	        emp1.name = "David";
	        emp1.salary = 60000;
	        System.out.println("\nAfter Modification:");
	        System.out.print("Original: ");
	        emp1.display();
	        System.out.print("Clone: ");
	        emp2.display();
	    }
	}


