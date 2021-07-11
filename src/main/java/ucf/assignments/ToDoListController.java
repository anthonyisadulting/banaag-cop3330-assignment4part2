package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Anthony Banaag
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

//make sure to do @FXML to link textfields to controller class (fxid)
//used to be able to grab data between controller and gui

public class ToDoListController {

    @FXML
    private TextField enteritemname;

    @FXML
    private DatePicker enterdate;

    @FXML
    private ListView<String> listofitemnames;

    @FXML
    private ListView<?> listofitemdescriptions;

    @FXML
    private TextField enteritemdescription;

    @FXML
    public void additemanddescription(ActionEvent actionEvent) {
        //get string value of item entered
        listofitemnames.getItems().add(enteritemname.getText());
        //add value into an array
        //clear display
    }


    @FXML
    public void enterdate(ActionEvent actionEvent) {
        //make sure to get string value (not int value)
        //assign to a string variable
        //clear when 'addlistbutton' is clicked
    }


    @FXML
    public void EditDescription(ActionEvent actionEvent) {
        //make sure that a list from 'ListofLists' listview is clicked
        //get user to click on the string value (somehow connect this to either the gui on the top or create a new gui for this)
        //edit description from the list array
    }
    @FXML
    public void EditDueDate(ActionEvent actionEvent) {
        //make sure that a list from 'ListofLists' listview is clicked
        //get user to click on the string value (somehow connect this to either the gui on the top or create a new gui for this)
        //edit due date from the list array
    }
    @FXML
    public void MarkItemAsComplete(ActionEvent actionEvent) {
        //make sure that a list from 'ListofLists' listview is clicked
        // show list of items in description or make a new gui
        //allow user to mark an item with a checkbox gui
    }
    @FXML
    public void DisplayAllItems(ActionEvent actionEvent) {
        //get all arrays
        //convert it into one single array or print all arrays
        //show user
    }
    @FXML
    public void DisplayCompletedItems(ActionEvent actionEvent) {
        //if item has 'markitemascomplete' function used then add it into an array
        //display the array
    }
    @FXML
    public void DisplayIncompletedItems(ActionEvent actionEvent) {
        //if item does not have 'markitemascomplete' function used, add it into an array
        //display the array
    }

    @FXML
    public void RemoveItem(ActionEvent actionEvent) {

    }

    @FXML
    public void savelisttofile(ActionEvent actionEvent) {

    }

    @FXML
    public void loadlisttoapp(ActionEvent actionEvent) {

    }

    @FXML
    public void clearlistofallitems(ActionEvent actionEvent) {

    }

    @FXML
    public void markitemasincomplete(ActionEvent actionEvent) {

    }

    @FXML
    public void needhelpbutton(ActionEvent actionEvent) {

    }




    public void enteruniqueitemdescription(ActionEvent actionEvent) {
    }
}
