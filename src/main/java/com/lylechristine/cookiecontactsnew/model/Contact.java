package com.lylechristine.cookiecontactsnew.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Contact")
public class Contact {


    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String jobTitle;
    private String company;
    private String profileLink;

}
