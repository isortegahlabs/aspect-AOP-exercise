package me.isortegah.labs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App
{
    private final static Logger logger = Logger.getLogger(App.class.getCanonicalName());

    public App (){

    }

    public static void main( String... args)
    {
        logger.log(Level.INFO, "Inicia proceso");
        new Foo().foo();
        new Foo().bar();
        new Foo().dao();
    }
}
