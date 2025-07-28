package java_course.e_commerce.controller;

import java_course.e_commerce.controller.dto.CreateUserDto;
import java_course.e_commerce.entities.UserEntity;
import java_course.e_commerce.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody CreateUserDto dto) {

        var user = userService.createUser(dto);


        //Retorna um 201 Created    |  indica onde conseguimos achar o usuário.
        return ResponseEntity.created(URI.create("/users/" + user.getUserId())).build();

    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> findById(@PathVariable("userId") UUID userId) {

        var user = userService.findById(userId);

        return user.isPresent() ?
                ResponseEntity.ok(user.get()) :
                ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable("userId") UUID userId) {

        var userDeleted = userService.deleteById(userId);

        return userDeleted ?
                ResponseEntity.noContent().build():
                ResponseEntity.notFound().build();

    }

}
