package Repository.impl;

import LibraryManagementService.LibraryManagementService;
import Models.Library;
import Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LibraryRepositoryImpl {

    @Autowired
    LibraryRepository libraryRepository;

    public List<Library> getAllBooks(){
       return libraryRepository.findAll();
    }

    public void save(Library library){

         libraryRepository.save(library);
    }

}
