package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.CodingLanguage;

public interface CodingLanguageService {

	List<CodingLanguage> getAll();
	
	void add(CodingLanguage codingLanguage) throws Exception;
	
	void update(CodingLanguage codingLanguage) throws Exception;
	
	void delete(int id) throws Exception;
	
	CodingLanguage getId(int id);
	
}
