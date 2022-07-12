# Cookie Contacts

### Description
A contact management app. Like Google Contacts, but about 0.000001% as popular. 

|              |                                                                                                                                                                                                                                                                                                                                                               |
|--------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Tech Stack   | ![Spring Boot](https://img.shields.io/badge/react-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB) ![React](https://img.shields.io/badge/spring%20boot-white.svg?style=for-the-badge&logo=springboot&logoColor=6DB33F) ![PostgreSQL](https://img.shields.io/badge/POSTGRESQL-4169E1.svg?style=for-the-badge&logo=PostgreSQL&logoColor=white) |
| Compiler     | ![Java](https://img.shields.io/badge/JAVA%20-JDK%2011-green?style=for-the-badge)                                                                                                                                                                                                                                                                              |
| Demo Link    | [cookie-contacts.lyle.app](https://cookie-contacts.lyle.app)                                                                                                                                                                                                                                                                                                  |
| Top Language | ![Github Language](https://img.shields.io/github/languages/top/lylio/cookie-contacts?style=for-the-badge)                                                                                                                                                                                                                                                     |
| Repo Size    | ![Repo Size](https://img.shields.io/github/repo-size/lylio/cookie-contacts?style=for-the-badge)                                                                                                                                                                                                                                                               |
| Last Commit  | ![Github Commit Activity](https://img.shields.io/github/last-commit/lylio/cookie-contacts/main?style=for-the-badge)                                                                                                                                                                                                                                           |


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


<br >

#### Acknowledgements
The cool repo badges, logos and code stats on this README are courtesy of [Simple Icons](https://simpleicons.org) and [Shields.io](https://shields.io).




