# 3D Game
Noah and Dane's 3d game

# Note for Dane:

Thanks for making a base, I added a bit more and changed a few things. Feel free to rename any variables or do what ever you want to the code.

# Question for Dane:

When using raycast, can a player look up and down or only left and right?

Thats the main limitation of raycasting, you can only look left and right. 
While technically possible for player to look up and down. The rendering of walls is scuffed, and doesnt have the normal perspective distortion.

# Next

Should we use Map.class feature of mesh? or instantiate all walls and game objects in Game.class?
We would also have to cast rays from players position either way. For a game like this, since each tile acts as a game object,
It would be convoluted to instantiate each tile. 
