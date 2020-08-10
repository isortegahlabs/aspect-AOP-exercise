Aspect-AOP-exercise  
====

La finalidad del proyecto es presentar un ejemplo basico de la implementación
de [AspectJ](https://eclipse.org/aspectj/) and [Maven](http://maven.apache.org).

## Load Time Weaving

### Ejecución ###
```bash
mvn compile exec:exec
```

### Creación de un jar ejecutable con sus dependencias ###
```
mvn package assembly:single
```