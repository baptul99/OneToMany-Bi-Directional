package OneToManyBi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {
public static void main(String[] args) {
	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();;
	Department d=new Department();
	d.setName("Developar");
	d.setLocation("BTM layout");
	
	Employee e1=new Employee();
	e1.setDept(d);
	e1.setDesg("Senior Dev");
	e1.setName("Baptul");
	e1.setPhone(789456125);
	e1.setSalary(89568);
	
	Employee e2=new Employee();
	e2.setDept(d);
	e2.setDesg("Junior Dev");
	e2.setName("Shubha");
	e2.setPhone(65982354);
	e2.setSalary(56312);
	
	Employee e3=new Employee();
	e3.setDept(d);
	e3.setDesg("Accociate");
	e3.setName("Selim");
	e3.setPhone(56982365);
	e3.setSalary(23568);
	
	List<Employee>emps = new ArrayList<Employee>();
	emps.add(e1);
	emps.add(e2);
	emps.add(e3);
	
	d.setEmps(emps);
	manager.persist(d);
	transaction.begin();
	transaction.commit();
	
}
}
