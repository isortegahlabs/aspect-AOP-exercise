package me.isortegah.labs;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Foo {

    private final Logger logger = Logger.getLogger(this.getClass().getCanonicalName());

    public Foo(){

    }

    public void foo(){
        logger.log(Level.INFO, "Process method foo");
    }

    public String bar() {
        logger.log(Level.INFO, "Process method bar");
        return "return bar";
    }

    public void dao(){
        logger.log(Level.INFO, "Process method dao");
    }
}
