@echo compile program
rem call javac -sourcepath ./src -d build/classes -cp ./libs/commons-lang3-3.11.jar -cp ./libs/commons-math3-3.6.1.jar src/ua/com/alevel/Solut.java
call javac -sourcepath .\src\ -d .\build\classes\ -cp .\libs\* .\src\ua\com\alevel\Solut.java
call java -cp .\build\classes\;.\libs\commons-lang3-3.11.jar;.\libs\commons-math3-3.6.1.jar ua.com.alevel.Solut


rem @echo run program
rem call java -cp build/classes/;./libs/commons-lang3-3.11.jar;./libs/commons-math3-3.6.1.jar ua.com.alevel.Solut

rem @echo create jar
rem call jar cfm build/jar/Solut.jar MANIFEST.MF -C build/classes/ .
rem call copy .\libs\commons-lang3-3.11.jar .\build\jar
rem call copy .\libs\commons-math3-3.6.1.jar .\build\jar

rem @echo run jar
rem java -jar .\build\jar\Solut.jar
