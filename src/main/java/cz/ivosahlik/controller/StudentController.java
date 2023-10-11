package cz.ivosahlik.controller;

import cz.ivosahlik.model.Student;
import cz.ivosahlik.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class StudentController {

    private final StudentService studentService;

    @GetMapping(value = "/students")
    public ModelAndView students() {
        List<Student> students = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("students", students);
        modelAndView.setViewName("student/list");
        return modelAndView;
    }

    @GetMapping(value = "/student")
    public String create(Model model) {
        model.addAttribute("student", new Student());
        return "student/edit";
    }

    @PostMapping(value = "/student")
    public String edit(@Validated @ModelAttribute("student") Student student,
                       BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("errors", result.getAllErrors());
            return "student/edit";
        }
        return "redirect:/students";
    }

    @GetMapping(value = "/student/{id}")
    public String view(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.findOne(id));
        return "student/edit";
    }

    @GetMapping(value = "/student/delete/{id}")
    public String delete(@PathVariable Long id, Model model) {
        studentService.delete(id);
        return "redirect:/students";
    }
}
