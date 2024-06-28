package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department insert ===");
		Department dep = new Department(null, "Foods");
		departmentDao.insert(dep);
		System.out.println("Done! Department inserted");
		
		System.out.println("=== TEST 2: department update ===");
		Department dep2 = new Department(2, "Games");
		departmentDao.update(dep2);
		System.out.println("Done! Department updated");
		
		System.out.println("=== TEST 3: department deleteById ===");
		departmentDao.deleteById(5);
		System.out.println("Done! Department deleted");
		
		System.out.println("=== TEST 4: department findById ===");
		dep = departmentDao.findById(3);
		System.out.println("Done! Department found: " + dep);
		
		System.out.println("=== TEST 5: department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
		

	}

}
