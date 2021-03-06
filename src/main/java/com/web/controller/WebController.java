package com.web.controller;


import com.web.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class WebController {


    @RequestMapping("/new")
    public String newPage(){


        return "newpage";// returning newpage.jsp for view
    }

    @RequestMapping("/home")
    public String defaultMapping(){

        return "index"; // returning index.jsp for view
    }
    @RequestMapping("/mypage")
    public String mypage(){

        return "mypage"; // returning mypage.jsp for view
    }
    @RequestMapping("/filename")
    public String mypageFile(){

        return "filename"; // returning filename.jsp for view
    }


    @RequestMapping(value = "/hello",method = POST)
    public String sayHello(@RequestParam("name") String name, Model model) {
        model.addAttribute("USER_ID", name);  // key and value
        model.addAttribute("name","JAVA");

        Student student=new Student("Rahul",12,"Computer science");

        model.addAttribute("Student",student);// key and value

        return "hello";// returning hello.jsp view name


    }

    @RequestMapping("/mvc")
    public String myPage(Model model){

        model.addAttribute("language","Java");
        model.addAttribute("framework","Spring and Spring Boot");
        model.addAttribute("cloud","Pivotal Coud Foundry");
        model.addAttribute("devops","JENKINS");

        return "mvcpage";
    }




}
