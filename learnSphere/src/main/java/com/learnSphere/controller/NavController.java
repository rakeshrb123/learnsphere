package com.learnSphere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
@GetMapping("/")
public String index() {
	return "index";
}
@GetMapping("/register")
public String register() {
	return "register";
}
@GetMapping("/login")
public String login() {
	return "login";
}
@GetMapping("/home")
public String home() {
	return "home";
}
//for trainer page
@GetMapping("/createCourse")
public String addCourse() {
	return "createCourse";
}
@GetMapping("/addLesson")
public String addLesson() {
	return "addLesson";
}
//@GetMapping("/showCourses")
//public String showCourses() {
//	return "showCourses";
//}
//student home
@GetMapping("/studentHome")
public String studentHome() {
	return "studentHome";
}
//trainer home
@GetMapping("/trainerHome")
public String trainerHome() {
	return "trainerHome";
}


//@GetMapping("/courses")
//public String courses() {
//	return "courses";
//}
//for student home
//@GetMapping("/purchase")
//public String purchase() {
//	return "purchase";
//}
@GetMapping("/myCourses")
public String myCourses() {
	return "myCourses";
}

//mycourses
@GetMapping("/course1")
public String course1() {
	return "demoLesson";

}
@GetMapping("/course2")
public String course2() {
	return "demoLesson";

}
@GetMapping("/goToLesson")
public String goToLesson() {
	return "goToLesson";
}

//@GetMapping("/myLesson")
//public String myLesson() {
//	return "myLesson";
//}

//@GetMapping("/demoLesson")
//public String demoLesson() {
//	return "demoLesson";
//}
//@GetMapping("/goToLesson")
//public String goToLesson() {
//	return "goToLesson";
//}


@GetMapping("/buying")
public String buying() {
	return "index1";
}




}

//}


