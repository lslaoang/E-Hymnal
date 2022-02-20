package com.ehymnal.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Hymn {

    @Id
    private String id;
    private String number;
    private String title;
    private Date printDate;
    private String language;
    private byte[] pdfFile;

}
