package crud7.boot_crud7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import crud7.boot_crud7.entity.Student;
import crud7.boot_crud7.service.CrudService;

@Controller
public class CrudController {
	@Autowired
	CrudService service;
	
	@GetMapping("/")
	public String loadHome() {
		return "home.html";
		
	}
	
	
	@GetMapping("/insert")
	public String loadAdd() {
		return "add.html";
		
	}
	
	@PostMapping("/insert")
	public String add(@ModelAttribute Student student,Model model) {
		return service.add(student, model);
	}

	@GetMapping("/fetch")
	public String fetch(Model model,@RequestParam (defaultValue="") String search ) {
	return service.fetch(model,search);
	}
	@GetMapping("/delete{id}")
	public String delete(@PathVariable int id,Model model) {
	return service.delete(id,model);
    }
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model model) {
		return service.edit(id,model);
	}
	@PostMapping("/update")
	public String update(@ModelAttribute Student student,Model model) {
		return service.updateProduct(student,model);
	}
}	