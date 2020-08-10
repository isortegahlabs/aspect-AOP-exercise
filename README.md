Aspect-AOP-exercise  
====

La finalidad del proyecto es presentar un ejemplo basico de la implementación
de [AspectJ](https://eclipse.org/aspectj/) and [Maven](http://maven.apache.org).

## Compile weaving

### Ejecución ###
```bash
mvn compile exec:java
```

### Creación de un jar ejecutable con sus dependencias ###
```
mvn package assembly:single
```