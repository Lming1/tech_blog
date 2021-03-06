package com.raphael.blog.common.Domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "contents")
    private String contents;


    @CreationTimestamp
    @Column(name = "created_time_at", updatable = false)
    private LocalDateTime createdTimeAt;

    @UpdateTimestamp
    private LocalDateTime updatedTimeAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id", updatable = false)
    @JsonBackReference
    private Board board;


    public Comment() {

    }

    public Comment(String contents) {
        this.contents = contents;
    }

    public Comment(Board board) {
        this.board = board;
    }

    public Comment(String contents, Board board) {
        this.contents = contents;
        this.board = board;
    }
}
