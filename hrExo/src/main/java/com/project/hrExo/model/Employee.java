package com.project.hrExo.model;

import jakarta.persistence.*;
import lombok.Data;

/*
* @Data => annotation Lombok => Les getters et les setters sont gérés automatiquement
* @Entity => Indique que la classe correspond à une table de la BDD
* @Table(name = "") => Indique quelle table est liée à la classe
* */
@Data
@Entity
@Table(name = "employees")
public class Employee {
/*
 * @Id => clé primaire de la table. Importer celui Jakarta.persistence !
 * @GeneratedValue(strategy = GenerationType.IDENTITY) => autoincrémenté
 * @Column => permt de faire le lien entre le nom et le champ de la table (sauf pour mail et password car ils sont uniques)
 */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String mail;

    private String password;
}
