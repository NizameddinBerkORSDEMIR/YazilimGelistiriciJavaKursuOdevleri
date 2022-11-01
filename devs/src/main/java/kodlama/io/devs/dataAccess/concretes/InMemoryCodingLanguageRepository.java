package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.CodingLanguageRepository;
import kodlama.io.devs.entities.concretes.CodingLanguage;

@Repository
public class InMemoryCodingLanguageRepository implements CodingLanguageRepository{

	List<CodingLanguage> languages;
	
	
	public InMemoryCodingLanguageRepository() {
		languages = new ArrayList<CodingLanguage>();
		languages.add(new CodingLanguage("C#", 1));
		languages.add(new CodingLanguage("Java", 2));
		languages.add(new CodingLanguage("JavaScript", 3));
		languages.add(new CodingLanguage("Python", 4));
		languages.add(new CodingLanguage("Groovy#", 5));
	}

	@Override
	public List<CodingLanguage> getAll() {
		
		return languages;
	}

	//-----------------------------------------------------------------
	
	@Override
	public void add(CodingLanguage codingLanguage) {
		languages.add(codingLanguage);
		System.out.println("Programlama Dili Eklendi: "+ codingLanguage.getName());
		
	}
	
	//-----------------------------------------------------------------

	@Override
	public void delete(int id) {
		languages.removeIf(item->item.getId() == id);
		System.out.println("Programlama Dili Silindi ID: " + id);	
	}

	//-----------------------------------------------------------------
	
	@Override
	public void update(CodingLanguage codingLanguage) {
		for(CodingLanguage language: languages) {
			if(language.getId() == codingLanguage.getId()) {
				language.setName(codingLanguage.getName());
				
				System.out.println("Programlama Dili Güncellendi: "+ language.getName());
			}
		}
	}

	//-----------------------------------------------------------------
	
	@Override
	public CodingLanguage getId(int id) {
		for(CodingLanguage language : languages) {
			if(language.getId() == id) {
				return language;
			}
		}
		return null;
	}

}
