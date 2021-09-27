# Team 7 PacMan Project
_Group members: Priscila Kozlov, Michelle Fang, Emily Son, Andrew Cheng_

## Image playing PacMan

## How to run the code from the command line
```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

## List of functions & tests:
### Pacman Class

1. `get_valid_moves()` This function was written by Michelle. I create a new location in each possible direction the pacman can move. Then, I use the Map class's `getLoc()` function to make sure that new location is valid. If so, that location gets added to the Arraylist to return. The test for this checks that certain locations are contained in the returned ArrayList. 

### Ghost Class

1. `get_valid_moves()` This function was written by Michelle. I create a new location in each possible direction the pacman can move. Then, I use the Map class's `getLoc()` function to make sure that new location is valid. If so, that location gets added to the Arraylist to return. The test for this checks that certain locations are contained in the returned ArrayList. 



### Map Class

1. `move()` This function was written by Michelle. I modify the locations, components, and field variables to reflect the new movement. If the entity was never there in the first place, it cannot be moved and this function returns false. The test checks for one valid and one invalid move. 
