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

4. 'consume()' This function was written by Andrew. I first check if pacman's current location contains a cookie. If so, then the map class's eatCookie function is called with pacman's name as the parameter and the return value of this function is returned. Otherwise, null is returned.

### Ghost Class

1. `get_valid_moves()` This function was written by Michelle. I create a new location in each possible direction the pacman can move. Then, I use the Map class's `getLoc()` function to make sure that new location is valid. If so, that location gets added to the Arraylist to return. The test for this checks that certain locations are contained in the returned ArrayList. 

4. 'attack()' This function was written by Andrew. I first check if pacman is in range of the ghost by calling is_pacman_in_range. If so, then the map class's attack function is called with the ghost's name as the parameter and the return value of this function is returned. Otherwise, false is returned.

### Map Class

1. `move()` This function was written by Michelle. I modified the locations, components, and field variables to reflect the new movement. If the entity was never there in the first place, it cannot be moved and this function returns false. The test checks for one valid and one invalid move. 

4. 'eatCookie()' This function was written by Andrew. Since the function is assumed to have been called only if there is a valid cookie at pacman's location, the cookie is removed from the map, the number of cookies is decremented, and the component and locations fields of the map are updated. Finally, the component that was removed is returned.