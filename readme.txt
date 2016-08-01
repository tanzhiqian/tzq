java 创建
mvn archetype:generate -DgroupId=com.hand  -DartifactId=Exam1 -DarchetypeArtifactId=maven-archetype-quickstart  -DinteractiveMode=false -DarchetypeCatalog=local
创建项目

mvn clean compile进行编译


mvn exec:java -Dexec.mainClass="com.hand.App" -Dexec.args="arg0 arg1 arg2"
执行程序出结果



mvn clean compile exec:java -Dexec.mainClass="com.hand.App" -Dexec.args="arg0 arg1 arg2"
刷新编译出结果



Web 创建
maven创建Web项目
mvn archetype:generate -DgroupId=com.hand -DartifactId=webtest -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false -DarchetypeCatalog=local

插件的替换
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.hand</groupId>
  <artifactId>webtest</artifactId>
  <packaging>war</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>webtest Maven Webapp</name>
  <url>http://maven.apache.org</url>
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  <build>
    <finalName>webtest</finalName>
   

 <plugins>
      <plugin>
                <groupId>org.eclipse.jetty</groupId>
                <artifactId>jetty-maven-plugin</artifactId>
                <version>9.2.11.v20150529</version>
                <configuration>
                    <webAppConfig>
                        <allowDuplicateFragmentNames>true</allowDuplicateFragmentNames>
                    </webAppConfig>
                </configuration>
            </plugin>
    </plugins>
  

</build>
</project>

调整到Web工程路径下

mvn compile进行编译

运行插件
mvn jetty:run

访问localhost：8080

导入eclipse   mvn eclipse:eclipse

ctrl+c弹出是否关闭的窗口