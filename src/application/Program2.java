package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) { // main para teste da classe DepartmentDaoJDBC

		DepartmentDao deptDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("======= Teste 1 - Insert =======");

		Department department = new Department(null, "RH");
		deptDao.insert(department);
		System.out.println("Insertion successful.Id: " + department.getId());

		System.out.println("======= Teste 2 - Update =======");

		department = new Department(9, "zoom");
		deptDao.update(department);
		System.out.println("Update successful!");

		System.out.println("======= Teste 3 - Delete By Id =======");

		System.out.println("Type the id number you need to delete: ");
		int id = sc.nextInt();
		department = new Department(id, null);
		deptDao.deleteById(department);
		System.out.println("Delete successful!");

		System.out.println("======= Teste 4 - Find By Id =======");
		System.out.println("Type the id number you need to find: ");
		int idToFind = sc.nextInt();
		System.out.println(deptDao.findById(idToFind));
		

		System.out.println("======= Teste 5 - Find All =======");
		List<Department> list = deptDao.findAll();

		for (Department d : list) {
			System.out.println(d);
		}

		sc.close();

	}

}
