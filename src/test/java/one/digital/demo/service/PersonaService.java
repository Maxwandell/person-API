package one.digital.demo.service;

import one.digital.demo.DTO.response.MessageResponseDTO;
import one.digital.demo.entity.Persona;
import one.digital.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;


    public MessageResponseDTO createPersona(@RequestBody Persona persona) {
        Persona savedPerson = personaRepository.save(persona);
        return one.digital.demo.DTO.response.MessageResponseDTO.builder().
                message("Created person with id" + savedPerson.getId()).
                build();

    }
}