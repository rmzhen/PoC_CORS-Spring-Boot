package io.poc.corspoc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cors")
public class CorsController {

    //Uncomment the following line for CORS in controller.
    //@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/method1")
    public ResponseEntity<String> testMethod1() {
        String message = "Successfully called method1.";
        return new ResponseEntity<String>(message, HttpStatus.OK);
    }

    //Uncomment the following line for CORS in controller.
    //@CrossOrigin(origins = "http://localhost:4201")
    @GetMapping("/method2")
    public ResponseEntity<String> testMethod2() {
        String message = "Successfully called method2.";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
