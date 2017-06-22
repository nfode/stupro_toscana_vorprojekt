package de.toscana.transformator.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertTrue;

/**
 * This class is used to test the functionality of the Model-classes while implementing
 */
@RunWith(JUnit4.class)
public class ModelTest {

    private String contents = "";

    @Before
    public void setUp() throws Exception {
        InputStream in = getClass().getClassLoader().getResourceAsStream("example.xml");
        Scanner scn = new Scanner( in);
        while (scn.hasNextLine()) {
            contents += scn.nextLine()+ "\n";
        }
        in.close();
        scn.close();
    }

    @Test
    public void parsingTest() throws Exception {

    }
}
