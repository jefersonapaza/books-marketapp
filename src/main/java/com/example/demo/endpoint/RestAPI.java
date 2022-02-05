package com.example.demo.endpoint;
import com.example.demo.model.Book;
import com.example.demo.model.Sale;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class RestAPI {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    SaleRepository saleRepository;

    @RequestMapping(value = "/getBooks", method = RequestMethod.GET ,  produces = "application/json")
    private ResponseEntity<Book> getBooks(){

        List<Book> books = bookRepository.findAll();
        return new ResponseEntity(books, HttpStatus.OK);

    }

    @RequestMapping(value = "/getSales", method = RequestMethod.GET ,  produces = "application/json")
    private ResponseEntity<Book> getSales(){


        List<Sale> sales = saleRepository.findAll();
        return new ResponseEntity(sales, HttpStatus.OK);
    }

}
