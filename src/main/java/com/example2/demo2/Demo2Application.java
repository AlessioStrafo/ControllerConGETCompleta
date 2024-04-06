//Scrivi una applicazione web Spring Boot che alla endpoint GET
// v2/ciao/Lombardia?nome=Giuseppe risponde con un oggetto JSON formato cosi:
//{
//    "nome": "Giuseppe",
//    "provincia": "Lombardia",
//    "saluto": "Ciao Giuseppe, com'è il tempo in Lombardia?"
//}
package com.example2.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

}
