# calculator-maven-modules

Goal: create simple project, use module.  

# how it works

Build uber jar (`./mvnw package`) and run it with cli (`java -jar ...`): 
```
./build_and_run_fat_jar.sh
```

Build modules (`./mvnw install`) and run it with maven-exec-plugin (`./mvnw exec:java`):  
```
./build_and_run_exec_java.sh
```

# todo

1. add tests to modules
2. add more options reading from input

