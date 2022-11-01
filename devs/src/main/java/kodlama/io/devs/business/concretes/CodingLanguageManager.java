package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.CodingLanguageService;
import kodlama.io.devs.dataAccess.abstracts.CodingLanguageRepository;
import kodlama.io.devs.entities.concretes.CodingLanguage;

@Service
public class CodingLanguageManager implements CodingLanguageService{

	
	private CodingLanguageRepository codingLanguageRepository;
	private List<CodingLanguage> languages;
	
	@Autowired
	public CodingLanguageManager(CodingLanguageRepository codingLanguageRepository) {
		this.codingLanguageRepository = codingLanguageRepository;
		this.languages = codingLanguageRepository.getAll();
	}

	@Override
	public List<CodingLanguage> getAll() {
		
		return codingLanguageRepository.getAll();
	}

	@Override
	public void add(CodingLanguage codingLanguage) throws Exception {
		
		if(codingLanguage.getName().isBlank()) {
			throw new Exception("HATA!!! Program Adı Boş Olamaz!");
		}
		
		if(isNameExist(codingLanguage.getName())){
			throw new Exception("HATA!!! İSİM TEKRAR EDEMEZ");
		}
		if(isIdExist(codingLanguage.getId())) {
			throw new  Exception("HATA!!! ID TEKRAR EDEMEZ");
		}
		
		
		codingLanguageRepository.add(codingLanguage);
		
	}

	@Override
	public void update(CodingLanguage codingLanguage) throws Exception {
	
		if(codingLanguage.getName().isBlank()) {
			throw new Exception("HATA!!! Program Adı Boş Olamaz!");
		}
		if(isNameExist(codingLanguage.getName())){
			throw new Exception("HATA!!! İSİM TEKRAR EDEMEZ");
		}
		if(!isIdExist(codingLanguage.getId())) {
			throw new  Exception("HATA!!! ID BULUNAMADI");
		}
		codingLanguageRepository.update(codingLanguage);
	}

	@Override
	public void delete(int id) throws Exception {
		
		if(!isIdExist(id)) {
			throw new  Exception("HATA!!! ID BULUNAMADI");
		}
		codingLanguageRepository.delete(id);
		
	}

	@Override
	public CodingLanguage getId(int id) {
		return codingLanguageRepository.getId(id);
	}
	
	private boolean isNameExist (String name) {
		for(CodingLanguage lng : getAll()) {
			if(lng.getName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isIdExist (int id) {
		for(CodingLanguage lng : getAll()) {
			if(lng.getId() == id) {
				return true;
			}
		}
		return false;
	}


}
