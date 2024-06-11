package com.hymnbook.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class HymnBook {

    @Id
    private String id;
    private String title;
    private Language language;
    private Date printDate;
    private String file;

}
