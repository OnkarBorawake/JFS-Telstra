
public class Main {

	public static void main(String[] args) {

		//Employee e1 = new Employee(100,"Om",100000);
		//System.out.println(e1.getDetails());
		
		Manager m1 = new Manager(200,"Abc",120000, "HR", 10);
		System.out.println(m1.getDetails());
		
		//Virtual Method Invocation in Java
		Employee emp = new Manager(201,"Lmn",120000,"IT", 5);
		System.out.println(emp.getDetails());
		
		Manager m2 = (Manager)emp;
		System.out.println(m2.getDeptName()+m2.getEmpCount());
		
		Employee[] emparr = new Employee[4];
		//emparr[0] = new Employee(101,"asd",40000);
		emparr[0] = new Manager(202,"xyz",75000,"RD",15);
		emparr[1] = new Manager(203,"xyzq",65000,"HRD",15);
		emparr[2] = new Programmer(300,"abcdefg",60000,5,"Java");
		System.out.println("Printing employee details");
		
		for(Employee emp1 : emparr)
		{
			System.out.println(emp1.getDetails());
		}
	}

}
