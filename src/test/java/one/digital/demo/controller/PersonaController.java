package one.digital.demo.controller;


import one.digital.demo.DTO.response.MessageResponseDTO;
import one.digital.demo.entity.Persona;
import one.digital.demo.repository.PersonaRepository;
import one.digital.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonaController {
    @Autowired
    private PersonaService personaService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPersona(@RequestBody Persona persona){
        return  personaService.createPersona(persona);


    }
}
