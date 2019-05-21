package com.starwar.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starwar.apirest.models.Planeta;
import com.starwar.apirest.repository.PlanetaRepository;

@RestController
@RequestMapping(value="/api")
public class PlanetaResource {

	@Autowired
	PlanetaRepository planetaRepository;
	
	@GetMapping("/planetas")
	public List<Planeta> listaPlanetas()
	{
		return planetaRepository.findAll();
	}
	
	@GetMapping("/planetas/{id}")
	public Planeta listaPlanetasUnico(@PathVariable(value="id") long id)
	{
		return planetaRepository.findById(id);
	}
	
	@GetMapping("/planetas/{name}")
	public Planeta listaPlanetasUnico(@PathVariable(value="name") String name)
	{
		return planetaRepository.findById(name);
	}
	
	@PostMapping("/planeta")
	public Planeta salvaPlaneta(@RequestBody Planeta planeta) 
	{
		return planetaRepository.save(planeta);
	}
	
	@DeleteMapping("/planeta")
	public void deletaPlaneta(@RequestBody Planeta planeta) 
	{
		planetaRepository.delete(planeta);
	}
	
	@PutMapping("/planeta")
	public Planeta atualizaPlaneta(@RequestBody Planeta planeta) 
	{
		return planetaRepository.save(planeta);
	}
	
}
