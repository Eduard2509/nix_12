### generate a maven project ###
`$ mvn archetype:generate -DgroupId=ua.com.alevel -DartifactId=Basic -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`
### create jar file ###
`$ mvn clean install`
### Run program ###
`$ java -jar target/basic-1.0-SNAPSHOT.jar `
### Run program ###
`$ mvn exec:java -D exec.mainClass=ua.com.alevel.Main `