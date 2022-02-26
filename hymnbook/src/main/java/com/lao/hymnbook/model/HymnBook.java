package com.lao.hymnbook.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
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

}
