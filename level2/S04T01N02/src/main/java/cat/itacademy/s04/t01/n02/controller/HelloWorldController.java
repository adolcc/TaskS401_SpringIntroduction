package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "nombre", defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Gradle";
    }

    @GetMapping("/HelloWorld2")
    public String saluda2() {
        return "Hola, UNKNOWN. Estás ejecutando un proyecto Gradle";
    }

    @GetMapping("/HelloWorld2/{nombre}")
    public String saluda2ConNombre(@PathVariable String nombre) {
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Gradle";
    }
}


