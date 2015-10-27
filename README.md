## Abstract

This is a base mvn project for java bytecode coding dojo. It includes dependencies for unit tests and benchmarks – TestNG, AssertJ, JMH and mvn configuration to run these tests.

## Usage

To run unit tests you can simply use
```
 mvn clean test
```

To run JMH benchmarks easily, project is packed to a shaded jar. There is a shortcut to run JMH benchmarks using exec-maven-plugin with default parameters
```
mvn clean install exec:exec -DskipTests
```

To enable assembly output you will have to pass a couple of flags to JVM described here - http://psy-lob-saw.blogspot.com/2015/07/jmh-perfasm.html.
Also you will have to compile hsdis library. Instructions for windows may be found here - http://dropzone.nfshost.com/hsdis.htm. For linux it can bin found in binutils package.


As for jcstress, you will have to build it youselves – http://openjdk.java.net/projects/code-tools/jcstress/
