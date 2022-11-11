package com.example.springbootdemo.model;
import javax.persistence.*; //import java persistence packages


//Entity Data model with four fields (id, title, description, published)
// In model package, we define Tutorial class.


@Entity // entity annotation
@Table(name = "tutorials") //table annotation, set name = "tutorials" to created table


public class Tutorial {
    //instantiate fields
        //id, String title, String description, boolean published

    @Id //id annotation
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private long id;

    @Column(name  = "title") // column annotation name title in annotation
    private String title;   //create title field in java

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    //instantiate clas
    public Tutorial(){
    }
    public Tutorial(String title, String description, boolean published){
        this.title = title;
        this.description = description;
        this.published = published;
    }

    //getter for id field

    public long getId(){
        return id;
    }

    //getters and setters for other instantiated fields

        //title field
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

        //description field
    public String getDescription(){
      return description;
    }
    public void setDescription (String description){
        this.description = description;
    }
        //published field
    public Boolean  isPublished(){
        return published;
    }

    public void setPublished(boolean isPublished){
        this.published = isPublished;
    }

@Override
    public String toString(){
        return "Tutorial [id" + id + ",title=" + title + ", published = " + published +"]";
    }


}
