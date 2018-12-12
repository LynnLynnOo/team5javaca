package sg.iss.team5.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import sg.iss.team5.model.Coursedetail;
import sg.iss.team5.model.Lecturer;
import sg.iss.team5.model.Student;
import sg.iss.team5.model.Studentcourse;
import sg.iss.team5.model.User;
import sg.iss.team5.repository.CoursedetailRepository;
import sg.iss.team5.repository.LecturerRepository;
import sg.iss.team5.repository.StudentRepository;
import sg.iss.team5.repository.StudentcourseRepository;
import sg.iss.team5.repository.UserRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	LecturerRepository lecturerRepository;
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	CoursedetailRepository cdRepository;
	@Autowired
	StudentcourseRepository scRepository;

	// Student
	@Override
	public ArrayList<Student> findAllStudents() {
		return studentRepository.findAllStudents();
	}

	public ArrayList<Student> findNotEnrolled() {
		return studentRepository.findNotEnrolled();
	}

	@Override
	public Student findStudentById(String sid) {
		Student student = studentRepository.findStudentById(sid);
		System.out.println(student.toString());
		return student;
	}

	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		studentRepository.save(student);
		return student;
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

	public ArrayList<Coursedetail> getCourseDetailList() {
		return cdRepository.findAllCoursedetail();
	}

	public Integer getEnrolledCapacity(String courseId) {
		return cdRepository.getCurrentEnrolledCapacity(courseId);
	}

	public ArrayList<Studentcourse> findCourseByCourseId(String cid) {
		System.out.println(cid);
		return scRepository.findCourseByCourseId(cid);
	}

	@Override
	public Student findStudent(String nric) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStudent(Student s) {
		// TODO Auto-generated method stub

	}

	@Override
	public User createUser(User u) {
		return userRepository.save(u);
	}

}