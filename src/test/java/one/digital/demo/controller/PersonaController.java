package one.digital.demo.controller;


import one.digital.demo.DTO.response.MessageResponseDTO;
import one.digital.demo.entity.Persona;
import one.digital.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonaController {

    private PersonaRepository personaRepository;

    @Autowired
    public PersonaController(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    @PostMapping
    public MessageResponseDTO createPersona(@RequestBody Persona persona){

        Persona savedPerson = personaRepository.save(persona);
        return MessageResponseDTO.builder().
                message("Created person with id"+ savedPerson.getId()).
                build();


    }
}
