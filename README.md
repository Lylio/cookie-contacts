![](https://github.com/Lylio/image-repo/blob/master/logos/spring-boot.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/react.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/mongodb.png?raw=true)

# Cookie Contacts (Spring Boot)

### Description
A contact management app. Live demo at:  
https://cookie-contacts.herokuapp.com/

### Tech Stack
- Spring Boot (JDK 11)
- React
- MongoDB
- Maven

### Setup & Launch

#### Database
Create a MongoDB database called 'cookie-contacts' using the Mongo shell:
`use cookie-contacts`

The database won't be visible with the command `show dbs` until some data has been inserted
into the Contact table:

POST http://localhost:8080/api/contacts
```
{
    "firstName": "Artie",
    "lastName": "Foodle",
    "emailAddress": "a.foodle@horizon.com",
    "phoneNumber": "+44 0768763387676",
    "jobTitle": "Tech Lead",
    "company": "Horizon",
    "profileLink": "https://i.pinimg.com/474x/a1/9d/fd/a19dfd0cd5b84390c983b372c91b7f22.jpg"
}
```

GET http://localhost:8080/api/contacts
```
 {
        "company": "Horizon",
        "emailAddress": "a.foodle@horizon.com",
        "firstName": "Artie",
        "id": "61958dac403658344c7c2847",
        "jobTitle": "Tech Lead",
        "lastName": "Foodle",
        "phoneNumber": "+44 0768763387676"
 }
```

#### Spring Boot Profiles
*DEV*  
The dev profile connects to a local instance of MongoDB: `mvn spring-boot:run -Dspring-boot.run.profiles=dev`

*PROD*
1. Update the prod database password in application.yml
2. The prod profile connects to a cloud (Atlas) instance of MongoDB: `mvn spring-boot:run -Dspring-boot.run.profiles=prod`

*JAR*
1. `mvn clean package`
2. `java -jar -Dspring.profiles.active=prod target/cookie-contacts-0.0.1-SNAPSHOT.jar`

#### Spring Boot Backend Launch
1. Navigate to the root backend directory (where pom.xml is)
2. Run `mvn spring-boot:run`

#### React Frontend Launch
1. In a second terminal tab, navigate to src/main/app
2. Run `npm install`
3. Run `npm start`
4. Navigate to http://localhost:3000

#### Docker Launch
Coming soon.




