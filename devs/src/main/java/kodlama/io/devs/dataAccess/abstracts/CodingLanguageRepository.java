package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.CodingLanguage;


public interface CodingLanguageRepository {

	List<CodingLanguage> getAll();
	
	void add(CodingLanguage codingLanguage);
	
	void delete(int id);
	
	void update(CodingLanguage codingLanguage);
	
	CodingLanguage getId(int id);
	
}
