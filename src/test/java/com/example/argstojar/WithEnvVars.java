package com.example.argstojar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import uk.org.webcompere.systemstubs.environment.EnvironmentVariables;
import uk.org.webcompere.systemstubs.jupiter.SystemStubsExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 - Requires:
 - testImplementation 'uk.org.webcompere:system-stubs-jupiter:1.1.0'
*/
@ExtendWith(SystemStubsExtension.class)
class WithEnvVars {

    @Test
    void A(EnvironmentVariables e) {

        // Set system properties
        System.setProperty("kee", "valuuu");

        // Set app args
        String [] a = {"a", "b"};
        ArgsToJarApplication.main(a);

    }

    @Test
    void t(EnvironmentVariables e) {
        var key = "my-prop";
        var val = "abc";
        e.set(key, val);
        assertEquals(val, System.getenv().get(key));
    }

}
