package com.ditchedagain.model;

import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jose on 6/6/15.
 */
@Entity
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String position;

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return com.google.common.base.Objects.equal(id, player.id);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("position", position)
                .toString();
    }
}
