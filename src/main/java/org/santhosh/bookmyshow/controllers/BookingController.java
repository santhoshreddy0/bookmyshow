package org.santhosh.bookmyshow.controllers;

import org.santhosh.bookmyshow.dtos.BookMovieRequestDto;
import org.santhosh.bookmyshow.dtos.BookMovieResponseDto;
import org.santhosh.bookmyshow.models.Booking;
import org.santhosh.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookMovie(BookMovieRequestDto bookMovieRequestDto) {

        return null;
    }

}
