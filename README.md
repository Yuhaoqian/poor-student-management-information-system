# poor-student-management-information-system-v3.0-release

The webapp is developed by `SpringBoot`, `MyBatis` and `Thymeleaf` framework and deployed on `Tomcat`.

In order to implement the identification of poor students, we built a poor student classifier by `PyTorch` and developped an api service by `Django`. This web service is deployed on another `nginx` web server.

- Frontend: `Bootstrap, Jquery, LayUI, AmazeUI`
- Backend: 
	- Web app: `SpringBoot, MyBatis, Thymeleaf`
	- API service: `Django, Pytorch`
- Database: `MySQL`
- Server: `Apache Tomcat`, `Nginx`

**Filters** and **Session** have been used to implement **authentication feature** for the application besides the primary functions login and logout.

(OSS) Object Storage Service has been used to make data storage more stable, secure and efficient.

### Configuration

1. Install **apache-tomcat-9**, **jdk-8**, **mysql8.0+** 
2. Configure environment variables
3. Import [psmis.sql](psmis.sql) into your server's mysql database
4. Generate and put file **poor-student-mis.war** in **apache-tomcat-9.0.35/webapps/**
5. Start the Tomcat Server ( run **startup.sh** )