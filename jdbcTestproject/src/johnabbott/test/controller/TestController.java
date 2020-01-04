package johnabbott.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import johnabbott.test.model.Department;
import johnabbott.test.service.DepartmentService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	DepartmentService service;
	
	@RequestMapping(value = "/department", method = RequestMethod.GET)
	public ModelAndView getDepartments() {
		ModelAndView mv = new ModelAndView("departments");
		List<Department> departments = service.getDepartments();
		mv.addObject("deps", departments);
		return mv;
	}
	
	@RequestMapping(value = "/adddepartment/{name}", method = RequestMethod.GET)
	public String addDepartments(@PathVariable("name") String depName) {
		if (service.addDepartment(new Department(depName))) {
			return"redirect:/test/department";
		}
		return "error";
	}
}
