package com.kol.blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class BlogPost {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String title;

    private String message;

    @JsonIgnore
    @ManyToOne
    private BlogUser user;
}
