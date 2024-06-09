package com.hymnbook.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class HymnBook {

    @Id
    private String id;
    private String title;
    private Language language;
    private Date printDate;
    private String file;

}
