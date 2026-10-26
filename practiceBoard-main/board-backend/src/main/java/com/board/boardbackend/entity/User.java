package com.board.boardbackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String nickname;

    @Column(unique = true, nullable = false, length = 20)
    private String nicknameKey;

    @Column(nullable = false, length = 100)
    private String passwordHash;

    protected User() {}

    public User(String nickname, String nicknameKey, String passwordHash) {
        this.nickname = nickname;
        this.nicknameKey = nicknameKey;
        this.passwordHash = passwordHash;
    }

    public Long getId() { return id; }
    public String getNickname() { return nickname; }
    public String getNicknameKey() { return nicknameKey; }
    public String getPasswordHash() { return passwordHash; }
}
