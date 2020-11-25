# Java-Mooc-2-13

Part 13 concerns JavaFX, This requires a the following changes in order to work

The below should be pasted into the Java POM file beneath the proper headings, change the <mainClass> to the current project pathway
  
  <dependency>

<groupId>org.openjfx</groupId>

<artifactId>javafx-controls</artifactId>

<version>14</version>

</dependency>





<plugin>

<groupId>org.openjfx</groupId>

<artifactId>javafx-maven-plugin</artifactId>

<version>0.0.4</version>

<configuration>

<release>${maven.compiler.release}</release>

<launcher>launcher</launcher>

<mainClass>textstatistics.TextStatisticsApplication</mainClass>

</configuration>

</plugin>  

Also Streams are not supported in JavaFX Source/Binary Format below 1.8
