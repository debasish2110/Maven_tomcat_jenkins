# Apache Maven and Tomcat

## Apache Maven
Maven is a **build automation tool** primarily used for **Java projects**. It helps in managing dependencies, building, and deploying applications.

### Key Features of Maven
- **Project Object Model (POM.xml)** – Central configuration file that contains dependencies, plugins, and project details.
- **Dependency Management** – Automatically downloads and manages project dependencies.
- **Build Lifecycle** – Standardized phases (e.g., `compile`, `test`, `package`, `install`, `deploy`).
- **Plugins** – Enhances build capabilities (e.g., `maven-compiler-plugin`, `maven-surefire-plugin`).
- **Convention over Configuration** – Standard directory structure (`src/main/java`, `src/test/java`).
- **Repository Management** – Uses local (`~/.m2/repository`), central, and remote repositories.

### Common Maven Commands
```sh
mvn clean      # Deletes target directory and cleans the project
mvn compile    # Compiles the project source code
mvn test       # Runs unit tests
mvn package    # Generates a JAR/WAR file
mvn install    # Installs the package into the local repository
mvn deploy     # Deploys the package to a remote repository
```

---

## Apache Tomcat
Tomcat is an **open-source web server and servlet container** that runs Java-based web applications. It implements **Java Servlet, JSP (JavaServer Pages), and WebSocket technologies**.

### Key Features of Tomcat
- **Supports Java Servlets & JSP** – Allows running dynamic Java-based web applications.
- **Embedded Mode** – Can be embedded in Java applications.
- **Lightweight & Fast** – Designed for high performance with minimal overhead.
- **Security Features** – Provides user authentication and access control.
- **Clustering & Load Balancing** – Supports distributed deployment.

### Tomcat Directory Structure
```
/bin      - Scripts to start/stop Tomcat
/conf     - Configuration files (server.xml, web.xml)
/logs     - Logs directory
/webapps  - Deployable WAR files go here
/lib      - Libraries and JAR files used by Tomcat
/work     - Temporary files for compiled JSP pages
```

### Starting and Stopping Tomcat
#### Linux/macOS:
```sh
./bin/startup.sh    # Start Tomcat
./bin/shutdown.sh   # Stop Tomcat
```
#### Windows:
```sh
bin\startup.bat     # Start Tomcat
bin\shutdown.bat    # Stop Tomcat
```

### Deploying Applications on Tomcat
- Place the `.war` file in the `webapps/` directory.
- Use Tomcat Manager (`http://localhost:8080/manager/html`) for deployment.
- **Manually deploy using `server.xml`** by configuring a `<Context>` entry.

---
