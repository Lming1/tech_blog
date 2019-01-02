package com.raphael.blog.techblog.Model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Data
@ToString
@Entity(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "tag")
    private String tag;
    @Column(name = "title")
    private String title;
    @Column(name = "contents")
    private String contents;


//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdTimeStamp;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date updatedTimeStamp;

}