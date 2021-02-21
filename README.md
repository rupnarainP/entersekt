# Entersekt

Instructions are based on Intellij Ultimate 2020.3 <br/><br/>
Developed using:
<li>JDK 11</li>
<li>Spring Boot v2.4.2</li>
<li>Maven 3.6.3</li>
<li>Windows 10</li><br/>

<b>Build/Run Instructions (Spring boot):</b>
1. Import project as Maven project.
2. In IntelliJ Maven menu, under the lifecycle menu, double click "clean", then double click "install".
3. The "target" folder will generate the "entersekt-0.0.1-SNAPSHOT.jar".
4. Navigate to the "target" folder in your file explorer.
5. Open a powershell window in the directory (SHIFT + Right click).
6. Paste this command: "java -jar entersekt-0.0.1-SNAPSHOT.jar"
7. The jar file will run in the powershell window.

<b>Alternatively:</b>
1. Import project as Maven project.
2. Right click on "EntersektApplication.java" and select "Run EntersektApplication".
3. The application will start within IntelliJ.

<b>Build/Run Instructions (Docker):</b>
1. Navigate to the root folder in your file explorer where the Dockerfile is.
2. Open a powershell window in the directory (SHIFT + Right click).
3. Paste this command: "docker build -t entersekt/path ." and hit enter on your keyboard.
4. Paste this command: "docker run -p 8000:8080 entersekt/path" and hit enter on your keyboard.   
4. The application will run in the powershell window in a Docker container.
