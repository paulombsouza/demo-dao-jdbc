package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("==== insert teste ====");
		Department department = new Department(null,"Paulo");
		departmentDao.insert(department);
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
		
		
	}
	
	
}
