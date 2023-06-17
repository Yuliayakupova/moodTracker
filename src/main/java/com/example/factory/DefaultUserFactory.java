//package com.example.factory;
//
//import com.example.dto.User;
//import com.example.repository.UserRepository;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//
//@Component
//public class DefaultUserFactory implements UserFactory{
//
//    private final UserRepository userRepository;
//
//    public DefaultUserFactory(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public User createUser(String login, String password, String userEmail, String userFirstName, String userLastName, String personalCode, LocalDate dateOfBirth, String contact) {
//        User user = new User(login, password, userEmail, userFirstName, userLastName, personalCode, dateOfBirth, contact);
//        userRepository.saveUserData(user);
//        return user;
//    }
//}
