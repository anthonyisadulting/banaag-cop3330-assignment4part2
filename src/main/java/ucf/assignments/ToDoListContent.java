package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Anthony Banaag
 */

import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class ToDoListContent {

    private SimpleStringProperty itemname;
    private LocalDate userdate;
    private SimpleStringProperty itemdescription;

    public ToDoListContent(String itemname, LocalDate userdate, String itemdescription) {
        this.itemname = new SimpleStringProperty(itemname);
        this.userdate = userdate;
        this.itemdescription = new SimpleStringProperty(itemdescription);
    }

    public String getItemname() {
        return itemname.get();
    }

    public LocalDate getUserdate() {
        return userdate;
    }

    public String getItemdescription() {
        return itemdescription.get();
    }

    public void setItemname(String itemname) {
        this.itemname = new SimpleStringProperty(itemname);
    }

    public void setUserdate(LocalDate userdate) {
        this.userdate = userdate;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = new SimpleStringProperty(itemdescription);
    }
}
