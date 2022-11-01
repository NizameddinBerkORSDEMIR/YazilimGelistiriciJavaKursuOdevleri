package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.CodingLanguageService;
import kodlama.io.devs.entities.concretes.CodingLanguage;

@RestController
@RequestMapping("/api/CodingLanguages")
public class CodingLanguagesController {

	private CodingLanguageService codingLanguageService;

	@Autowired
	public CodingLanguagesController(CodingLanguageService codingLanguageService) {
		this.codingLanguageService = codingLanguageService;
	}
	
	@GetMapping
	public List<CodingLanguage> getAll(){
		return codingLanguageService.getAll();	
	}
	
	@PostMapping	
	public void add(@RequestBody CodingLanguage codingLanguage) throws Exception {
		codingLanguageService.add(codingLanguage);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) throws Exception {
		codingLanguageService.delete(id);
	}
	
	@PutMapping
	public void update(@RequestBody CodingLanguage codingLanguage) throws Exception {
		codingLanguageService.update(codingLanguage);
	}
	
	@GetMapping("{id}")
	public CodingLanguage getId(@PathVariable int id) {
		return codingLanguageService.getId(id);
		
	}
	
}
