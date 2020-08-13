package me.isortegah.labs.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
public class MainAspect {

    private final Logger logger = Logger.getLogger(this.getClass().getCanonicalName());

    @Pointcut("execution(* me.isortegah.labs.App.main(..))")
    public void methodMain() {}

    @Before("methodMain()")
    public void beforeMethodMain(JoinPoint joinPoint) {
        logger.log(Level.INFO,"before method main: " + joinPoint.toLongString());
    }

    @After("methodMain()")
    public void afterMethodMain(JoinPoint joinPoint) {
        logger.log(Level.INFO,"after method main: " + joinPoint.toLongString());
    }
}
