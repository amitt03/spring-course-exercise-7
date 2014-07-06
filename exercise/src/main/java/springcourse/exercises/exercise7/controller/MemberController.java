package springcourse.exercises.exercise7.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import springcourse.exercises.exercise7.model.Book;
import springcourse.exercises.exercise7.model.Member;
import springcourse.exercises.exercise7.service.api.ILibrary;

import java.util.Collection;

/**
 * @author Amit Tal
 * @since 4/10/2014
 */
@RestController
@RequestMapping("/members")
public class MemberController {

    private Logger logger = LoggerFactory.getLogger(MemberController.class);

    private ILibrary library;

    @Autowired
    public void setLibrary(ILibrary library) {
        this.library = library;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Member> getAllMembers() {
        Collection<Member> allMembers = library.getAllMembers();
        return allMembers;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Member createMembership(@RequestBody Member member) {
        Member membership = library.createMembership(member);
        return membership;
    }

    // TODO Restify method (add appropriate annotations)
    // TODO Structural hint, the member model has a collection of loanedBooks inside of it...
    public Book loanBook(String memberId, String catalogId) {
        Book book = library.loanBook(catalogId, memberId);
        return book;
    }

    // TODO Restify method (add appropriate annotations)
    public Collection<Book> readAllLoanedBooks(String memberId) {
        Collection<Book> loanedBooks = library.getLoanedBooks(memberId);
        return loanedBooks;
    }

    // TODO Restify method (add appropriate annotations)
    public void returnBook(String memberId, String catalogId) {
        library.returnBook(catalogId, memberId);
    }
}
