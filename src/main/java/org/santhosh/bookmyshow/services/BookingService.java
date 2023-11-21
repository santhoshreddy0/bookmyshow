package org.santhosh.bookmyshow.services;

import org.santhosh.bookmyshow.exceptions.InvalidUserException;
import org.santhosh.bookmyshow.models.Booking;
import org.santhosh.bookmyshow.models.User;
import org.santhosh.bookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private UserRepository userRepository;

    @Autowired
    public BookingService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    Booking bookMovie(Long userId, Long showId, List<Long> showSeatIds) throws InvalidUserException {
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isEmpty()) {
            throw new InvalidUserException("Invalid User");
        }
        return null;
    }
}
