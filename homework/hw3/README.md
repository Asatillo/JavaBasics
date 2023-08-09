// Create JAR file containing hw3/MainVector.class hw3/utils/DoubleVector.class
jar -cf mass-deploy.jar MainVector.class utils/DoubleVector.class

// Run JAR file with launching main class
java -classpath mass-deploy.jar hw3/MainVector

// Extract JAR file (just to check its content)
jar -xf mass-deploy.jar
~~~
