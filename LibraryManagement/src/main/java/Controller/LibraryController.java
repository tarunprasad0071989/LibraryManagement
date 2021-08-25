package Controller;


import LibraryManagementService.LibraryManagementService;
import Models.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libraryManagement")
public class LibraryController {
    @Autowired
    LibraryManagementService libraryManagementService;

    @GetMapping("/getBooks")
    public List<Library> getAllBooks()
    {
        return   libraryManagementService.getAllBooksService();
    }

    @PostMapping("/addBook")
    public void save(@RequestParam String book)
    {
        libraryManagementService.addBook(book);
    }

    @PostMapping("/search")
    public List<Library>  search(@RequestParam String book)
    {
       return libraryManagementService.searchBooks(book);
    }
}
