package demo;

public class Map {
	
	// char can stack in as many N dimensions as you provide it, 
	// with N being how many [] is added. since raycasting is 2D logically,
	// [], for String[] allows for stacking in 1D

	// to reference this, you need to use Map.map1[Y].charAt(X); from any class.
	// this is just an example, can be changed.
	// this is scalable, so we can have map1, map2, etc...
	
	// raycasting can still have 3D like objects,
	// by adjusting how high each wall renders, and rendering a floor as high as wall height,
	// it makes a slab-like object, that can be used for stairs.

	// player can also have height (kinda), thats described in README.md
	
	public static String[] map1 = {
			"#############",
			"#-----------#",
			"#-----------#",
			"#-----------#",
			"#-----------#",
			"#############",
	};
	
	public static void m_init() {
		

	}

}
