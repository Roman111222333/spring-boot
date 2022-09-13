//package com.testsystem.model;
//
//import com.testsystem.enums.RoleName;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "roles")
//public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//    @Enumerated(EnumType.STRING)
//    private RoleName name;
//
//    @ManyToOne(optional=false)
//    @JoinColumn(name="id",referencedColumnName="id", insertable=false, updatable=false)
//    private User user;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public RoleName getName() {
//        return name;
//    }
//
//    public void setName(RoleName name) {
//        this.name = name;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//}
//