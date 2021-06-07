
package com.cg.onlineshoppingapps.dao;

import java.util.List;

import com.cg.onlineshoppingapps.pojo.Address;


public class IAddressRepositoryImpl implements IAddressRepository {
	
	@Override
	public Address addAddress(Address add) {   
		
		return null;
	}

	@Override
	public Address updateAddress(Address add) {
		return null;
	}

	@Override
	public Address removeAddress(Address add) {
		return null;
	}

	@Override
	public List<Address> viewAllAddress(String id) {
		return null;
	}

	@Override
	public Address viewAddress(Address add) {
		return null;
	}

}
//public StudentPojo addStudent(StudentPojo student) {
//	student.setStudentId(allStudents.get(allStudents.size() - 1).getStudentId() + 1);
//	allStudents.add(student);
//	return student;
//}
//
//public boolean deleteStudent(int studId) {
//	boolean flag = false;
//	for (StudentPojo student : allStudents) {
//		if (student.getStudentId() == studId) {
//			flag = true;
//			allStudents.remove(student);
//			break;
//		}
//	}
//	return flag;
//}

