import javafx.application.Application;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class Shapes extends Application {




    @Override
    public void start(Stage stage) {

        //text field to create a shape
        TextField shapeField = new TextField();
        shapeField.setMaxWidth(200);


        //label so user knows what to do
        Label shapeLabel = new Label("Enter a number from 3-6 ");
        shapeLabel.setTextFill(Color.GREEN);
        shapeLabel.setFont(Font.font("SERIF", 24));



        //button to submit number
        Button shapeButton = new Button();
        shapeButton.setText("Draw your shape");

        //created a VBox for the components
        VBox root1 = new VBox(25);
        root1.setAlignment(Pos.CENTER);
        root1.getChildren().addAll(shapeLabel, shapeField, shapeButton);


        //created a scene and added to stage
        Scene scene1 = new Scene(root1, 600, 600);
        stage.setScene(scene1);
        stage.setTitle("Shapes");
        stage.show();

        shapeButton.setOnAction(e -> {
            //check input, if input is valid and display shape

            //draw triangle if entered "3"
            if (shapeField.getText().equals("3")) {

                Polygon triangle = new Polygon();

                triangle.getPoints().setAll(

                        100d, 100d,
                        150d, 50d,
                        250d, 150d

                );
                //colour blue, if no. sides is odd
                triangle.setFill(Color.BLUE);

                //display triangle
                root1.getChildren().add(triangle);


                //remove the text field and button
                root1.getChildren().removeAll(shapeLabel, shapeField, shapeButton);

                //new label for component 2
                Label newLabel = new Label("Enter number higher by 1 than previous");
                newLabel.setTextFill(Color.GREEN);
                newLabel.setFont(Font.font("Serif", 24));

                //text field for new number, lower or higher by  1
                TextField newField = new TextField();
                newField.setMaxWidth(200);

                //button to submit number
                Button newButton = new Button();
                newButton.setText("Change shape!");

                //add question about next shape, lower by 1 or higher by 1 (Component 2)
                root1.getChildren().addAll(newLabel, newField, newButton);

                //change shape
                newButton.setOnAction(e1 -> {

                    //if user input "4", display rectangle
                    if (newField.getText().equals("4")) {

                        Rectangle rectangle = new Rectangle(200, 100);
                        rectangle.setX(100.0f);
                        rectangle.setY(100.0f);
                        rectangle.setFill(Color.GREY);
                        root1.getChildren().add(rectangle);



                        //removed the text field and button
                        root1.getChildren().removeAll(shapeLabel, shapeField, shapeButton);


                        //if correct number, set the question to invisible
                        if (newField.getText().equals("4")) {
                            triangle.setVisible(false);
                            root1.getChildren().removeAll(newLabel, newField, newButton);

                        };

                        //if user input is "2", display error message (limit is 3)
                    } else if (newField.getText().equals("2")) {
                        Alert errorAlert = new Alert(AlertType.ERROR);
                        errorAlert.setHeaderText("Sorry. Can't create a shape from 2");
                        errorAlert.setContentText("Please try higher by 1.");
                        errorAlert.showAndWait();

                        //if user input is different, display error message
                    } else {
                        Alert errorAlert = new Alert(AlertType.ERROR);
                        errorAlert.setHeaderText("Invalid number");
                        errorAlert.setContentText("Please try higher by just 1.");
                        errorAlert.showAndWait();
                    }

                });





                //draw rectangle
            } else if (shapeField.getText().equals("4")) {

                Rectangle rectangle = new Rectangle(200, 100);
                rectangle.setX(100.0f);
                rectangle.setY(100.0f);
                rectangle.setFill(Color.GREY);


                //display rectangle
                root1.getChildren().add(rectangle);



                //remove the text field and button
                root1.getChildren().removeAll(shapeLabel, shapeField, shapeButton);

                //new label to ask user to put another number
                Label newLabel = new Label("Enter number higher or 1 lower than previous");
                newLabel.setTextFill(Color.GREEN);
                newLabel.setFont(Font.font("Serif", 24));

                //text field for number
                TextField newField = new TextField();
                newField.setMaxWidth(200);

                //button to submit number
                Button newButton = new Button();
                newButton.setText("Change shape!");


                root1.getChildren().addAll(newLabel, newField, newButton);

                //change shape
                newButton.setOnAction(e1 -> {
                    if (newField.getText().equals("5")) {

                        //if the number is "5", display polygon5
                        Polygon polygon5 =new Polygon();
                        polygon5.getPoints().addAll(new Double[]{
                                20.0, 30.0,
                                30.0, 60.0,
                                70.0, 60.0,
                                80.0, 30.0,
                                50.0, 10.0,
                        });
                        root1.getChildren().add(polygon5);
                        polygon5.setFill(Color.BLUE);


                        //remove the text field and button
                        root1.getChildren().removeAll(shapeLabel, shapeField, shapeButton);


                        //if correct number, delete the question
                        if (newField.getText().equals("5")) {
                            rectangle.setVisible(false);
                            root1.getChildren().removeAll(newLabel, newField, newButton);


                        };

                        //if the number is "3", display triangle
                    } else if (newField.getText().equals("3")) {

                        Polygon triangle = new Polygon();

                        triangle.getPoints().setAll(

                                100d, 100d,
                                150d, 50d,
                                250d, 150d

                        );

                        triangle.setFill(Color.BLUE);

                        //display triangle
                        root1.getChildren().add(triangle);
                        rectangle.setVisible(false);
                        root1.getChildren().removeAll(newLabel, newField, newButton);

                        //if the number is higher/lower then just by one, error message
                    } else {
                        Alert errorAlert = new Alert(AlertType.ERROR);
                        errorAlert.setHeaderText("Invalid number");
                        errorAlert.setContentText("Please try higher or lower by just 1.");
                        errorAlert.showAndWait();
                    }

                });


                //draw pentagon
            } else if (shapeField.getText().equals("5")) {
                Polygon polygon5 =new Polygon();
                polygon5.getPoints().addAll(new Double[]{
                        20.0, 30.0,
                        30.0, 60.0,
                        70.0, 60.0,
                        80.0, 30.0,
                        50.0, 10.0,
                });

                //display pentagon
                root1.getChildren().add(polygon5);
                polygon5.setFill(Color.BLUE);

                //remove the text field and button
                root1.getChildren().removeAll(shapeLabel, shapeField, shapeButton);

                //new label to ask user to put another number
                Label newLabel = new Label("Enter number higher by 1 or lowe by 1 than previous");
                newLabel.setTextFill(Color.GREEN);
                newLabel.setFont(Font.font("Serif", 24));

                //create a text field for new number
                TextField newField = new TextField();
                newField.setMaxWidth(200);

                //add a button to submit number
                Button newButton = new Button();
                newButton.setText("Change shape!");


                root1.getChildren().addAll(newLabel, newField, newButton);

                //change shape
                newButton.setOnAction(e1 -> {
                    if (newField.getText().equals("4")) {
                        //if entered number is "4", display rectangle
                        Rectangle rectangle = new Rectangle(200, 100);
                        rectangle.setX(100.0f);
                        rectangle.setY(100.0f);
                        rectangle.setFill(Color.GREY);
                        root1.getChildren().add(rectangle);


                        // remove the text field and button
                        root1.getChildren().removeAll(shapeLabel, shapeField, shapeButton);


                        //if correct number, delete the question
                        if (newField.getText().equals("4")) {
                            polygon5.setVisible(false);
                            root1.getChildren().removeAll(newLabel, newField, newButton);

                        };

                        //if entered number is "6", display polygon6
                    } else if (newField.getText().equals("6")) {

                        Polygon polygon6 =new Polygon();
                        polygon6.getPoints().addAll(new Double[]{
                                200.0, 50.0,
                                400.0, 50.0,
                                450.0, 150.0,
                                400.0, 250.0,
                                200.0, 250.0,
                                150.0, 150.0,
                        });

                        // display
                        root1.getChildren().add(polygon6);
                        polygon6.setFill(Color.GREY);

                        //if correct number delete the polygon5
                        if (newField.getText().equals("6")) {
                            polygon5.setVisible(false);
                            root1.getChildren().removeAll(newLabel, newField, newButton);


                        };

                        //if the number is invalid, display error message
                    } else {
                        Alert errorAlert = new Alert(AlertType.ERROR);
                        errorAlert.setHeaderText("Invalid number");
                        errorAlert.setContentText("Please try higher or lower by just 1.");
                        errorAlert.showAndWait();
                    }

                });


                //draw hexagon
            } else if (shapeField.getText().equals("6")) {

                Polygon polygon6 =new Polygon();
                polygon6.getPoints().addAll(new Double[]{
                        200.0, 50.0,
                        400.0, 50.0,
                        450.0, 150.0,
                        400.0, 250.0,
                        200.0, 250.0,
                        150.0, 150.0,
                });

                // display
                root1.getChildren().add(polygon6);
                polygon6.setFill(Color.GREY);

                root1.getChildren().removeAll(shapeLabel, shapeField, shapeButton);

                Label newLabel = new Label("Enter number lower by 1 than previous");
                newLabel.setTextFill(Color.GREEN);
                newLabel.setFont(Font.font("Serif", 24));

                // create a text field for number
                TextField newField = new TextField();
                newField.setMaxWidth(200);

                // add a button to submit number
                Button newButton = new Button();
                newButton.setText("Change shape!");


                root1.getChildren().addAll(newLabel, newField, newButton);

                // change shape
                newButton.setOnAction(e1 -> {
                    if (newField.getText().equals("5")) {

                        Polygon polygon5 =new Polygon();

                        polygon5.getPoints().addAll(new Double[]{
                                20.0, 30.0,
                                30.0, 60.0,
                                70.0, 60.0,
                                80.0, 30.0,
                                50.0, 10.0,
                        });

                        root1.getChildren().add(polygon5);
                        polygon5.setFill(Color.BLUE);
                        polygon6.setVisible(false);

                        root1.getChildren().removeAll(shapeLabel, shapeField, shapeButton);


                        //if correct number, delete the question
                        if (newField.getText().equals("4")) {
                            polygon5.setVisible(false);
                            root1.getChildren().removeAll(newLabel, newField, newButton);

                        };

                        // alert message, 6 is the limit
                    } else if (newField.getText().equals("7")) {
                        Alert errorAlert = new Alert(AlertType.ERROR);
                        errorAlert.setHeaderText("Sorry. Can't create a shape from 7");
                        errorAlert.setContentText("Please try lower by 1.");
                        errorAlert.showAndWait();

                        //if the input is incorrect, error message
                    } else {
                        Alert errorAlert = new Alert(AlertType.ERROR);
                        errorAlert.setHeaderText("Invalid number");
                        errorAlert.setContentText("Please try lower by just 1.");
                        errorAlert.showAndWait();
                    }

                });

                //if invalid number, display error message
            } else {
                Alert errorAlert = new Alert(AlertType.ERROR);
                errorAlert.setHeaderText("Invalid number!");
                errorAlert.setContentText("Please try number from 3 to 6.");
                errorAlert.showAndWait();
            }

        });

    }

    //launch the application
    public static void main(String[] args) {

        launch(args);

    }
};
