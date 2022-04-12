@echo compile program
call mvn clean install

@echo run program
call mvn exec:java -D exec.mainClass=ua.com.alevel.Main