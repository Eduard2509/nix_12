@echo compile program
call mvn clean package

@echo run program
call java -jar target\hw_2_base_types-1.0-SNAPSHOT.jar