# Team 7 PacMan Project
_Group members: Priscila Kozlov, Michelle Fang, Emily Son, Andrew Cheng_

## Image playing PacMan
![](playing_game.png)

## How to run the code from the command line
```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

## List of functions & tests:
### Pacman Class

1. `get_valid_moves()` This function was written by Michelle. I create a new location in each possible direction the pacman can move. Then, I use the Map class's `getLoc()` function to make sure that new location is valid. If so, that location gets added to the Arraylist to return. The test for this checks that certain locations are contained in the returned ArrayList. 

2. `move()` This function was written by Emily. I first check that valid moves exist for pacman and choose a random move from the list of valid moves to move using a random number generator. If no valid moves exist, the function returns false. The map is updated with pacman's move and pacman moves by calling move() in Map. Pacman's location is then updated to the new, moved location. The function returns true. The test checks that the appropriate boolean value was returned.  

3. `is_ghost_in_range()` This function was written by Priscila. I got the location of pacman and added 1 to x and y in all posible combinations to check for posible ghost locations. I passed all the posible locations into the getLoc function and checked if the function found a ghost. I returned true if a ghost was found.

4. `consume()` This function was written by Andrew. I first check if pacman's current location contains a cookie. If so, then the map class's eatCookie function is called with pacman's name as the parameter and the return value of this function is returned. Otherwise, null is returned.

### Ghost Class

1. `get_valid_moves()` This function was written by Michelle. I create a new location in each possible direction the pacman can move. Then, I use the Map class's `getLoc()` function to make sure that new location is valid. If so, that location gets added to the Arraylist to return. The test for this checks that certain locations are contained in the returned ArrayList. 

2. `move()` This function was written by Emily. I first check that valid moves exist for the ghost and choose a random move from the list of valid moves to move using a random number generator. If no valid moves exist, the function returns false. The map is updated with the ghost's move and the ghost moves by calling move() in Map. The ghost's location is then updated to the new, moved location. The function returns true. The test checks that the appropriate boolean value was returned.

3. `is_pacman_in_range()` This function was written by Priscila. I got the location of Ghost and added 1 to x and y in all posible combinations to check for the posible locations of pacman. I passed all the posible locations into the getLoc function and checked if the function found pacman. I return true if packman is found.

4. `attack()` This function was written by Andrew. I first check if pacman is in range of the ghost by calling is_pacman_in_range. If so, then the map class's attack function is called with the ghost's name as the parameter and the return value of this function is returned. Otherwise, false is returned.

### Map Class

1. `move()` This function was written by Michelle. I modified the locations, components, and field variables to reflect the new movement. If the entity was never there in the first place, it cannot be moved and this function returns false. The test checks for one valid and one invalid move. 

2. `getLoc()` This function was written by Emily. I check that the parameter and entity at the location are not null. If null, the emptySet is returned. If the entity at the location is empty or a wall, the emptySet or wallSet is returned. Else, the entity, which is a HashSet, is returned. The test places Pacman at a location and checks that Pacman is returned at those coordinates. 

3. `attack()` This function was written by Priscila. I got the location of Ghost and added 1 to x and y in all posible combinations to check for the posible locations of pacman. I passed all the posible locations into the getLoc function and checked if the function found pacman. If pacman is found I set the variable gameOver to True and return True.

4. `eatCookie()` This function was written by Andrew. Since the function is assumed to have been called only if there is a valid cookie at pacman's location, the cookie is removed from the map, the number of cookies is decremented, and the component and locations fields of the map are updated. Finally, the component that was removed is returned.