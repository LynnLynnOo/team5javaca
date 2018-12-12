package sg.iss.team5.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.iss.team5.model.Coursedetail;
import sg.iss.team5.model.Lecturer;
import sg.iss.team5.model.Student;
import sg.iss.team5.repository.CoursedetailRepository;
import sg.iss.team5.repository.LecturerRepository;
import sg.iss.team5.repository.StudentRepository;
import sg.iss.team5.repository.UserRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Resource
	LecturerRepository lecturerRepository;
	@Resource
	StudentRepository studentRepository;
	@Resource
	UserRepository userRepository;
	@Resource
	CoursedetailRepository cdRepository;

	// Student
	@Override
	public ArrayList<Student> findAllStudents() {
		return studentRepository.findAllStudents();
	}

	@Override
	public Student findStudentById(String sid) {
		Student student = studentRepository.findStudentById(sid);
		System.out.println(student.toString());
		return student;
	}

	@Override
	@Transactional
	public Student createStudent(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Lecturer> findAllLecturers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lecturer findLecturerById(String lid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lecturer createLecturer(Lecturer lecturer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lecturer updateLecturer(Lecturer lecturer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Coursedetail> findAllCoursedetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coursedetail findCoursedetailById(String cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coursedetail createCoursedetail(Coursedetail cd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coursedetail updateCoursedetail(Coursedetail cd) {
		// TODO Auto-generated method stub
		return null;
	}

}