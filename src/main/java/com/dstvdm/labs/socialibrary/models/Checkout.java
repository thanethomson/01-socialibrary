package com.dstvdm.labs.socialibrary.models;

import com.dstvdm.labs.socialibrary.enums.BookCondition;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "checkouts")
public class Checkout {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * Which book was checked out?
     */
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    private Book book;

    /**
     * Who checked this book out?
     */
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    private User byUser;

    /**
     * Keep track of when the book was checked out.
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedOut = new Date();

    /**
     * In what condition was the book when it was checked out?
     */
    private BookCondition checkoutCondition;

    /**
     * When was this book checked back in?
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkedIn = null;

    /**
     * In what condition was the book when it was checked back in?
     */
    private BookCondition checkinCondition;


    public Checkout() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getByUser() {
        return byUser;
    }

    public void setByUser(User byUser) {
        this.byUser = byUser;
    }

    public Date getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(Date checkedOut) {
        this.checkedOut = checkedOut;
    }

    public BookCondition getCheckoutCondition() {
        return checkoutCondition;
    }

    public void setCheckoutCondition(BookCondition checkoutCondition) {
        this.checkoutCondition = checkoutCondition;
    }

    public Date getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Date checkedIn) {
        this.checkedIn = checkedIn;
    }

    public BookCondition getCheckinCondition() {
        return checkinCondition;
    }

    public void setCheckinCondition(BookCondition checkinCondition) {
        this.checkinCondition = checkinCondition;
    }
}
