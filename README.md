![](https://github.com/Lylio/image-repo/blob/master/logos/spring-boot.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/react.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/mongodb.png?raw=true)

# Cookie Contacts (Spring Boot)

### Description
A contact management app for users to store name, address, email and phone number data.

This app is near exact replica of an app I [built first](https://github.com/Lylio/cookie-contacts-quarkus) using Quarkus as the backend framework instead of Spring Boot (but this app still uses
the same React frontend components). Two versions exist because of the difficulty I had
trying to embed React into Quarkus so that they can be launched, deployed, frozen, etc. as a single application. 

With Spring Boot and React, it's fairly easy to have Spring Boot serve the React files as the app can be launched from a single terminal window. Also, a cloud provider
like Heroku is much happier dealing with an app that already has the frontend and backend already integrated, rather than deploying them separately and
then configuring each end to 'talk' to the other.

After a lot of... "oh gawd.... oh not THIS... oh, CHRIST ON A BIKE" etc, I just decided to rebuild the backend in Spring Boot as I knew it would be straightforward to integrate React
so that Spring Boot would serve the React components like magic and all ends of the application would happily chatter away to
each other.

Don't get me wrong, Quarkus is great, it's a treat in many ways for development, but I need to do little more study before it "Quarky" ways become more familiar.

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

#### Spring Boot Backend Launch
1. Navigate to the root backend directory (where pom.xml is)
2. Run `mvn spring-boot:run`

#### React Frontend Launch
1. In a second terminal tab, navigate to the root frontend directory (where package.json is)
2. Run `npm install`
3. Run `npm start`
4. Navigate to http://localhost:3000




