package com.sprint.mission.discodeit.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "channels")
@EntityListeners(AuditingEntityListener.class)
@Getter
public class Channel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(length = 100)
    private String name;

    @NotNull
    @Column(length = 10)
    private ChannelType type;

    @Column(length = 500)
    private String description;

    public enum ChannelType {
        PUBLIC, PRIVATE
    }

    public Channel(String name, ChannelType type, String description) {
        this.id = UUID.randomUUID();
        this.createdAt = Instant.now();
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public void update(String name, ChannelType type, String description) {
        if (name != null) {
            this.name = name;
        }
        if (type != null) {
            this.type = type;
        }
        if (description != null) {
            this.description = description;
        }

        this.updatedAt = Instant.now();
    }

    @Override
    public String toString() {
        return "Channel{" + id
                + ", " + name
                + ", " + type
                + ", " + description
                + "}";
    }
}
