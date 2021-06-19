package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.CornerRadii;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;


public class Controller implements Initializable {

    @FXML
    private Button solve = new Button();
    @FXML
    private ComboBox<String> combo1;
    @FXML
    private ComboBox<String> combo2;
    @FXML
    private ComboBox<String> combo3;
    @FXML
    private ComboBox<String> combo4;
    @FXML
    private ComboBox<String> combo5;
    @FXML
    private ComboBox<String> combo6;
    @FXML
    private ComboBox<String> combo7;
    @FXML
    private ComboBox<String> combo8;
    @FXML
    private ComboBox<String> combo9;
    @FXML
    private ComboBox<String> combo10;
    @FXML
    private ComboBox<String> combo11;
    @FXML
    private ComboBox<String> combo12;
    @FXML
    private ComboBox<String> combo13;
    @FXML
    private ComboBox<String> combo14;
    @FXML
    private ComboBox<String> combo15;
    @FXML
    private ComboBox<String> combo16;
    @FXML
    private ComboBox<String> combo17;
    @FXML
    private ComboBox<String> combo18;
    @FXML
    private ComboBox<String> combo19;
    @FXML
    private ComboBox<String> combo20;
    @FXML
    private ComboBox<String> combo21;
    @FXML
    private ComboBox<String> combo22;
    @FXML
    private ComboBox<String> combo23;
    @FXML
    private ComboBox<String> combo24;
    @FXML
    private ComboBox<String> combo25;
    @FXML
    private ComboBox<String> combo26;
    @FXML
    private ComboBox<String> combo27;
    @FXML
    private ComboBox<String> combo28;
    @FXML
    private ComboBox<String> combo29;
    @FXML
    private ComboBox<String> combo30;
    @FXML
    private ComboBox<String> combo31;
    @FXML
    private ComboBox<String> combo32;
    @FXML
    private ComboBox<String> combo33;
    @FXML
    private ComboBox<String> combo34;
    @FXML
    private ComboBox<String> combo35;
    @FXML
    private ComboBox<String> combo36;
    @FXML
    private ComboBox<String> combo37;
    @FXML
    private ComboBox<String> combo38;
    @FXML
    private ComboBox<String> combo39;
    @FXML
    private ComboBox<String> combo40;
    @FXML
    private ComboBox<String> combo41;
    @FXML
    private ComboBox<String> combo42;
    @FXML
    private ComboBox<String> combo43;
    @FXML
    private ComboBox<String> combo44;
    @FXML
    private ComboBox<String> combo45;
    @FXML
    private ComboBox<String> combo46;
    @FXML
    private ComboBox<String> combo47;
    @FXML
    private ComboBox<String> combo48;
    @FXML
    private ComboBox<String> combo49;
    @FXML
    private ComboBox<String> combo50;
    @FXML
    private ComboBox<String> combo51;
    @FXML
    private ComboBox<String> combo52;
    @FXML
    private ComboBox<String> combo53;
    @FXML
    private ComboBox<String> combo54;


