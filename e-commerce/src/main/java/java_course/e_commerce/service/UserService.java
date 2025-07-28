package java_course.e_commerce.service;

import java_course.e_commerce.controller.dto.CreateUserDto;
import java_course.e_commerce.entities.BillingAddressEntity;
import java_course.e_commerce.entities.UserEntity;
import java_course.e_commerce.repository.BillingAddressRepository;
import java_course.e_commerce.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final BillingAddressRepository billingAddressRepository;

    public UserService(UserRepository userRepository, BillingAddressRepository billingAddressRepository) {
        this.userRepository = userRepository;
        this.billingAddressRepository = billingAddressRepository;
    }

    public UserEntity createUser(CreateUserDto dto) {

        var billingAddress = new BillingAddressEntity();
        billingAddress.setAddress(dto.address());
        billingAddress.setNumber(dto.number());
        billingAddress.setComplement(dto.complement());

        var savedBillingAddress = billingAddressRepository.save(billingAddress);

        var user = new UserEntity();
        user.setFullName(dto.fullName());
        user.setBillingAddress(savedBillingAddress);

        return userRepository.save(user);
    }

    public Optional<UserEntity> findById(UUID userId) {

        return userRepository.findById(userId);
    }

    public boolean deleteById(UUID userId) {

        var exists = userRepository.existsById(userId);

        if (exists) {
            userRepository.deleteById(userId);
        }

        return exists;
    }
}
