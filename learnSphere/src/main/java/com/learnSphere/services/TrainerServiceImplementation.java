package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;
import com.learnSphere.repository.CourseRepository;
import com.learnSphere.repository.LessonRepository;
@Service
public class TrainerServiceImplementation implements TrainerService{
	@Autowired
CourseRepository crepo;
	@Autowired
	LessonRepository lrepo;
	@Override
public String addCourse(Course c) {
	crepo.save(c);
	return "course added";
}
	@Override
	public String addLesson(Lesson l) {
    lrepo.save(l);
		return "lesson added successfully";
	}
	
	
	@Override
	public Course getCourse(int courseId) {
     return crepo.findById(courseId).get();
	}
	@Override
	public List<Course> courseList() {
		return crepo.findAll();
	}
}
