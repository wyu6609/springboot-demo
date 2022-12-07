A basic spring crud backend server with one model.

Instructions:
1. run "git clone git@github.com:wyu6609/springboot-demo.git" at your desired directory.
2. Run "SpringbootDemoApplication.java" (run "mvn spring-boot:run" at code base folder).
3. Open Postman

4. Test Routes with root directory "http://localhost:8080"


                    Tutorials object sample
                        { "id" = 1,
                          "title" = "object title",
                          "description" = "object description",
                          "published" = true
                        }

-Testing locally- use "http://localhost:8080" as root directory for routes-

ROUTES
Method

POST	/api/tutorials	create new Tutorial
GET	/api/tutorials	retrieve all Tutorials
GET	/api/tutorials/:id	retrieve a Tutorial by :id
PUT	/api/tutorials/:id	update a Tutorial by :id
DELETE	/api/tutorials/:id	delete a Tutorial by :id
DELETE	/api/tutorials	delete all Tutorials
GET	/api/tutorials/published	find all published Tutorials
GET	/api/tutorials?title=[keyword]	find all Tutorials which title contains keyword




Structure:

    A. Tutorial data model classe -> correspondes to entity and table tutorials.
    B. Tutorial Respository -> interface extends JPA repository for crud methods and custom finder methods.- autowired to Tutorial Controller.
    C. Tutorial Controller -> RestController, includes request mapping methods for RESTful requests such as:
            getAllTutorials, createTutorial, updateTutorial,deleteTutorial,fillByPublished

    D.Configuration for Spring Datasource, JPA & Hibernate in application.properties
    E. pom.xml -> contains dependencies for Spring Boot and MySQL/PostgreSQL/




1. setup POM.xml
2. configure
     a. Spring Datasource
     b. JPA
     c. Hibernate

3. Define DATA model
4. create repository interface
5. create spring rest APIs controller
6. Run & Test

     ex-
    tutorialObj = {
        id: 1,
        title: "tut1",
        description: "tut info",
        published_status:
    }







