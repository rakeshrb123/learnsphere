package com.learnSphere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;

import com.learnSphere.services.TrainerService;
@Controller
public class TrainerController {
	@Autowired
	TrainerService s;
	@PostMapping("/addCourse")
	public String addUser(@RequestParam("courseId")int courseId,
			@RequestParam("courseName")String courseName,
			@RequestParam("coursePrice")int coursePrice)
			 {
		System.out.println(courseId+courseName+coursePrice);
		Course c=new Course();
		c.setCourseId(courseId);
		c.setCourseName(courseName);
		c.setCoursePrice(coursePrice);

		s.addCourse(c);
		return "redirect:/";
			 }





@PostMapping("/lesson")
public String addLesson(@RequestParam("courseId")int courseId,
		@RequestParam("lessonId")int lessonId,
		@RequestParam("lessonName")String lessonName,
		@RequestParam("lessonTopics")String lessonTopics,
		@RequestParam("link")String link) 
		 {
	Course c=s.getCourse(courseId);
	Lesson l=new Lesson(lessonId,lessonName,lessonTopics,link,c); 
	s.addLesson(l);
	c.getLessons().add(l);
	return "redirect:/";
		 }


@GetMapping("/showCourses")
public String showCourses(Model model) {
	List<Course> list=s.courseList();
	model.addAttribute("courseList",list);
	//System.out.println(courseList);
	return "courses";
	
}
@GetMapping("/buyCourse")
public String buyCourses(Model model) {
	List<Course> list=s.courseList();
	model.addAttribute("courseList",list);
	//System.out.println(courseList);
	return "purchase";
		 }
}
