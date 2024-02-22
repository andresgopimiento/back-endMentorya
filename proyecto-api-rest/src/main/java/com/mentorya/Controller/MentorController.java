package com.mentorya.Controller;

import com.mentorya.Entity.MentorEntity;
import com.mentorya.Repository.MentorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mentores")
public class MentorController {
    private final MentorRepository mentorRepository;
    public MentorController(MentorRepository mentorRepository){
        this.mentorRepository = mentorRepository;
    }
    @GetMapping
    public List<MentorEntity> obtenerMentor(){
        return mentorRepository.findAll();
    }
    @PostMapping
    public MentorEntity crearMentor(@RequestBody MentorEntity mentor){
        return mentorRepository.save(mentor);
    }
    @PutMapping("/{id}")
    public MentorEntity actualizarMentor(@PathVariable Long id, @RequestBody MentorEntity mentor){
        return mentorRepository.findById(id).map(mentorMap ->{
            mentorMap.setNombre(mentor.getNombre());
            mentorMap.setApellido(mentor.getApellido());
            mentorMap.setEmail(mentor.getEmail());
            mentorMap.setTelefono(mentor.getTelefono());
            mentorMap.setProfesion(mentor.getProfesion());
            mentorMap.setRubro(mentor.getRubro());
            return mentorRepository.save(mentorMap);
        }).orElse(null);
    }
    @DeleteMapping("/{id}")
    public void borrarMentor(@PathVariable Long id){
        mentorRepository.deleteById(id);
    }
}
