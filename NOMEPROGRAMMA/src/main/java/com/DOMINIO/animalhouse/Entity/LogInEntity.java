/*
 * 
 * Bean for entity
 * 
 */
package com.ivotek.animalhouse.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;



/**
 *
 * @author Daniele Loddo alias ivotek www.ivotek.it ivotek@gmail.com
 *
 */
@Entity
@Table(indexes = { @Index(name = "id", columnList = "session") })
public class LogInEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String user;
    @Column
    private String password;
    @Column
    private Long session;

    public LogInEntity() {
    }

    public LogInEntity(Long id, String user, String password, Long session) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.session = session;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getSession() {
        return session;
    }

    public void setSession(Long session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "LogInEntity{" + "id=" + id + ", user=" + user + ", password=" + password + ", session=" + session + '}';
    }

}
