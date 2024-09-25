package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public String viewPersons(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        return "list-persons";
    }

    @GetMapping("/persons/add")
    public String addPersonForm(Model model) {
        model.addAttribute("person", new Person());
        return "add-person";
    }

    @PostMapping("/persons/add")
    public String savePerson(@ModelAttribute Person person) {
        personService.savePerson(person);
        return "redirect:/persons";
    }

    @GetMapping("/persons/edit/{id}")
    public String editPersonForm(@PathVariable Long id, Model model) {
        Person person = personService.getPersonById(id);
        model.addAttribute("person", person);
        return "edit-person";
    }

    @PostMapping("/persons/edit/{id}")
    public String updatePerson(@PathVariable Long id, @ModelAttribute Person person) {
        personService.savePerson(person);
        return "redirect:/persons";
    }

    @GetMapping("/persons/delete/{id}")
    public String deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return "redirect:/persons";
    }
}
