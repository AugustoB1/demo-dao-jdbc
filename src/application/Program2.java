package application;


import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: department insert =====");
		Department newDepartment = new Department(null, "Tell-phone");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("=== TEST 2: department findById =====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: department deleteById =====");
		departmentDao.deleteById(11);
		
		
		System.out.println("\n=== TEST 5: seller update =====");
		department = departmentDao.findById(1);
		department.setName("Enginner");
		departmentDao.update(department);
		System.out.println("Update completed");
	}

}
