package com.lao.hymnbook.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class HymnBook {

    @Id
    private String id;
    private String title;
    private Language language;
    @DateTimeFormat
    private String printDate; 

}
