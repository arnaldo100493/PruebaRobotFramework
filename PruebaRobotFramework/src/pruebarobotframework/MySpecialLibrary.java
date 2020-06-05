/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebarobotframework;

import org.robotframework.javalib.library.ClassPathLibrary;

/**
 *
 * @author abarrime
 */
public class MySpecialLibrary extends ClassPathLibrary {

    public MySpecialLibrary() {
        super("com/acme/mycomponent/keyword/**/*.class");
    }

}
