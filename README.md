# 3D Game
Noah and Dane's 3d game


# Note for Noah:

Since we want this game to feel 3D, soon we should add a height vector to the player,

how raycasts work in a nutshell, is that when a ray is shot from the players point of origin,

it measures how far that is, and draws a wall. so if a wall is far, it draws wall small on screen.

usually you draw like 10 - 15 raycasts (maybe even higher) for multiple walls to render at once.

to add height, we just need to see based on how far away the walls are according to each raycast, 

and height of player in float, that way it makes the walls and any objects have the parallax effect.


