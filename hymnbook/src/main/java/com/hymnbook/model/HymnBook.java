package com.hymnbook.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Document(collection = "hymnBook")
public class HymnBook {

    @Id
    private String id;
    private String title;
    private Language language;
    private Date printDate;
    private String file;

}
