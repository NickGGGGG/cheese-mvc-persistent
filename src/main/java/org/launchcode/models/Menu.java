package org.launchcode.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.List;
import org.launchcode.models.Cheese;


@Entity
public class Menu {

    @NotNull
    private String name;

    @Id
    @GeneratedValue
    private Integer Id;

    @ManyToMany
    private List<Cheese> cheeses;

    public void addItem(Cheese item) {
        cheeses.add(item);
    }

    public Menu() { }

    public Menu(String name) {
        this.name = name;
    }


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getId() { return Id; }

    public List<Cheese> getCheeses() { return cheeses; }

}