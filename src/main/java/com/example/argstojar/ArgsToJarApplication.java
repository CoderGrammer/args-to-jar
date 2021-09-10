package com.example.argstojar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.argstojar.Utils.filter;
import static com.example.argstojar.Utils.print;
import static com.example.argstojar.Utils.printH;

@SpringBootApplication
public class ArgsToJarApplication {

    public static void main(String[] args) {

        printArguments(args);
        printSystemProperties();
        printEnvironmentVariables();

        SpringApplication.run(ArgsToJarApplication.class, args);
    }

    /*
     - Environment Variables
    */
    static void printEnvironmentVariables() {
        printH("Environment Variables");
        System.getenv().forEach((k, v) -> print(k + " " + filter(v)));
    }

    /*
     - System Properties
    */
    static void printSystemProperties() {
        printH("System Properties");
        var properties = System.getProperties();
        properties.forEach((k, v) -> print(k + " " + filter(v)));
    }

    /*
     - Arguments
    */
    static void printArguments(String[] args) {
        printH("Arguments");
        for (String arg : args) {
            print(filter(arg));
        }
    }

}
