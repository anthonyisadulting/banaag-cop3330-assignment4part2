package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Anthony Banaag
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

//make sure to do @FXML to link textfields to controller class (fxid)
//used to be able to grab data between controller and gui

public class ToDoListController {
    @FXML
    public void addlistbutton(ActionEvent actionEvent) {
        //get string values of all of the text fields
        //add all entered values to an array
        //clear the display
        //store
    }
    @FXML
    public void adduniqueitem(ActionEvent actionEvent) {
        //get string value of item entered
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
    public void entertitle(ActionEvent actionEvent) {
        //get string value of item entered
        //assign to a string variable
        //clear when 'addlistbutton' is clicked
    }
    @FXML
    public void adduniqueitembutton(ActionEvent actionEvent) {
        //make sure that a list from 'ListofLists' is clicked
        //get string value (somehow connect this to either the gui on the top or create a new gui for this)
        //add to the array

    }
    @FXML
    public void removelist(ActionEvent actionEvent) {
        //make sure that a list from 'ListofLists' is clicked
        //delete the list from the array
    }
    @FXML
    public void edittitle(ActionEvent actionEvent) {
        //make sure that a list from 'ListofLists' listview is clicked
        //get string value (somehow connect this to either the gui on the top or create a new gui for this)
        //rename the array
    }
    @FXML
    public void AddItemToExistingList(ActionEvent actionEvent) {
        //make sure that a list from 'ListofLists' listview is clicked
        //get string value (somehow connect this to either the gui on the top or create a new gui for this)
        //add value to the list array
    }
    @FXML
    public void RemoveItemFromExistingList(ActionEvent actionEvent) {
        //make sure that a list from 'ListofLists' listview is clicked
        //get user to click on the string value (somehow connect this to either the gui on the top or create a new gui for this)
        //remove the  value from the list array
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
    public void SaveSingleListtoFile(ActionEvent actionEvent) {
        //get array the user clicks on
        //file io reader and writer
        // save it to txt file

        //OR

        //gson
    }
    @FXML
    public void SaveAllListItemsToFile(ActionEvent actionEvent) {
        //get all arrays in the system
        //file io reader and writer
        //save it to txt file

        //OR

        //gson

    }
    @FXML
    public void LoadSingleListItemsToApp(ActionEvent actionEvent) {

        //file reader
        //code format of accepting only one list
        //ask user what file they want to load (research directory javafx management)
        //convert txt to array
        //display array

        //or gson
    }
    @FXML
    public void LoadAllListItemsToApp(ActionEvent actionEvent) {
        //file reader
        //code format of accepting multiple lists
        //ask user what file they want to load (research directory javafx management
        //convert txt to array
        //display array

        //or gson

    }
}
