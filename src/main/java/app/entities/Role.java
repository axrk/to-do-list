package app.entities;

import javax.persistence.*;


@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public Role() {

    }


    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
