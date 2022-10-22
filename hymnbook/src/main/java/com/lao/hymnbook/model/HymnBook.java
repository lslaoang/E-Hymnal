package com.lao.hymnbook.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