    ObservableList<String> list = FXCollections.observableArrayList("RED", "GREEN", "BLUE", "YELLOW", "ORANGE", "WHITE","");
     public static String rubik[][][]=new String[3][3][3];
     public static String rubik2[][][]=new String[3][3][3];
     public static String track="";
     public static int times,put,cf,fl,count,num=1,not,cc;
     public static int f1,f2;
     public static String val[]=new String[54];


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        combo1.setItems(list);combo1.setPromptText("enter");
        combo2.setItems(list);combo2.setPromptText("BLUE");
        combo3.setItems(list);combo3.setPromptText("BLUE");
        combo4.setItems(list);combo4.setPromptText("BLUE");
        combo5.setItems(list);combo5.setPromptText("BLUE");
        combo6.setItems(list);combo6.setPromptText("BLUE");
        combo7.setItems(list);combo7.setPromptText("BLUE");
        combo8.setItems(list);combo8.setPromptText("BLUE");
        combo9.setItems(list);combo9.setPromptText("BLUE");
        combo10.setItems(list);combo10.setPromptText("RED");
        combo11.setItems(list);combo11.setPromptText("RED");
        combo12.setItems(list);combo12.setPromptText("RED");
        combo13.setItems(list);combo13.setPromptText("RED");
        combo14.setItems(list);combo14.setPromptText("RED");
        combo15.setItems(list);combo15.setPromptText("RED");
        combo16.setItems(list);combo16.setPromptText("RED");
        combo17.setItems(list);combo17.setPromptText("RED");
        combo18.setItems(list);combo18.setPromptText("RED");
        combo19.setItems(list);combo19.setPromptText("GREEN");
        combo20.setItems(list);combo20.setPromptText("GREEN");
        combo21.setItems(list);combo21.setPromptText("GREEN");
        combo22.setItems(list);combo22.setPromptText("GREEN");
        combo23.setItems(list);combo23.setPromptText("GREEN");
        combo24.setItems(list);combo24.setPromptText("GREEN");
        combo25.setItems(list);combo25.setPromptText("GREEN");
        combo26.setItems(list);combo26.setPromptText("GREEN");
        combo27.setItems(list);combo27.setPromptText("GREEN");
        combo28.setItems(list);combo28.setPromptText("ORANGE");
        combo29.setItems(list);combo29.setPromptText("ORANGE");
        combo30.setItems(list);combo30.setPromptText("ORANGE");
        combo31.setItems(list);combo31.setPromptText("ORANGE");
        combo32.setItems(list);combo32.setPromptText("ORANGE");
        combo33.setItems(list);combo33.setPromptText("ORANGE");
        combo34.setItems(list);combo34.setPromptText("ORANGE");
        combo35.setItems(list);combo35.setPromptText("ORANGE");
        combo36.setItems(list);combo36.setPromptText("ORANGE");
        combo37.setItems(list);combo37.setPromptText("YELLOW");
        combo38.setItems(list);combo38.setPromptText("YELLOW");
        combo39.setItems(list);combo39.setPromptText("YELLOW");
        combo40.setItems(list);combo40.setPromptText("YELLOW");
        combo41.setItems(list);combo41.setPromptText("YELLOW");
        combo42.setItems(list);combo42.setPromptText("YELLOW");
        combo43.setItems(list);combo43.setPromptText("YELLOW");
        combo44.setItems(list);combo44.setPromptText("YELLOW");
        combo45.setItems(list);combo45.setPromptText("YELLOW");
        combo46.setItems(list);combo46.setPromptText("WHITE");
        combo47.setItems(list);combo47.setPromptText("WHITE");
        combo48.setItems(list);combo48.setPromptText("WHITE");
        combo49.setItems(list);combo49.setPromptText("WHITE");
        combo50.setItems(list);combo50.setPromptText("WHITE");
        combo51.setItems(list);combo51.setPromptText("WHITE");
        combo52.setItems(list);combo52.setPromptText("WHITE");
        combo53.setItems(list);combo53.setPromptText("WHITE");
        combo54.setItems(list);combo54.setPromptText("WHITE");
    }
    public void reset()
    {

        track="";
        times=0;put=0;cf=0;fl=0;count=0;num=1;not=0;cc=0;
        f1=0;f2=0;

        combo1.getStyleClass().removeAll("red","green","orange","yellow","white");combo1.getStyleClass().add("blue");
        combo2.getStyleClass().removeAll("red","green","orange","yellow","white");combo2.getStyleClass().add("blue");
        combo3.getStyleClass().removeAll("red","green","orange","yellow","white");combo3.getStyleClass().add("blue");
        combo4.getStyleClass().removeAll("red","green","orange","yellow","white");combo4.getStyleClass().add("blue");
        combo5.getStyleClass().removeAll("red","green","orange","yellow","white");combo5.getStyleClass().add("blue");
        combo6.getStyleClass().removeAll("red","green","orange","yellow","white");combo6.getStyleClass().add("blue");
        combo7.getStyleClass().removeAll("red","green","orange","yellow","white");combo7.getStyleClass().add("blue");
        combo8.getStyleClass().removeAll("red","green","orange","yellow","white");combo8.getStyleClass().add("blue");
        combo9.getStyleClass().removeAll("red","green","orange","yellow","white");combo9.getStyleClass().add("blue");
        combo10.getStyleClass().removeAll("blue","green","orange","yellow","white");combo10.getStyleClass().add("red");
        combo11.getStyleClass().removeAll("blue","green","orange","yellow","white");combo11.getStyleClass().add("red");
        combo12.getStyleClass().removeAll("blue","green","orange","yellow","white");combo12.getStyleClass().add("red");
        combo13.getStyleClass().removeAll("blue","green","orange","yellow","white");combo13.getStyleClass().add("red");
        combo14.getStyleClass().removeAll("blue","green","orange","yellow","white");combo14.getStyleClass().add("red");
        combo15.getStyleClass().removeAll("blue","green","orange","yellow","white");combo15.getStyleClass().add("red");
        combo16.getStyleClass().removeAll("blue","green","orange","yellow","white");combo16.getStyleClass().add("red");
        combo17.getStyleClass().removeAll("blue","green","orange","yellow","white");combo17.getStyleClass().add("red");
        combo18.getStyleClass().removeAll("blue","green","orange","yellow","white");combo18.getStyleClass().add("red");
        combo19.getStyleClass().removeAll("blue","red","orange","yellow","white");combo19.getStyleClass().add("green");
        combo20.getStyleClass().removeAll("blue","red","orange","yellow","white");combo20.getStyleClass().add("green");
        combo21.getStyleClass().removeAll("blue","red","orange","yellow","white");combo21.getStyleClass().add("green");
        combo22.getStyleClass().removeAll("blue","red","orange","yellow","white");combo22.getStyleClass().add("green");
        combo23.getStyleClass().removeAll("blue","red","orange","yellow","white");combo23.getStyleClass().add("green");
        combo24.getStyleClass().removeAll("blue","red","orange","yellow","white");combo24.getStyleClass().add("green");
        combo25.getStyleClass().removeAll("blue","red","orange","yellow","white");combo25.getStyleClass().add("green");
        combo26.getStyleClass().removeAll("blue","red","orange","yellow","white");combo26.getStyleClass().add("green");
        combo27.getStyleClass().removeAll("blue","red","orange","yellow","white");combo27.getStyleClass().add("green");
        combo28.getStyleClass().removeAll("blue","red","green","yellow","white");combo28.getStyleClass().add("orange");
        combo29.getStyleClass().removeAll("blue","red","green","yellow","white");combo29.getStyleClass().add("orange");
        combo30.getStyleClass().removeAll("blue","red","green","yellow","white");combo30.getStyleClass().add("orange");
        combo31.getStyleClass().removeAll("blue","red","green","yellow","white");combo31.getStyleClass().add("orange");
        combo32.getStyleClass().removeAll("blue","red","green","yellow","white");combo32.getStyleClass().add("orange");
        combo33.getStyleClass().removeAll("blue","red","green","yellow","white");combo33.getStyleClass().add("orange");
        combo34.getStyleClass().removeAll("blue","red","green","yellow","white");combo34.getStyleClass().add("orange");
        combo35.getStyleClass().removeAll("blue","red","green","yellow","white");combo35.getStyleClass().add("orange");
        combo36.getStyleClass().removeAll("blue","red","green","yellow","white");combo36.getStyleClass().add("orange");
        combo37.getStyleClass().removeAll("blue","red","green","orange","white");combo37.getStyleClass().add("yellow");
        combo38.getStyleClass().removeAll("blue","red","green","orange","white");combo38.getStyleClass().add("yellow");
        combo39.getStyleClass().removeAll("blue","red","green","orange","white");combo39.getStyleClass().add("yellow");
        combo40.getStyleClass().removeAll("blue","red","green","orange","white");combo40.getStyleClass().add("yellow");
        combo41.getStyleClass().removeAll("blue","red","green","orange","white");combo41.getStyleClass().add("yellow");
        combo42.getStyleClass().removeAll("blue","red","green","orange","white");combo42.getStyleClass().add("yellow");
        combo43.getStyleClass().removeAll("blue","red","green","orange","white");combo43.getStyleClass().add("yellow");
        combo44.getStyleClass().removeAll("blue","red","green","orange","white");combo44.getStyleClass().add("yellow");
        combo45.getStyleClass().removeAll("blue","red","green","orange","white");combo45.getStyleClass().add("yellow");
        combo46.getStyleClass().removeAll("blue","red","green","orange","yellow");combo46.getStyleClass().add("white");
        combo47.getStyleClass().removeAll("blue","red","green","orange","yellow");combo47.getStyleClass().add("white");
        combo48.getStyleClass().removeAll("blue","red","green","orange","yellow");combo48.getStyleClass().add("white");
        combo49.getStyleClass().removeAll("blue","red","green","orange","yellow");combo49.getStyleClass().add("white");
        combo50.getStyleClass().removeAll("blue","red","green","orange","yellow");combo50.getStyleClass().add("white");
        combo51.getStyleClass().removeAll("blue","red","green","orange","yellow");combo51.getStyleClass().add("white");
        combo52.getStyleClass().removeAll("blue","red","green","orange","yellow");combo52.getStyleClass().add("white");
        combo53.getStyleClass().removeAll("blue","red","green","orange","yellow");combo53.getStyleClass().add("white");
        combo54.getStyleClass().removeAll("blue","red","green","orange","yellow");combo54.getStyleClass().add("white");

    }
    public void combo1Changed(ActionEvent event) {

        combo1.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo1.getValue().equals("RED")) {
            val[0]="R";combo1.setValue("");combo1.getStyleClass().add("red");
        } else if (combo1.getValue().equals("WHITE")) {
            val[0]="W";combo1.setValue("");combo1.getStyleClass().add("white");
        } else if (combo1.getValue().equals("YELLOW")) {
            val[0]="Y";combo1.setValue("");combo1.getStyleClass().add("yellow");
        } else if (combo1.getValue().equals("GREEN")) {
            val[0]="G";combo1.setValue("");combo1.getStyleClass().add("green");
        } else if (combo1.getValue().equals("BLUE")) {
            val[0]="B";combo1.setValue("");combo1.getStyleClass().add("blue");
        } else if (combo1.getValue().equals("ORANGE")) {
            val[0]="O";combo1.setValue("");combo1.getStyleClass().add("orange");
        }


    }

    public void combo2Changed(ActionEvent event) {

        combo2.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo2.getValue().equals("RED")) {
            val[1]="R";combo2.setValue("");combo2.getStyleClass().add("red");
        } else if (combo2.getValue().equals("WHITE")) {
            val[1]="W";combo2.setValue("");combo2.getStyleClass().add("white");
        } else if (combo2.getValue().equals("YELLOW")) {
            val[1]="Y";combo2.setValue("");combo2.getStyleClass().add("yellow");
        } else if (combo2.getValue().equals("GREEN")) {
            val[1]="G";combo2.setValue("");combo2.getStyleClass().add("green");
        } else if (combo2.getValue().equals("BLUE")) {
            val[1]="B";combo2.setValue("");combo2.getStyleClass().add("blue");
        } else if (combo2.getValue().equals("ORANGE")) {
            val[1]="O";combo2.setValue("");combo2.getStyleClass().add("orange");
        }
    }

    public void combo3Changed(ActionEvent event) {
        combo3.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo3.getValue().equals("RED")) {
            val[2]="R";combo3.setValue("");combo3.getStyleClass().add("red");
        } else if (combo3.getValue().equals("WHITE")) {
            val[2]="W";combo3.setValue("");combo3.getStyleClass().add("white");
        } else if (combo3.getValue().equals("YELLOW")) {
            val[2]="Y";combo3.setValue("");combo3.getStyleClass().add("yellow");
        } else if (combo3.getValue().equals("GREEN")) {
            val[2]="G";combo3.setValue("");combo3.getStyleClass().add("green");
        } else if (combo3.getValue().equals("BLUE")) {
            val[2]="B";combo3.setValue("");combo3.getStyleClass().add("blue");
        } else if (combo3.getValue().equals("ORANGE")) {
            val[2]="O";combo3.setValue("");combo3.getStyleClass().add("orange");
        }
    }

    public void combo4Changed(ActionEvent event) {

        combo4.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo4.getValue().equals("RED")) {
            val[3]="R";combo4.setValue("");combo4.getStyleClass().add("red");
        } else if (combo4.getValue().equals("WHITE")) {
            val[3]="W";combo4.setValue("");combo4.getStyleClass().add("white");
        } else if (combo4.getValue().equals("YELLOW")) {
            val[3]="Y";combo4.setValue("");combo4.getStyleClass().add("yellow");
        } else if (combo4.getValue().equals("GREEN")) {
            val[3]="G";combo4.setValue("");combo4.getStyleClass().add("green");
        } else if (combo4.getValue().equals("BLUE")) {
            val[3]="B";combo4.setValue("");combo4.getStyleClass().add("blue");
        } else if (combo4.getValue().equals("ORANGE")) {
            val[3]="O";combo4.setValue("");combo4.getStyleClass().add("orange");
        }
    }

    public void combo5Changed(ActionEvent event) {

        combo5.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo5.getValue().equals("RED")) {
            val[4]="R";combo5.setValue("");combo5.getStyleClass().add("red");
        } else if (combo5.getValue().equals("WHITE")) {
            val[4]="W";combo5.setValue("");combo5.getStyleClass().add("white");
        } else if (combo5.getValue().equals("YELLOW")) {
            val[4]="Y";combo5.setValue("");combo5.getStyleClass().add("yellow");
        } else if (combo5.getValue().equals("GREEN")) {
            val[4]="G";combo5.setValue("");combo5.getStyleClass().add("green");
        } else if (combo5.getValue().equals("BLUE")) {
            val[4]="B";combo5.setValue("");combo5.getStyleClass().add("blue");
        } else if (combo5.getValue().equals("ORANGE")) {
            val[4]="O";combo5.setValue("");combo5.getStyleClass().add("orange");
        }
    }

    public void combo6Changed(ActionEvent event) {

        combo6.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo6.getValue().equals("RED")) {
            val[5]="R";combo6.setValue("");combo6.getStyleClass().add("red");
        } else if (combo6.getValue().equals("WHITE")) {
            val[5]="W";combo6.setValue("");combo6.getStyleClass().add("white");
        } else if (combo6.getValue().equals("YELLOW")) {
            val[5]="Y";combo6.setValue("");combo6.getStyleClass().add("yellow");
        } else if (combo6.getValue().equals("GREEN")) {
            val[5]="G";combo6.setValue("");combo6.getStyleClass().add("green");
        } else if (combo6.getValue().equals("BLUE")) {
            val[5]="B";combo6.setValue("");combo6.getStyleClass().add("blue");
        } else if (combo6.getValue().equals("ORANGE")) {
            val[5]="O";combo6.setValue("");combo6.getStyleClass().add("orange");
        }
    }

    public void combo7Changed(ActionEvent event) {

        combo7.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo7.getValue().equals("RED")) {
            val[6]="R";combo7.setValue("");combo7.getStyleClass().add("red");
        } else if (combo7.getValue().equals("WHITE")) {
            val[6]="W";combo7.setValue("");combo7.getStyleClass().add("white");
        } else if (combo7.getValue().equals("YELLOW")) {
            val[6]="Y";combo7.setValue("");combo7.getStyleClass().add("yellow");
        } else if (combo7.getValue().equals("GREEN")) {
            val[6]="G";combo7.setValue("");combo7.getStyleClass().add("green");
        } else if (combo7.getValue().equals("BLUE")) {
            val[6]="B";combo7.setValue("");combo7.getStyleClass().add("blue");
        } else if (combo7.getValue().equals("ORANGE")) {
            val[6]="O";combo7.setValue("");combo7.getStyleClass().add("orange");
        }
    }

    public void combo8Changed(ActionEvent event) {

        combo8.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo8.getValue().equals("RED")) {
            val[7]="R";combo8.setValue("");combo8.getStyleClass().add("red");
        } else if (combo8.getValue().equals("WHITE")) {
            val[7]="W";combo8.setValue("");combo8.getStyleClass().add("white");
        } else if (combo8.getValue().equals("YELLOW")) {
            val[7]="Y";combo8.setValue("");combo8.getStyleClass().add("yellow");
        } else if (combo8.getValue().equals("GREEN")) {
            val[7]="G";combo8.setValue("");combo8.getStyleClass().add("green");
        } else if (combo8.getValue().equals("BLUE")) {
            val[7]="B";combo8.setValue("");combo8.getStyleClass().add("blue");
        } else if (combo8.getValue().equals("ORANGE")) {
            val[7]="O";combo8.setValue("");combo8.getStyleClass().add("orange");
        }
    }

    public void combo9Changed(ActionEvent event) {

        combo9.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo9.getValue().equals("RED")) {
            val[8]="R";combo9.setValue("");combo9.getStyleClass().add("red");
        } else if (combo9.getValue().equals("WHITE")) {
            val[8]="W";combo9.setValue("");combo9.getStyleClass().add("white");
        } else if (combo9.getValue().equals("YELLOW")) {
            val[8]="Y";combo9.setValue("");combo9.getStyleClass().add("yellow");
        } else if (combo9.getValue().equals("GREEN")) {
            val[8]="G";combo9.setValue("");combo9.getStyleClass().add("green");
        } else if (combo9.getValue().equals("BLUE")) {
            val[8]="B";combo9.setValue("");combo9.getStyleClass().add("blue");
        } else if (combo9.getValue().equals("ORANGE")) {
            val[8]="O";combo9.setValue("");combo9.getStyleClass().add("orange");
        }
    }

    public void combo10Changed(ActionEvent event) {

        combo10.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo10.getValue().equals("RED")) {
            val[9]="R";combo10.setValue("");combo10.getStyleClass().add("red");
        } else if (combo10.getValue().equals("WHITE")) {
            val[9]="W";combo10.setValue("");combo10.getStyleClass().add("white");
        } else if (combo10.getValue().equals("YELLOW")) {
            val[9]="Y";combo10.setValue("");combo10.getStyleClass().add("yellow");
        } else if (combo10.getValue().equals("GREEN")) {
            val[9]="G";combo10.setValue("");combo10.getStyleClass().add("green");
        } else if (combo10.getValue().equals("BLUE")) {
            val[9]="B";combo10.setValue("");combo10.getStyleClass().add("blue");
        } else if (combo10.getValue().equals("ORANGE")) {
            val[9]="O";combo10.setValue("");combo10.getStyleClass().add("orange");
        }
    }

    public void combo11Changed(ActionEvent event) {

        combo11.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo11.getValue().equals("RED")) {
            val[10]="R";combo11.setValue("");combo11.getStyleClass().add("red");
        } else if (combo11.getValue().equals("WHITE")) {
            val[10]="W";combo11.setValue("");combo11.getStyleClass().add("white");
        } else if (combo11.getValue().equals("YELLOW")) {
            val[10]="Y";combo11.setValue("");combo11.getStyleClass().add("yellow");
        } else if (combo11.getValue().equals("GREEN")) {
            val[10]="G";combo11.setValue("");combo11.getStyleClass().add("green");
        } else if (combo11.getValue().equals("BLUE")) {
            val[10]="B";combo11.setValue("");combo11.getStyleClass().add("blue");
        } else if (combo11.getValue().equals("ORANGE")) {
            val[10]="O";combo11.setValue("");combo11.getStyleClass().add("orange");
        }
    }

    public void combo12Changed(ActionEvent event) {

        combo12.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo12.getValue().equals("RED")) {
            val[11]="R";combo12.setValue("");combo12.getStyleClass().add("red");
        } else if (combo12.getValue().equals("WHITE")) {
            val[11]="W";combo12.setValue("");combo12.getStyleClass().add("white");
        } else if (combo12.getValue().equals("YELLOW")) {
            val[11]="Y";combo12.setValue("");combo12.getStyleClass().add("yellow");
        } else if (combo12.getValue().equals("GREEN")) {
            val[11]="G";combo12.setValue("");combo12.getStyleClass().add("green");
        } else if (combo12.getValue().equals("BLUE")) {
            val[11]="G";combo12.setValue("");combo12.getStyleClass().add("blue");
        } else if (combo12.getValue().equals("ORANGE")) {
            val[11]="O";combo12.setValue("");combo12.getStyleClass().add("orange");
        }
    }

    public void combo13Changed(ActionEvent event) {

        combo13.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo13.getValue().equals("RED")) {
            val[12]="R";combo13.setValue("");combo13.getStyleClass().add("red");
        } else if (combo13.getValue().equals("WHITE")) {
            val[12]="W";combo13.setValue("");combo13.getStyleClass().add("white");
        } else if (combo13.getValue().equals("YELLOW")) {
            val[12]="Y";combo13.setValue("");combo13.getStyleClass().add("yellow");
        } else if (combo13.getValue().equals("GREEN")) {
            val[12]="G";combo13.setValue("");combo13.getStyleClass().add("green");
        } else if (combo13.getValue().equals("BLUE")) {
            val[12]="B";combo13.setValue("");combo13.getStyleClass().add("blue");
        } else if (combo13.getValue().equals("ORANGE")) {
            val[12]="O";combo13.setValue("");combo13.getStyleClass().add("orange");
        }
    }

    public void combo14Changed(ActionEvent event) {

        combo14.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo14.getValue().equals("RED")) {
            val[13]="R";combo14.setValue("");combo14.getStyleClass().add("red");
        } else if (combo14.getValue().equals("WHITE")) {
            val[13]="W";combo14.setValue("");combo14.getStyleClass().add("white");
        } else if (combo14.getValue().equals("YELLOW")) {
            val[13]="Y";combo14.setValue("");combo14.getStyleClass().add("yellow");
        } else if (combo14.getValue().equals("GREEN")) {
            val[13]="G";combo14.setValue("");combo14.getStyleClass().add("green");
        } else if (combo14.getValue().equals("BLUE")) {
            val[13]="B";combo14.setValue("");combo14.getStyleClass().add("blue");
        } else if (combo14.getValue().equals("ORANGE")) {
            val[13]="O";combo14.setValue("");combo14.getStyleClass().add("orange");
        }
    }

    public void combo15Changed(ActionEvent event) {

        combo15.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo15.getValue().equals("RED")) {
            val[14]="R";combo15.setValue("");combo15.getStyleClass().add("red");
        } else if (combo15.getValue().equals("WHITE")) {
            val[14]="W";combo15.setValue("");combo15.getStyleClass().add("white");
        } else if (combo15.getValue().equals("YELLOW")) {
            val[14]="Y";combo15.setValue("");combo15.getStyleClass().add("yellow");
        } else if (combo15.getValue().equals("GREEN")) {
            val[14]="G";combo15.setValue("");combo15.getStyleClass().add("green");
        } else if (combo15.getValue().equals("BLUE")) {
            val[14]="B";combo15.setValue("");combo15.getStyleClass().add("blue");
        } else if (combo15.getValue().equals("ORANGE")) {
            val[14]="O";combo15.setValue("");combo15.getStyleClass().add("orange");
        }
    }

    public void combo16Changed(ActionEvent event) {

        combo16.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo16.getValue().equals("RED")) {
            val[15]="R";combo16.setValue("");combo16.getStyleClass().add("red");
        } else if (combo16.getValue().equals("WHITE")) {
            val[15]="W";combo16.setValue("");combo16.getStyleClass().add("white");
        } else if (combo16.getValue().equals("YELLOW")) {
            val[15]="Y";combo16.setValue("");combo16.getStyleClass().add("yellow");
        } else if (combo16.getValue().equals("GREEN")) {
            val[15]="G";combo16.setValue("");combo16.getStyleClass().add("green");
        } else if (combo16.getValue().equals("BLUE")) {
            val[15]="B";combo16.setValue("");combo16.getStyleClass().add("blue");
        } else if (combo16.getValue().equals("ORANGE")) {
            val[15]="O";combo16.setValue("");combo16.getStyleClass().add("orange");
        }
    }

    public void combo17Changed(ActionEvent event) {

        combo17.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo17.getValue().equals("RED")) {
            val[16]="R";combo17.setValue("");combo17.getStyleClass().add("red");
        } else if (combo17.getValue().equals("WHITE")) {
            val[16]="W";combo17.setValue("");combo17.getStyleClass().add("white");
        } else if (combo17.getValue().equals("YELLOW")) {
            val[16]="Y";combo17.setValue("");combo17.getStyleClass().add("yellow");
        } else if (combo17.getValue().equals("GREEN")) {
            val[16]="G";combo17.setValue("");combo17.getStyleClass().add("green");
        } else if (combo17.getValue().equals("BLUE")) {
            val[16]="B";combo17.setValue("");combo17.getStyleClass().add("blue");
        } else if (combo17.getValue().equals("ORANGE")) {
            val[16]="O";combo17.setValue("");combo17.getStyleClass().add("orange");
        }
    }

    public void combo18Changed(ActionEvent event) {

        combo18.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo18.getValue().equals("RED")) {
            val[17]="R";combo18.setValue("");combo18.getStyleClass().add("red");
        } else if (combo18.getValue().equals("WHITE")) {
            val[17]="W";combo18.setValue("");combo18.getStyleClass().add("white");
        } else if (combo18.getValue().equals("YELLOW")) {
            val[17]="Y";combo18.setValue("");combo18.getStyleClass().add("yellow");
        } else if (combo18.getValue().equals("GREEN")) {
            val[17]="G";combo18.setValue("");combo18.getStyleClass().add("green");
        } else if (combo18.getValue().equals("BLUE")) {
            val[17]="B";combo18.setValue("");combo18.getStyleClass().add("blue");
        } else if (combo18.getValue().equals("ORANGE")) {
            val[17]="O";combo18.setValue(""); combo18.getStyleClass().add("orange");
        }
    }

    public void combo19Changed(ActionEvent event) {

        combo19.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo19.getValue().equals("RED")) {
            val[18]="R";combo19.setValue("");combo19.getStyleClass().add("red");
        } else if (combo19.getValue().equals("WHITE")) {
            val[18]="W";combo19.setValue(""); combo19.getStyleClass().add("white");
        } else if (combo19.getValue().equals("YELLOW")) {
            val[18]="Y";combo19.setValue(""); combo19.getStyleClass().add("yellow");
        } else if (combo19.getValue().equals("GREEN")) {
            val[18]="G";combo19.setValue(""); combo19.getStyleClass().add("green");
        } else if (combo19.getValue().equals("BLUE")) {
            val[18]="B";combo19.setValue(""); combo19.getStyleClass().add("blue");
        } else if (combo19.getValue().equals("ORANGE")) {
            val[18]="O";combo19.setValue(""); combo19.getStyleClass().add("orange");
        }
    }

    public void combo20Changed(ActionEvent event) {

        combo20.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo20.getValue().equals("RED")) {
            val[19]="R";combo20.setValue(""); combo20.getStyleClass().add("red");
        } else if (combo20.getValue().equals("WHITE")) {
            val[19]="W";combo20.setValue(""); combo20.getStyleClass().add("white");
        } else if (combo20.getValue().equals("YELLOW")) {
            val[19]="Y";combo20.setValue(""); combo20.getStyleClass().add("yellow");
        } else if (combo20.getValue().equals("GREEN")) {
            val[19]="G";combo20.setValue(""); combo20.getStyleClass().add("green");
        } else if (combo20.getValue().equals("BLUE")) {
            val[19]="B";combo20.setValue(""); combo20.getStyleClass().add("blue");
        } else if (combo20.getValue().equals("ORANGE")) {
            val[19]="O";combo20.setValue(""); combo20.getStyleClass().add("orange");
        }
    }

    public void combo21Changed(ActionEvent event) {

        combo21.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo21.getValue().equals("RED")) {
            val[20]="R";combo21.setValue(""); combo21.getStyleClass().add("red");
        } else if (combo21.getValue().equals("WHITE")) {
            val[20]="W";combo21.setValue(""); combo21.getStyleClass().add("white");
        } else if (combo21.getValue().equals("YELLOW")) {
            val[20]="Y";combo21.setValue(""); combo21.getStyleClass().add("yellow");
        } else if (combo21.getValue().equals("GREEN")) {
            val[20]="G";combo21.setValue(""); combo21.getStyleClass().add("green");
        } else if (combo21.getValue().equals("BLUE")) {
            val[20]="B";combo21.setValue(""); combo21.getStyleClass().add("blue");
        } else if (combo21.getValue().equals("ORANGE")) {
            val[20]="O";combo21.setValue(""); combo21.getStyleClass().add("orange");
        }
    }

    public void combo22Changed(ActionEvent event) {

        combo22.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo22.getValue().equals("RED")) {
            val[21]="R";combo22.setValue(""); combo22.getStyleClass().add("red");
        } else if (combo22.getValue().equals("WHITE")) {
            val[21]="W";combo22.setValue(""); combo22.getStyleClass().add("white");
        } else if (combo22.getValue().equals("YELLOW")) {
            val[21]="Y";combo22.setValue(""); combo22.getStyleClass().add("yellow");
        } else if (combo22.getValue().equals("GREEN")) {
            val[21]="G";combo22.setValue(""); combo22.getStyleClass().add("green");
        } else if (combo22.getValue().equals("BLUE")) {
            val[21]="B";combo22.setValue(""); combo22.getStyleClass().add("blue");
        } else if (combo22.getValue().equals("ORANGE")) {
            val[21]="O";combo22.setValue(""); combo22.getStyleClass().add("orange");
        }
    }

    public void combo23Changed(ActionEvent event) {

        combo23.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo23.getValue().equals("RED")) {
            val[22]="R";combo23.setValue(""); combo23.getStyleClass().add("red");
        } else if (combo23.getValue().equals("WHITE")) {
            val[22]="W";combo23.setValue(""); combo23.getStyleClass().add("white");
        } else if (combo23.getValue().equals("YELLOW")) {
            val[22]="Y";combo23.setValue(""); combo23.getStyleClass().add("yellow");
        } else if (combo23.getValue().equals("GREEN")) {
            val[22]="G";combo23.setValue(""); combo23.getStyleClass().add("green");
        } else if (combo23.getValue().equals("BLUE")) {
            val[22]="B";combo23.setValue(""); combo23.getStyleClass().add("blue");
        } else if (combo23.getValue().equals("ORANGE")) {
            val[22]="O";combo23.setValue(""); combo23.getStyleClass().add("orange");
        }
    }

    public void combo24Changed(ActionEvent event) {

        combo24.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo24.getValue().equals("RED")) {
            val[23]="R";combo24.setValue(""); combo24.getStyleClass().add("red");
        } else if (combo24.getValue().equals("WHITE")) {
            val[23]="W";combo24.setValue(""); combo24.getStyleClass().add("white");
        } else if (combo24.getValue().equals("YELLOW")) {
            val[23]="Y";combo24.setValue(""); combo24.getStyleClass().add("yellow");
        } else if (combo24.getValue().equals("GREEN")) {
            val[23]="G";combo24.setValue(""); combo24.getStyleClass().add("green");
        } else if (combo24.getValue().equals("BLUE")) {
            val[23]="B";combo24.setValue(""); combo24.getStyleClass().add("blue");
        } else if (combo24.getValue().equals("ORANGE")) {
            val[23]="O";combo24.setValue(""); combo24.getStyleClass().add("orange");
        }
    }

    public void combo25Changed(ActionEvent event) {

        combo25.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo25.getValue().equals("RED")) {
            val[24]="R";combo25.setValue(""); combo25.getStyleClass().add("red");
        } else if (combo25.getValue().equals("WHITE")) {
            val[24]="W";combo25.setValue(""); combo25.getStyleClass().add("white");
        } else if (combo25.getValue().equals("YELLOW")) {
            val[24]="Y";combo25.setValue("");combo25.getStyleClass().add("yellow");
        } else if (combo25.getValue().equals("GREEN")) {
            val[24]="G";combo25.setValue("");combo25.getStyleClass().add("green");
        } else if (combo25.getValue().equals("BLUE")) {
            val[24]="B";combo25.setValue("");combo25.getStyleClass().add("blue");
        } else if (combo25.getValue().equals("ORANGE")) {
            val[24]="O";combo25.setValue(""); combo25.getStyleClass().add("orange");
        }
    }

    public void combo26Changed(ActionEvent event) {

        combo26.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo26.getValue().equals("RED")) {
            val[25]="R";combo26.setValue("");combo26.getStyleClass().add("red");
        } else if (combo26.getValue().equals("WHITE")) {
            val[25]="W";combo26.setValue(""); combo26.getStyleClass().add("white");
        } else if (combo26.getValue().equals("YELLOW")) {
            val[25]="Y";combo26.setValue(""); combo26.getStyleClass().add("yellow");
        } else if (combo26.getValue().equals("GREEN")) {
            val[25]="G";combo26.setValue(""); combo26.getStyleClass().add("green");
        } else if (combo26.getValue().equals("BLUE")) {
            val[25]="B";combo26.setValue(""); combo26.getStyleClass().add("blue");
        } else if (combo26.getValue().equals("ORANGE")) {
            val[25]="O";combo26.setValue(""); combo26.getStyleClass().add("orange");
        }
    }

    public void combo27Changed(ActionEvent event) {

        combo27.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo27.getValue().equals("RED")) {
            val[26]="R";combo27.setValue("");combo27.getStyleClass().add("red");
        } else if (combo27.getValue().equals("WHITE")) {
            val[26]="W";combo27.setValue(""); combo27.getStyleClass().add("white");
        } else if (combo27.getValue().equals("YELLOW")) {
            val[26]="Y";combo27.setValue(""); combo27.getStyleClass().add("yellow");
        } else if (combo27.getValue().equals("GREEN")) {
            val[26]="G";combo27.setValue("");combo27.getStyleClass().add("green");
        } else if (combo27.getValue().equals("BLUE")) {
            val[26]="B";combo27.setValue("");combo27.getStyleClass().add("blue");
        } else if (combo27.getValue().equals("ORANGE")) {
            val[26]="O";combo27.setValue(""); combo27.getStyleClass().add("orange");
        }
    }

    public void combo28Changed(ActionEvent event) {

        combo28.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo28.getValue().equals("RED")) {
            val[27]="R";combo28.setValue(""); combo28.getStyleClass().add("red");
        } else if (combo28.getValue().equals("WHITE")) {
            val[27]="W";combo28.setValue(""); combo28.getStyleClass().add("white");
        } else if (combo28.getValue().equals("YELLOW")) {
            val[27]="Y";combo28.setValue(""); combo28.getStyleClass().add("yellow");
        } else if (combo28.getValue().equals("GREEN")) {
            val[27]="G";combo28.setValue("");  combo28.getStyleClass().add("green");
        } else if (combo28.getValue().equals("BLUE")) {
            val[27]="B";combo28.setValue("");  combo28.getStyleClass().add("blue");
        } else if (combo28.getValue().equals("ORANGE")) {
            val[27]="O";combo28.setValue(""); combo28.getStyleClass().add("orange");
        }
    }

    public void combo29Changed(ActionEvent event) {

        combo29.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo29.getValue().equals("RED")) {
            val[28]="R";combo29.setValue("");combo29.getStyleClass().add("red");
        } else if (combo29.getValue().equals("WHITE")) {
            val[28]="W";combo29.setValue("");combo29.getStyleClass().add("white");
        } else if (combo29.getValue().equals("YELLOW")) {
            val[28]="Y";combo29.setValue("");combo29.getStyleClass().add("yellow");
        } else if (combo29.getValue().equals("GREEN")) {
            val[28]="G";combo29.setValue("");combo29.getStyleClass().add("green");
        } else if (combo29.getValue().equals("BLUE")) {
            val[28]="B";combo29.setValue("");combo29.getStyleClass().add("blue");
        } else if (combo29.getValue().equals("ORANGE")) {
            val[28]="O";combo29.setValue("");combo29.getStyleClass().add("orange");
        }
    }

    public void combo30Changed(ActionEvent event) {

        combo30.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo30.getValue().equals("RED")) {
            val[29]="R";combo30.setValue("");combo30.getStyleClass().add("red");
        } else if (combo30.getValue().equals("WHITE")) {
            val[29]="W";combo30.setValue("");combo30.getStyleClass().add("white");
        } else if (combo30.getValue().equals("YELLOW")) {
            val[29]="Y";combo30.setValue("");combo30.getStyleClass().add("yellow");
        } else if (combo30.getValue().equals("GREEN")) {
            val[29]="G";combo30.setValue("");combo30.getStyleClass().add("green");
        } else if (combo30.getValue().equals("BLUE")) {
            val[29]="B";combo30.setValue("");combo30.getStyleClass().add("blue");
        } else if (combo30.getValue().equals("ORANGE")) {
            val[29]="O";combo30.setValue("");combo30.getStyleClass().add("orange");
        }
    }

    public void combo31Changed(ActionEvent event) {

        combo31.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo31.getValue().equals("RED")) {
            val[30]="R";combo31.setValue("");combo31.getStyleClass().add("red");
        } else if (combo31.getValue().equals("WHITE")) {
            val[30]="W";combo31.setValue("");combo31.getStyleClass().add("white");
        } else if (combo31.getValue().equals("YELLOW")) {
            val[30]="Y";combo31.setValue("");combo31.getStyleClass().add("yellow");
        } else if (combo31.getValue().equals("GREEN")) {
            val[30]="G";combo31.setValue("");combo31.getStyleClass().add("green");
        } else if (combo31.getValue().equals("BLUE")) {
            val[30]="B";combo31.setValue("");combo31.getStyleClass().add("blue");
        } else if (combo31.getValue().equals("ORANGE")) {
            val[30]="O";combo31.setValue("");combo31.getStyleClass().add("orange");
        }
    }

    public void combo32Changed(ActionEvent event) {

        combo32.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo32.getValue().equals("RED")) {
            val[31]="R";combo32.setValue("");combo32.getStyleClass().add("red");
        } else if (combo32.getValue().equals("WHITE")) {
            val[31]="W";combo32.setValue("");combo32.getStyleClass().add("white");
        } else if (combo32.getValue().equals("YELLOW")) {
            val[31]="Y";combo32.setValue("");combo32.getStyleClass().add("yellow");
        } else if (combo32.getValue().equals("GREEN")) {
            val[31]="G";combo32.setValue("");combo32.getStyleClass().add("green");
        } else if (combo32.getValue().equals("BLUE")) {
            val[31]="B";combo32.setValue("");combo32.getStyleClass().add("blue");
        } else if (combo32.getValue().equals("ORANGE")) {
            val[31]="O";combo32.setValue("");combo32.getStyleClass().add("orange");
        }
    }

    public void combo33Changed(ActionEvent event) {

        combo33.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo33.getValue().equals("RED")) {
            val[32]="R";combo33.setValue("");combo33.getStyleClass().add("red");
        } else if (combo33.getValue().equals("WHITE")) {
            val[32]="W";combo33.setValue("");combo33.getStyleClass().add("white");
        } else if (combo33.getValue().equals("YELLOW")) {
            val[32]="Y";combo33.setValue("");combo33.getStyleClass().add("yellow");
        } else if (combo33.getValue().equals("GREEN")) {
            val[32]="G";combo33.setValue("");combo33.getStyleClass().add("green");
        } else if (combo33.getValue().equals("BLUE")) {
            val[32]="B";combo33.setValue("");combo33.getStyleClass().add("blue");
        } else if (combo33.getValue().equals("ORANGE")) {
            val[32]="O";combo33.setValue("");combo33.getStyleClass().add("orange");
        }
    }

    public void combo34Changed(ActionEvent event) {

        combo34.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo34.getValue().equals("RED")) {
            val[33]="R";combo34.setValue("");combo34.getStyleClass().add("red");
        } else if (combo34.getValue().equals("WHITE")) {
            val[33]="W";combo34.setValue("");combo34.getStyleClass().add("white");
        } else if (combo34.getValue().equals("YELLOW")) {
            val[33]="Y";combo34.setValue("");combo34.getStyleClass().add("yellow");
        } else if (combo34.getValue().equals("GREEN")) {
            val[33]="G";combo34.setValue("");combo34.getStyleClass().add("green");
        } else if (combo34.getValue().equals("BLUE")) {
            val[33]="B";combo34.setValue("");combo34.getStyleClass().add("blue");
        } else if (combo34.getValue().equals("ORANGE")) {
            val[33]="O";combo34.setValue("");combo34.getStyleClass().add("orange");
        }
    }

    public void combo35Changed(ActionEvent event) {

        combo35.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo35.getValue().equals("RED")) {
            val[34]="R";combo35.setValue("");combo35.getStyleClass().add("red");
        } else if (combo35.getValue().equals("WHITE")) {
            val[34]="W";combo35.setValue("");combo35.getStyleClass().add("white");
        } else if (combo35.getValue().equals("YELLOW")) {
            val[34]="Y";combo35.setValue("");combo35.getStyleClass().add("yellow");
        } else if (combo35.getValue().equals("GREEN")) {
            val[34]="G";combo35.setValue("");combo35.getStyleClass().add("green");
        } else if (combo35.getValue().equals("BLUE")) {
            val[34]="B";combo35.setValue("");combo35.getStyleClass().add("blue");
        } else if (combo35.getValue().equals("ORANGE")) {
            val[34]="O";combo35.setValue("");combo35.getStyleClass().add("orange");
        }
    }

    public void combo36Changed(ActionEvent event) {

        combo36.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo36.getValue().equals("RED")) {
            val[35]="R";combo36.setValue("");combo36.getStyleClass().add("red");
        } else if (combo36.getValue().equals("WHITE")) {
            val[35]="W";combo36.setValue("");combo36.getStyleClass().add("white");
        } else if (combo36.getValue().equals("YELLOW")) {
            val[35]="Y";combo36.setValue("");combo36.getStyleClass().add("yellow");
        } else if (combo36.getValue().equals("GREEN")) {
            val[35]="G";combo36.setValue("");combo36.getStyleClass().add("green");
        } else if (combo36.getValue().equals("BLUE")) {
            val[35]="B";combo36.setValue("");combo36.getStyleClass().add("blue");
        } else if (combo36.getValue().equals("ORANGE")) {
            val[35]="O";combo36.setValue("");combo36.getStyleClass().add("orange");
        }
    }

    public void combo37Changed(ActionEvent event) {

        combo37.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo37.getValue().equals("RED")) {
            val[36]="R";combo37.setValue("");combo37.getStyleClass().add("red");
        } else if (combo37.getValue().equals("WHITE")) {
            val[36]="W";combo37.setValue("");combo37.getStyleClass().add("white");
        } else if (combo37.getValue().equals("YELLOW")) {
            val[36]="Y";combo37.setValue("");combo37.getStyleClass().add("yellow");
        } else if (combo37.getValue().equals("GREEN")) {
            val[36]="G";combo37.setValue("");combo37.getStyleClass().add("green");
        } else if (combo37.getValue().equals("BLUE")) {
            val[36]="B";combo37.setValue("");combo37.getStyleClass().add("blue");
        } else if (combo37.getValue().equals("ORANGE")) {
            val[36]="O";combo37.setValue("");combo37.getStyleClass().add("orange");
        }
    }

    public void combo38Changed(ActionEvent event) {

        combo38.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo38.getValue().equals("RED")) {
            val[37]="R";combo38.setValue("");combo38.getStyleClass().add("red");
        } else if (combo38.getValue().equals("WHITE")) {
            val[37]="W";combo38.setValue("");combo38.getStyleClass().add("white");
        } else if (combo38.getValue().equals("YELLOW")) {
            val[37]="Y";combo38.setValue("");combo38.getStyleClass().add("yellow");
        } else if (combo38.getValue().equals("GREEN")) {
            val[37]="G";combo38.setValue("");combo38.getStyleClass().add("green");
        } else if (combo38.getValue().equals("BLUE")) {
            val[37]="B";combo38.setValue("");combo38.getStyleClass().add("blue");
        } else if (combo38.getValue().equals("ORANGE")) {
            val[37]="O";combo38.setValue("");combo38.getStyleClass().add("orange");
        }
    }

    public void combo39Changed(ActionEvent event) {

        combo39.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo39.getValue().equals("RED")) {
            val[38]="R";combo39.setValue("");combo39.getStyleClass().add("red");
        } else if (combo39.getValue().equals("WHITE")) {
            val[38]="W";combo39.setValue("");combo39.getStyleClass().add("white");
        } else if (combo39.getValue().equals("YELLOW")) {
            val[38]="Y";combo39.setValue("");combo39.getStyleClass().add("yellow");
        } else if (combo39.getValue().equals("GREEN")) {
            val[38]="G";combo39.setValue("");combo39.getStyleClass().add("green");
        } else if (combo39.getValue().equals("BLUE")) {
            val[38]="B";combo39.setValue("");combo39.getStyleClass().add("blue");
        } else if (combo39.getValue().equals("ORANGE")) {
            val[38]="O";combo39.setValue("");combo39.getStyleClass().add("orange");
        }
    }

    public void combo40Changed(ActionEvent event) {

        combo40.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo40.getValue().equals("RED")) {
            val[39]="R";combo40.setValue("");combo40.getStyleClass().add("red");
        } else if (combo40.getValue().equals("WHITE")) {
            val[39]="W";combo40.setValue("");combo40.getStyleClass().add("white");
        } else if (combo40.getValue().equals("YELLOW")) {
            val[39]="Y";combo40.setValue("");combo40.getStyleClass().add("yellow");
        } else if (combo40.getValue().equals("GREEN")) {
            val[39]="G";combo40.setValue("");combo40.getStyleClass().add("green");
        } else if (combo40.getValue().equals("BLUE")) {
            val[39]="B";combo40.setValue("");combo40.getStyleClass().add("blue");
        } else if (combo40.getValue().equals("ORANGE")) {
            val[39]="O";combo40.setValue("");combo40.getStyleClass().add("orange");
        }
    }

    public void combo41Changed(ActionEvent event) {

        combo41.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo41.getValue().equals("RED")) {
            val[40]="R";combo41.setValue("");combo41.getStyleClass().add("red");
        } else if (combo41.getValue().equals("WHITE")) {
            val[40]="W";combo41.setValue("");combo41.getStyleClass().add("white");
        } else if (combo41.getValue().equals("YELLOW")) {
            val[40]="Y";combo41.setValue("");combo41.getStyleClass().add("yellow");
        } else if (combo41.getValue().equals("GREEN")) {
            val[40]="G";combo41.setValue("");combo41.getStyleClass().add("green");
        } else if (combo41.getValue().equals("BLUE")) {
            val[40]="B";combo41.setValue("");combo41.getStyleClass().add("blue");
        } else if (combo41.getValue().equals("ORANGE")) {
            val[40]="O";combo41.setValue("");combo41.getStyleClass().add("orange");
        }
    }

    public void combo42Changed(ActionEvent event) {

        combo42.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo42.getValue().equals("RED")) {
            val[41]="R";combo42.setValue("");combo42.getStyleClass().add("red");
        } else if (combo42.getValue().equals("WHITE")) {
            val[41]="W";combo42.setValue("");combo42.getStyleClass().add("white");
        } else if (combo42.getValue().equals("YELLOW")) {
            val[41]="Y";combo42.setValue("");combo42.getStyleClass().add("yellow");
        } else if (combo42.getValue().equals("GREEN")) {
            val[41]="G";combo42.setValue("");combo42.getStyleClass().add("green");
        } else if (combo42.getValue().equals("BLUE")) {
            val[41]="B";combo42.setValue("");combo42.getStyleClass().add("blue");
        } else if (combo42.getValue().equals("ORANGE")) {
            val[41]="O";combo42.setValue("");combo42.getStyleClass().add("orange");
        }
    }

    public void combo43Changed(ActionEvent event) {

        combo43.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo43.getValue().equals("RED")) {
            val[42]="R";combo43.setValue("");combo43.getStyleClass().add("red");
        } else if (combo43.getValue().equals("WHITE")) {
            val[42]="W";combo43.setValue("");combo43.getStyleClass().add("white");
        } else if (combo43.getValue().equals("YELLOW")) {
            val[42]="Y";combo43.setValue("");combo43.getStyleClass().add("yellow");
        } else if (combo43.getValue().equals("GREEN")) {
            val[42]="G";combo43.setValue("");combo43.getStyleClass().add("green");
        } else if (combo43.getValue().equals("BLUE")) {
            val[42]="B";combo43.setValue("");combo43.getStyleClass().add("blue");
        } else if (combo43.getValue().equals("ORANGE")) {
            val[42]="O";combo43.setValue("");combo43.getStyleClass().add("orange");
        }
    }

    public void combo44Changed(ActionEvent event) {

        combo44.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo44.getValue().equals("RED")) {
            val[43]="R";combo44.setValue("");combo44.getStyleClass().add("red");
        } else if (combo44.getValue().equals("WHITE")) {
            val[43]="W";combo44.setValue("");combo44.getStyleClass().add("white");
        } else if (combo44.getValue().equals("YELLOW")) {
            val[43]="Y";combo44.setValue("");combo44.getStyleClass().add("yellow");
        } else if (combo44.getValue().equals("GREEN")) {
            val[43]="G";combo44.setValue("");combo44.getStyleClass().add("green");
        } else if (combo44.getValue().equals("BLUE")) {
            val[43]="B";combo44.setValue("");combo44.getStyleClass().add("blue");
        } else if (combo44.getValue().equals("ORANGE")) {
            val[43]="O";combo44.setValue("");combo44.getStyleClass().add("orange");
        }
    }

    public void combo45Changed(ActionEvent event) {

        combo45.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo45.getValue().equals("RED")) {
            val[44]="R";combo45.setValue("");combo45.getStyleClass().add("red");
        } else if (combo45.getValue().equals("WHITE")) {
            val[44]="W";combo45.setValue("");combo45.getStyleClass().add("white");
        } else if (combo45.getValue().equals("YELLOW")) {
            val[44]="Y";combo45.setValue("");combo45.getStyleClass().add("yellow");
        } else if (combo45.getValue().equals("GREEN")) {
            val[44]="G";combo45.setValue("");combo45.getStyleClass().add("green");
        } else if (combo45.getValue().equals("BLUE")) {
            val[44]="B";combo45.setValue("");combo45.getStyleClass().add("blue");
        } else if (combo45.getValue().equals("ORANGE")) {
            val[44]="O";combo45.setValue("");combo45.getStyleClass().add("orange");
        }
    }

    public void combo46Changed(ActionEvent event) {

        combo46.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo46.getValue().equals("RED")) {
            val[45]="R";combo46.setValue("");combo46.getStyleClass().add("red");
        } else if (combo46.getValue().equals("WHITE")) {
            val[45]="W";combo46.setValue("");combo46.getStyleClass().add("white");
        } else if (combo46.getValue().equals("YELLOW")) {
            val[45]="Y";combo46.setValue("");combo46.getStyleClass().add("yellow");
        } else if (combo46.getValue().equals("GREEN")) {
            val[45]="G";combo46.setValue("");combo46.getStyleClass().add("green");
        } else if (combo46.getValue().equals("BLUE")) {
            val[45]="B";combo46.setValue("");combo46.getStyleClass().add("blue");
        } else if (combo46.getValue().equals("ORANGE")) {
            val[45]="O";combo46.setValue("");combo46.getStyleClass().add("orange");
        }
    }

    public void combo47Changed(ActionEvent event) {

        combo47.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo47.getValue().equals("RED")) {
            val[46]="R";combo47.setValue("");combo47.getStyleClass().add("red");
        } else if (combo47.getValue().equals("WHITE")) {
            val[46]="W";combo47.setValue("");combo47.getStyleClass().add("white");
        } else if (combo47.getValue().equals("YELLOW")) {
            val[46]="Y";combo47.setValue("");combo47.getStyleClass().add("yellow");
        } else if (combo47.getValue().equals("GREEN")) {
            val[46]="G";combo47.setValue("");combo47.getStyleClass().add("green");
        } else if (combo47.getValue().equals("BLUE")) {
            val[46]="B";combo47.setValue("");combo47.getStyleClass().add("blue");
        } else if (combo47.getValue().equals("ORANGE")) {
            val[46]="O";combo47.setValue("");combo47.getStyleClass().add("orange");
        }
    }

    public void combo48Changed(ActionEvent event) {

        combo48.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo48.getValue().equals("RED")) {
            val[47]="R";combo48.setValue("");combo48.getStyleClass().add("red");
        } else if (combo48.getValue().equals("WHITE")) {
            val[47]="W";combo48.setValue("");combo48.getStyleClass().add("white");
        } else if (combo48.getValue().equals("YELLOW")) {
            val[47]="Y";combo48.setValue("");combo48.getStyleClass().add("yellow");
        } else if (combo48.getValue().equals("GREEN")) {
            val[47]="G";combo48.setValue("");combo48.getStyleClass().add("green");
        } else if (combo48.getValue().equals("BLUE")) {
            val[47]="B";combo48.setValue("");combo48.getStyleClass().add("blue");
        } else if (combo48.getValue().equals("ORANGE")) {
            val[47]="O";combo48.setValue("");combo48.getStyleClass().add("orange");
        }
    }

    public void combo49Changed(ActionEvent event) {

        combo49.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo49.getValue().equals("RED")) {
            val[48]="R";combo49.setValue("");combo49.getStyleClass().add("red");
        } else if (combo49.getValue().equals("WHITE")) {
            val[48]="W";combo49.setValue("");combo49.getStyleClass().add("white");
        } else if (combo49.getValue().equals("YELLOW")) {
            val[48]="Y";combo49.setValue("");combo49.getStyleClass().add("yellow");
        } else if (combo49.getValue().equals("GREEN")) {
            val[48]="G";combo49.setValue("");combo49.getStyleClass().add("green");
        } else if (combo49.getValue().equals("BLUE")) {
            val[48]="B";combo49.setValue("");combo49.getStyleClass().add("blue");
        } else if (combo49.getValue().equals("ORANGE")) {
            val[48]="O";combo49.setValue("");combo49.getStyleClass().add("orange");
        }
    }

    public void combo50Changed(ActionEvent event) {

        combo50.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo50.getValue().equals("RED")) {
            val[49]="R";combo50.setValue("");combo50.getStyleClass().add("red");
        } else if (combo50.getValue().equals("WHITE")) {
            val[49]="W";combo50.setValue("");combo50.getStyleClass().add("white");
        } else if (combo50.getValue().equals("YELLOW")) {
            val[49]="Y";combo50.setValue("");combo50.getStyleClass().add("yellow");
        } else if (combo50.getValue().equals("GREEN")) {
            val[49]="G";combo50.setValue("");combo50.getStyleClass().add("green");
        } else if (combo50.getValue().equals("BLUE")) {
            val[49]="B";combo50.setValue("");combo50.getStyleClass().add("blue");
        } else if (combo50.getValue().equals("ORANGE")) {
            val[49]="O";combo50.setValue("");combo50.getStyleClass().add("orange");
        }
    }

    public void combo51Changed(ActionEvent event) {

        combo51.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo51.getValue().equals("RED")) {
            val[50]="R";combo51.setValue("");combo51.getStyleClass().add("red");
        } else if (combo51.getValue().equals("WHITE")) {
            val[50]="W";combo51.setValue("");combo51.getStyleClass().add("white");
        } else if (combo51.getValue().equals("YELLOW")) {
            val[50]="Y";combo51.setValue("");combo51.getStyleClass().add("yellow");
        } else if (combo51.getValue().equals("GREEN")) {
            val[50]="G";combo51.setValue("");combo51.getStyleClass().add("green");
        } else if (combo51.getValue().equals("BLUE")) {
            val[50]="B";combo51.setValue("");combo51.getStyleClass().add("blue");
        } else if (combo51.getValue().equals("ORANGE")) {
            val[50]="O";combo51.setValue("");combo51.getStyleClass().add("orange");
        }
    }

    public void combo52Changed(ActionEvent event) {

        combo52.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo52.getValue().equals("RED")) {
            val[51]="R";combo52.setValue("");combo52.getStyleClass().add("red");
        } else if (combo52.getValue().equals("WHITE")) {
            val[51]="W";combo52.setValue("");combo52.getStyleClass().add("white");
        } else if (combo52.getValue().equals("YELLOW")) {
            val[51]="Y";combo52.setValue("");combo52.getStyleClass().add("yellow");
        } else if (combo52.getValue().equals("GREEN")) {
            val[51]="G";combo52.setValue("");combo52.getStyleClass().add("green");
        } else if (combo52.getValue().equals("BLUE")) {
            val[51]="W";combo52.setValue("");combo52.getStyleClass().add("blue");
        } else if (combo52.getValue().equals("ORANGE")) {
            val[51]="O";combo52.setValue("");combo52.getStyleClass().add("orange");
        }
    }

    public void combo53Changed(ActionEvent event) {

        combo53.getStyleClass().removeAll("blue","red","green","orange","yellow","white");

        if (combo53.getValue().equals("RED")) {
            val[52]="R";combo53.setValue("");combo53.getStyleClass().add("red");
        } else if (combo53.getValue().equals("WHITE")) {
            val[52]="W";combo53.setValue("");combo53.getStyleClass().add("white");
        } else if (combo53.getValue().equals("YELLOW")) {
            val[52]="Y";combo53.setValue("");combo53.getStyleClass().add("yellow");
        } else if (combo53.getValue().equals("GREEN")) {
            val[52]="G";combo53.setValue("");combo53.getStyleClass().add("green");
        } else if (combo53.getValue().equals("BLUE")) {
            val[52]="B";combo53.setValue("");combo53.getStyleClass().add("blue");
        } else if (combo53.getValue().equals("ORANGE")) {
            val[52]="O";combo53.setValue("");combo53.getStyleClass().add("orange");
        }
    }

    public void combo54Changed(ActionEvent event) {

        combo54.getStyleClass().removeAll("blue","red","green","orange","yellow","white");
        if (combo54.getValue().equals("RED")) {
            val[53]="R";combo54.setValue("");combo54.getStyleClass().add("red");
        } else if (combo54.getValue().equals("WHITE")) {
            val[53]="W";combo54.setValue("");combo54.getStyleClass().add("white");
        } else if (combo54.getValue().equals("YELLOW")) {
            val[53]="Y";combo54.setValue("");combo54.getStyleClass().add("yellow");
        } else if (combo54.getValue().equals("GREEN")) {
            val[53]="G";combo54.setValue("");combo54.getStyleClass().add("green");
        } else if (combo54.getValue().equals("BLUE")) {
            val[53]="B";combo54.setValue("");combo54.getStyleClass().add("blue");
        } else if (combo54.getValue().equals("ORANGE")) {
            val[53]="O";combo54.setValue("");combo54.getStyleClass().add("orange");
        }
    }

    public void input() throws IOException {
        Solver obj=new Solver();
        rubik[0][0][0] = val[9]+val[42]+val[2];
        rubik[0][0][1] = val[10]+val[43];
        rubik[0][0][2] = val[11]+val[44]+val[18];
        rubik[0][1][0] = val[12]+val[5];
        rubik[0][1][1] = val[13];
        rubik[0][1][2] = val[14]+val[21];
        rubik[0][2][0] = val[15]+val[45]+val[8];
        rubik[0][2][1] = val[16]+val[46];
        rubik[0][2][2] = val[17]+val[47]+val[24];
        rubik[1][0][0] = val[39]+val[1];
        rubik[1][0][1] = val[40];
        rubik[1][0][2] = val[41]+val[19];
        rubik[1][1][0] = val[4];
        rubik[1][1][2] = val[22];
        rubik[1][2][0] = val[48]+val[7];
        rubik[1][2][1] = val[49];
        rubik[1][2][2] = val[50]+val[25];
        rubik[2][0][0] = val[29]+val[36]+val[0];
        rubik[2][0][1] = val[28]+val[37];
        rubik[2][0][2] = val[27]+val[38]+val[20];
        rubik[2][1][0] = val[32]+val[3];
        rubik[2][1][1] = val[31];
        rubik[2][1][2] = val[30]+val[23];
        rubik[2][2][0] = val[35]+val[51]+val[6];
        rubik[2][2][1] = val[34]+val[52];
        rubik[2][2][2] = val[33]+val[53]+val[26];


        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(i==1&&j==1&&k==1)
                        continue;
                    System.out.print(rubik[i][j][k]+"  ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }

        StringTokenizer st=new StringTokenizer("RYB RY RYG RB R RG RWB RW RWG YB Y YG B G WB W WG OYB OY OYG OB O OG OWB OW OWG");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(i==1&&j==1&&k==1)
                        continue;
                    rubik2[i][j][k]=st.nextToken();
                }
            }
        }
        obj.input();
    }

}
