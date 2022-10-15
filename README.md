<h1 align="center">Create Shapes- Java GUI</h1>


<h2>Implementation</h2> </br>
The assignment's primary purpose was to develop a single Java programme with a
Graphical User Interface (GUI). A GUI is a type of user interface that enables users
to interact with electronic devices using graphical icons and audio indications, such
as primary notation, rather than through text-based user interfaces, printed
command labels, or text navigation. GUIs were developed in response to the
perceived big learning curve associated with command-line interfaces (CLIs), which
demand users to write instructions on a computer keyboard. [1]. In the majority of
circumstances, actions in a graphical user interface are performed directly on the
graphical components [2].
The GUI for this assignment must receive user input and render a 2D object
depending on it. This is performed by utilising the JavaFX graphics package (see
Figure 1). This package contains all the required graphics tools and components for
constructing the type of graphical user interfaces that is expected from modern
programmes [3]. A JavaFX programme is referred to as an application. 

<h2>Stage</h2></br>
A stage is the top-level window in which programme operates (see Figure 2). This
Stage object represents the JavaFX application's main window. It can be used to
build more Stage objects later in the life of programme if it requires additional
windows [3]. The import clauses, which demonstrate that all of our classes originate
from the package javafx, which has several sub packages, including scene and
stage.

<h2>Scene</h2></br>
A scene is the physical representation of the contents of a JavaFX application. It
holds the whole of a scene graph's contents [3] (see Figure 3). The scene object is
represented by the class Scene in the package javafx. scene. in this project.

<h2>VBox</h2></br>
The JavaFX VBox component is a layout component that arranges all of its child
nodes (components) vertically, one above the other. The class javafx denotes the
JavaFX VBox component [3] (see Figure 4).


<h1>Component 1</h1><br>
<h2>Controls</h2><br>
Controls. JavaFX controls are JavaFX components that provide control capability to
JavaFX applications. For example, a button, a radio button, a table, or a tree. To be
visible, a control must be linked to the scene graph of another Scene object [3]. In
response to that, the source code includes a text field, a button, and a label.


<h3>setOnAction</h3><br>
A straightforward button control. The button control might be text-based or graphicbased. An ActionEvent is issued whenever a button is pushed and released. By
adding an EventHandler to handle the ActionEvent, the application may take some
action in response to it. Buttons may also react to mouse events by implementing a
MouseEventHandler [5]. For this assignment, one of the rules was that the user had
to fill in the information and then click to move on to the next step.

<h3>If/else</h3><br>
To meet the requirements in the brief, if-else was used (see Figure 7). The if-else
statement is used to execute both the true and false conditions in a given statement.
If the condition is true, the code contained in the if block is run; if the condition is
false, the code included in the else block is executed [4]. Each shape having three,
four, five, or six sides (triangle, rectangle, pentagon, or hexagon, respectively), has
been built and placed in if/else statements. If invalid number was typed in, an error
message asked the user to enter the correct number.


<h3>Root.getChildren</h3><br>
To correctly represent the shape, root1.getChildren.add() was used.

<h3>Get colour</h3><br>
To guarantee that shapes are coloured correctly after selecting the proper number,
.setFill(Color.BLUE/GREY) was used. Blue was used for shapes with
an even number of sides and grey for those with an odd number of sides.


<h2>Error alert</h2><br>
This programme must provide feedback when the user enters an invalid value. The
if/else statement was used in conjunction with errorAlert. Alerts are
pre-set dialogue boxes that provide information to the user. ERROR alert: The
ERROR alert type modifies the appearance of the Alert dialogue to indicate that
something has gone wrong [3].


<h2>Launch the application</h2><br>
launch() is a static function included inside the Application class. This method
initialises the JavaFX runtime environment and the JavaFX application. The launch()
function will recognise the class from which it is called and will not need to provide
the class to launch directly [3].


<h1>Component 2</h1><br>
<h2>Controls</h2><br>
After the main shape has been shown, a new label, button, and text field are added.
It was introduced after each main selection. The user is prompted to input a number
that is higher or lower by 1.

<h3>If/else</h3><br>
To guarantee that the requirements of displaying another shape in component 2 are
achieved, nesting of if/else statements is implemented. Nesting is
the process of enclosing one structure inside another.


<h3>Root.get Children/setVisible()</h3><br>
When a valid number is received, a new shape is presented, and the old one is
removed. This is accomplished via the use of root1.getChildren (). Add a new shape
and an existing shape. setVisible(false).


<h3>Incorrect input</h3><br>
If the user enters an incorrect number or number is too high/too low, an error notice
is shown, and the user is prompted to provide the right number.


<h1>Functionality and testing:</h1><br>
<h2>Component 1</h2><br>
A text field, label, and button have been developed to inform the user of the desired
action and what information to enter. Users may enter any number between three
and six, inclusive. The software then generates a shape with the specified number of
sides. However, if the input number is less than 3 or greater than 6, an error notice is
displayed on the main screen. When a number between 4-6 is inputted, the main
screen displays one of the two-dimensional forms. If the number of sides is even, the
active shape is grey; if the number is odd, the active shape is blue.

<h2>Component 2</h2><br>
The second component is concerned with changing the form by reducing or
increasing the number of sides by one. If the user input is valid, the shape will
change. If the number is invalid, however, an error notice is displayed. Once more,
shapes with an even number of sides are grey, while those with an odd number of
sides are blue. Once the new shape has been shown, the previous one is rendered
invisible with the setVisible (false). If/else statements are used to guarantee that a
condition is met (see Figure 18,19 and 21).

![Screenshot 2022-10-15 at 14 25 26](https://user-images.githubusercontent.com/93612678/195989463-e8b1e331-605b-4e70-a40b-5c3e31ca17f0.png)

![Screenshot 2022-10-15 at 14 25 55](https://user-images.githubusercontent.com/93612678/195989468-551a2755-ca64-4226-b73f-6872397031a0.png)


