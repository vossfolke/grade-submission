package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GradeController {


    List<Grade> grades = new ArrayList<>();
    @GetMapping("/grades")
    public String getGrade(Model model){
        model.addAttribute("grade", grades);
        return "grades";
    }

    @GetMapping("/")
    public String gradeForm(Model model){
        model.addAttribute("grade", new Grade());
        return "form";

    }

    @PostMapping("/handleSubmit")
    public String submitForm(Grade grade) {
        grades.add(grade);
        return "redirect:/grades";
    }



}
