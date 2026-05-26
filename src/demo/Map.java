package demo;

public class Map {
	

	// char can stack in as many N dimensions as you provide it, 
	// with N being how many [] is added. since raycasting is 2D logically,
	// [][], for char[][] allows for stacking in 2D

	// to reference this, you need to use Map.mesh[X][Y]; from any class.
	
	public static char[][] mesh = {
			{'#', '#', '#', '#', '#', '#', '#', '#'},
			{'#', '-', '-', '-', '-', '-', '-', '#'},
			{'#', '-', '-', '-', '-', '-', '-', '#'},
			{'#', '-', '-', '-', '-', '-', '-', '#'},
			{'#', '-', '-', '-', '-', '-', '-', '#'},
			{'#', '#', '#', '#', '#', '#', '#', '#'}
	};
	
	public static void m_init() {
		

	}

}
