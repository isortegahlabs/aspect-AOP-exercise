package me.isortegah.labs;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Foo {

    private final Logger logger = Logger.getLogger(this.getClass().getCanonicalName());

    public Foo(){

    }

    public void foo(){
        logger.log(Level.INFO, "Proceso Foo");
    }
}
