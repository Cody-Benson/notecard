package com.example.notecard.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public User(){}

    public User(UserBuilder builder){
        this.id = builder.id;
    }

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public static class UserBuilder{
        private Long id;

        public UserBuilder() {
            // Default values
        }

        public UserBuilder id(Long id){
            this.id = id;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }
}
