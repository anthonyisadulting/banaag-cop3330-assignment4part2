package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Anthony Banaag
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

//make sure to do @FXML to link textfields to controller class (fxid)
//used to be able to grab data between controller and gui

public class ToDoListController implements Initializable {

    @FXML
    private TextField enteritemname;

    @FXML
    private DatePicker enterdate;

    @FXML
    private TextField enteritemdescription;

    @FXML
    private TableView<ToDoListContent> tablelist;

    @FXML
    private TableColumn<ToDoListContent, String> listofitemnames;

    @FXML
    private TableColumn<ToDoListContent, LocalDate> listofdates;

    @FXML
    private TableColumn<ToDoListContent, String> listofitemdescriptions;


    @FXML
    public void additemanddescription(ActionEvent actionEvent) {
        //get string value of item entered


        //convert date to string in a function
        //


    }



    @FXML
    public void RemoveItem(ActionEvent actionEvent) {
   //remove item names


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



    @FXML
    public void enteruniqueitemdescription(ActionEvent actionEvent) {
    }

    @FXML
    public void changeItemNameCellEvent(TableColumn.CellEditEvent editedCell){
        ToDoListContent listselected = tablelist.getSelectionModel().getSelectedItem();
        listselected.setItemname(editedCell.getNewValue().toString());

    }
    @FXML
    public void changeItemDescriptionCellEvent(TableColumn.CellEditEvent editedCell){
        ToDoListContent listselected = tablelist.getSelectionModel().getSelectedItem();
        listselected.setItemdescription(editedCell.getNewValue().toString());

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       listofitemnames.setCellValueFactory(new PropertyValueFactory<ToDoListContent, String>("itemname"));
        listofdates.setCellValueFactory(new PropertyValueFactory<ToDoListContent, LocalDate>("userdate"));
        listofitemdescriptions.setCellValueFactory(new PropertyValueFactory<ToDoListContent, String>("itemdescription"));

        tablelist.setItems(getcontent());

        //update table item name and itemdesc to be editable
        tablelist.setEditable(true);
        listofitemnames.setCellFactory(TextFieldTableCell.forTableColumn());
        listofitemdescriptions.setCellFactory(TextFieldTableCell.forTableColumn());
    }

    public ObservableList<ToDoListContent> getcontent(){
        ObservableList<ToDoListContent> itemlist = FXCollections.observableArrayList();
        itemlist.add(new ToDoListContent("Paint the Town", LocalDate.of(1915, Month.FEBRUARY, 12),"Get Paint"));
        itemlist.add(new ToDoListContent("Cry", LocalDate.of(2003, Month.FEBRUARY, 20),"Birth"));

        return itemlist;
    }
}
