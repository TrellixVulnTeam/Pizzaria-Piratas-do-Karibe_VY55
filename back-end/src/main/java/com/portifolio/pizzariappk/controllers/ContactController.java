package com.portifolio.pizzariappk.controllers;

import com.portifolio.pizzariappk.dto.ContactResponseDTO;
import com.portifolio.pizzariappk.dto.request.ContactRequestDTO;
import com.portifolio.pizzariappk.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;


    // método para pesquisar por id
    @GetMapping("/{id}")
    public ContactResponseDTO findById(@PathVariable Long id){
        return contactService.findById(id);
    }

    // método para adicionar novo contato
    @PostMapping
    public ContactRequestDTO addContact(@RequestBody ContactRequestDTO contactRequestDTO){
        return contactService.addContact(contactRequestDTO);
    }
}
