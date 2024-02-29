# TeachMeSkills_C27_Lesson_15_HW
Homework for lesson #15

1. **Task #1**

The program allows you to create a collection of integers and fill it with values ​​entered from the keyboard. 
The program contains:
- Class **"Logic"** with private constructor which does not allow creating objects of this class;
- Class **"Logic"** which contains static void method **"logicImplementations"** to creating a collection consisting of integers, to casting the "String" type to the "Integer" type and adding the integers entered from the console to the collection and to display even numbers on the screen;
- Class **"Runner"** which runs the program and calls the method **"logicImplementations"**.

2. **Task #2**

The program creates a collection of geometric shapes, calculates their perimeter and displays the result on the screen.
The program contains:
- Abstract sealed class **"Figure"** which contains field **"name"**, one constrictor, abstract method **"calculatePerimeter"** to perimeter calculation and overridden method **"toString"**;
- Final class **"Circle"** which extends class **"Figure"**;
- Final class **"Rectangle"** which extends class **"Figure"**;
- Final class **"Triangle"** which extends class **"Figure"**;
- Interface **"Const"** for storing constants (in our case the constants PI);
- Class **"Runner"** which runs the program, in this class are being created figure objects, collection and adding figures to it and this class calls the method **"calculatePerimeter"**.

3. **Task #3**

The program creates a collection of integers, fills it with random numbers and calculates and displays the arithmetic mean of all elements of the collection (the collection size is entered from the keyboard).
The program contains:
- Class **"Calculation"** which contains static void method "logicImplementations" to creating a collection with random integer values and to calculating the arithmetic mean of all elements of the collection and displaying the result on the screen;
- Class **"Calculation"** with private constructor which does not allow creating objects of this class;
- Class **"Runner"**  which runs the program and calls the method **"logicImplementations"**.

4. **Task #4**

The program creates a collection of unique names of all students in the group "TeachMeSkills C_27_onl" + instructor and displays the collection on the screen.
The program contains:
- Class **"Group"** for the names of people in the group, which contains field **"name"**, contains one constructor;
- Class **"Group"** in which methods overridden: **"equals"**, **"hashCode"**, **"toString"**;
- Class **"GroupList"** which contains static method to creating a list of names of students + instructor;
- Class **"Runner"**  which runs the program and calls the method **"creatingList"**.







