package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("==== insert teste ====");
		Department department = new Department(null,"Paulo");
		departmentDao.insert(department);
		System.out.println("Insert complete!");
		System.out.println("");
		
		System.out.println("==== findById teste ====");
		department = departmentDao.findById(1);
		System.out.println(department);
		System.out.println("");
		
		System.out.println("==== findAll teste ====");
		List<Department> departmentList = new ArrayList<>();
		departmentList = departmentDao.findall();
		for (Department dep : departmentList ) {
			System.out.println(dep);
		}
		System.out.println("");
		
		System.out.println("==== deleteById teste ====");
		System.out.println("Enter Id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complete!");
		
	}
	
	
}
