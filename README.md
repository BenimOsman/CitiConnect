# CitiConnect
A dynamic platform providing real-time city information, services, and community engagement.

**Description:** 
CitiConnect is an online platform designed to showcase a city's features, such as historical, political, and business information, along with practical utilities like bus routes, emergency services, and tourist spots. It provides a user-friendly interface, allowing registered users to access city information and engage in communication with others. The system replaces manual processes, offering improved data management and accessibility.

**Vision and Scope:**
The project aims to serve users by providing detailed information about a city, including its political, historical, and conventional places, as well as business companies and job opportunities. The platform will automate the city’s operations, offering dynamic maps, secure user registration, and facilities for user interaction.

**Technologies Used:**
1. Development Tech: HTML, JavaScript, Java, and SQL
2. Databases: Oracle or Access
3. Server: Apache Tomcat
4. Architecture: Java-based for portability, security, and dynamic content generation

The project offers a centralized platform for accessing city information, featuring secure user authentication, dynamic maps, real-time updates, and seamless communication. It supports efficient data management, report generation, and future scalability, all with a user-friendly interface. The Java-based architecture ensures portability, security, and flexibility for ongoing enhancements.

****WebRoot Link:**** https://drive.google.com/drive/folders/1zjNejfQyaoq_r8TsUijwgH9c9TZQ4878?usp=sharing 


<br><br>
**HOW TO EXECUTE:**

Step 1: Creating New User Account in SQL
----------------------------------------
Command: create user <username> identified by <password>;
  Output: User created
  Note: <username> should be related to your project name. Refer to this username in the System.properties file.
Command: Grant dba to <username>;
  Output: Grant succeeded

Step 2: Importing the Dump File
--------------------------------
Go to: Start -> Run -> Type Imp -> OK
A database import command prompt will display. Enter your username/password, then provide the path to the dump file.

If the dump file is located in the C drive, enter the path as C:\dumpfilename.dmp.
  Press Enter. Answer the following prompts:
  (yes / no): Select n
  (y / n): Select y for the remaining prompts  
  After that, we are getting out tables and data including tables in our sql account

After this, your SQL account will have tables and data imported.

Step 3: Change the system.properties file in your Code
------------------------------------------------------
Path: main -> WebRoot -> WEB-INF -> Config -> System.properties
In the System.properties file, update the URL:
        dburl = jdbc:oracle:thin:@[yourSystemIPAddress]:1521:[databaseServiceName]

Note: Refer to tnsnames.ora in your Oracle folder for your system name and service name.	

Step 4: Deploying the Project
-----------------------------
Copy the WebRoot folder in your project and paste it in another drive and rename that as your poject name.
Copy this renamed folder and paste it into Tomcat5.0/Webapps/.

Step 5: Running the Tomcat Server
---------------------------------
Navigate to Tomcat -> bin -> startup and double-click on startup.
The server should now be running.

Step 6: Running the Application
-------------------------------
Open your browser and enter the following in the address bar:
http://localhost:8081/<projectname> (replace <projectname> with the name you used during deployment).

Note: 8081 refers to the Tomcat port number. If your Tomcat uses a different port, replace 8081 with your actual port number.
