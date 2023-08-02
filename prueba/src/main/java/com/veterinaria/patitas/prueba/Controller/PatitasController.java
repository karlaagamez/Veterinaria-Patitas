package com.veterinaria.patitas.prueba.Controller;

import com.veterinaria.patitas.prueba.Model.*;
import com.veterinaria.patitas.prueba.Repository.CitaRepository;
import com.veterinaria.patitas.prueba.Repository.PacienteRepository;
import com.veterinaria.patitas.prueba.Repository.PersonaRepository;
import com.veterinaria.patitas.prueba.Repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class PatitasController {
    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private CitaRepository citaRepository;

    @GetMapping(value = "/veterinarios")
    public List<Veterinario> getVeterinarios(){
        return veterinarioRepository.findAll();
    }
    @PostMapping(value = "/guardaVet")
    public String guardaVet(@RequestBody VeterinarioComp veterinario){
        Persona persona = new Persona();
        persona.setNombrePer(veterinario.getNombrePer());
        persona.setApePaterno(veterinario.getApePaterno());
        persona.setApeMaterno(veterinario.getApeMaterno());
        Persona personaGuardada = personaRepository.save(persona);

        Veterinario vet =new Veterinario();
        vet.setIdPersona(personaGuardada.getId());
        vet.setCedula(veterinario.getCedula());
        veterinarioRepository.save(vet);
        return "Veterinario Guardado";
    }
@PutMapping(value = "/actualizarVet/{id}")
    public String actualizaVet(@PathVariable long id, @RequestBody VeterinarioComp veterinario){
        Veterinario vetActualizado = veterinarioRepository.findById(id).get();
        vetActualizado.setCedula(veterinario.getCedula());

        Persona perActualizado = personaRepository.findById(vetActualizado.getIdPersona()).get();
        perActualizado.setNombrePer(veterinario.getNombrePer());
    System.out.println("perActualizado.getNombrePer() = " + perActualizado.getNombrePer());
        perActualizado.setApePaterno(veterinario.getApePaterno());
        perActualizado.setApeMaterno(veterinario.getApeMaterno());
        
        personaRepository.save(perActualizado);
        veterinarioRepository.save(vetActualizado);

    return "Veterinario Actualizado";

    }
    @DeleteMapping(value = "/borrarVet/{id}")
    public String borrarVeterinario(@PathVariable long id){
        Veterinario borrarVet = veterinarioRepository.findById(id).get();
        veterinarioRepository.delete(borrarVet);

        return "Veterinario Borrado";
    }

    @GetMapping(value = "/pacientes")
    public List<Paciente> getPacientes(){
        return pacienteRepository.findAll();
    }
    @PostMapping(value = "/guardaPaciente")
    public String guardaPaciente(@RequestBody PacienteComp paciente){
        Persona persona = new Persona();
        persona.setNombrePer(paciente.getNombrePer());
        persona.setApePaterno(paciente.getApePaterno());
        persona.setApeMaterno(paciente.getApeMaterno());
        Persona personaGuardada = personaRepository.save(persona);

        Paciente paciente1 = new Paciente();
        paciente1.setNombre(paciente.getNombre());
        paciente1.setEspecie(paciente.getEspecie());
        paciente1.setFechaNacimiento(paciente.getFechaNacimiento());
        paciente1.setTelefono(paciente.getTelefono());
        paciente1.setIdPersona(personaGuardada.getId());
        pacienteRepository.save(paciente1);
        return "Paciente Guardado";
    }
    @PutMapping(value = "/actualizarPaciente/{id}")
    public String actualizaVet(@PathVariable long id, @RequestBody PacienteComp paciente){
        Paciente pacienteAct = pacienteRepository.findById(id).get();
        pacienteAct.setNombre(paciente.getNombre());
        pacienteAct.setEspecie(paciente.getEspecie());
        pacienteAct.setFechaNacimiento(paciente.getFechaNacimiento());
        pacienteAct.setTelefono(paciente.getTelefono());

        Persona perActualizado = personaRepository.findById(pacienteAct.getIdPersona()).get();
        perActualizado.setNombrePer(paciente.getNombrePer());
        perActualizado.setApePaterno(paciente.getApePaterno());
        perActualizado.setApeMaterno(paciente.getApeMaterno());

        personaRepository.save(perActualizado);
        pacienteRepository.save(pacienteAct);
        return "Veterinario Actualizado";

    }
    @DeleteMapping(value = "/borrarPaciente/{id}")
    public String borrarPaciente(@PathVariable long id){
        Paciente borrarPaciente = pacienteRepository.findById(id).get();
        pacienteRepository.delete(borrarPaciente);

        return "Paciente Borrado";
    }
    @GetMapping(value = "/citas")
    public List<Cita> getCitas(){
        return citaRepository.findAll();
    }
    @PostMapping(value = "/guardarCita")
    public String guardarCita(@RequestBody Cita cita){
        citaRepository.save(cita);
        return "Veterinario Guardado";
    }
    @PutMapping(value = "/actualizaCita/{id}")
    public String actualizaCita(@PathVariable long id, @RequestBody Cita cita){
        Cita citaAct = citaRepository.findById(id).get();
        citaAct.setIdPaciente(cita.getIdPaciente());
        citaAct.setFecha(cita.getFecha());
        citaAct.setIdVeterinario(cita.getIdVeterinario());

        citaRepository.save(citaAct);
        return "Cita Actualizada";
    }
    @DeleteMapping(value = "/borrarCita/{id}")
    public String borrarCita(@PathVariable long id){
        Cita borrarCita = citaRepository.findById(id).get();
        citaRepository.delete(borrarCita);

        return "Cita Borrada";
    }
}
