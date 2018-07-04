#Hotdeploy with Springloaded

1. pom setting:
<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<dependencies>
					<dependency>
						<groupId>org.springframework</groupId>
						<artifactId>springloaded</artifactId>
						<version>1.2.8.RELEASE</version>
					</dependency>
				</dependencies>
			</plugin>

		</plugins>
	</build>
2. VM setting:
vm arguments:
-javaagent:C:\Software\mvnRepository\org\springframework\springloaded\1.2.8.RELEASE\springloaded-1.2.8.RELEASE.jar -noverify