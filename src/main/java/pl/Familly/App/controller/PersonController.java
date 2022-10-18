package pl.Familly.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.Familly.App.model.Person;
import pl.Familly.App.service.PersonService;


@Controller
public class PersonController {


    @Autowired
    private PersonService personService;


    @GetMapping("/persons/create")
    public String showPersonForm(ModelMap modelMap){
        modelMap.addAttribute("emptyPerson",new Person());
        return"person-create";
    }

    @PostMapping("/persons/save")
    public String handleNewPerson(@ModelAttribute("emptyPerson") Person person){
        personService.save(person);
        return "redirect:/persons/list";
    }

    @GetMapping("/persons/list")
    public String showAllPerson(ModelMap modelMap){
        modelMap.addAttribute("persons",personService.getAll());
        return"person-list";
    }





}
