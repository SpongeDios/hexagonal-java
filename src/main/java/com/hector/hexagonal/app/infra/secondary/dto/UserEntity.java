package com.hector.hexagonal.app.infra.secondary.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private Date lastUpdate;
    @Column
    private Date createdDate;

    public UserEntity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserEntity() {

    }

    @PrePersist
    public void setCreatedDate(){
        this.createdDate = new Date();
    }

    @PreUpdate
    public void setLastUpdate(){
        this.lastUpdate = new Date();
    }
}
