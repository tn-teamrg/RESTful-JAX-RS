package com.readlearncode.dukesbookshop.restserver.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import com.readlearncode.dukesbookshop.restserver.domain.Book;
import com.readlearncode.dukesbookshop.restserver.infrastructure.BookRepository;

@Stateless
@Path("/books")
public class BookResource {

	@EJB
	private BookRepository bookRepository;
	
	@GET
	public Response getAllBooks() {
		List<Book> books = bookRepository.getAll();
		GenericEntity<List<Book>> bookWrapper = new GenericEntity<List<Book>>(books) {};
			return Response.ok(bookWrapper).build();
	}

    @POST
    public Response saveBook(final Book book){
        Book persistedBook = bookRepository.saveBook(book);
        return Response.ok(persistedBook).build();
    }
}
