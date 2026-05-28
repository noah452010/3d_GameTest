import org.lwjgl.opengl.GL11.*;
import org.lwjgl.glfw.*;

public class Window {
	public static void r_init(){
		
		// this fixes whatever bullshit compat issue under wayland
		// GLFW has some issue with wayland, so use,
		// XWayland or X11.
		
		GLFW.glfwInitHint(GLFW.GLFW_PLATFORM, GLFW.GLFW_PLATFORM_X11);
		
		// GLFW provides it's own init method
		
		GLFW.glfwInit();
		
		// created long window to create the window
		
		long window = GLFW.glfwCreateWindow(800, 600, "window", 0, 0);
		GLFW.glfwMakeContextCurrent(window);
		
		// this keeps GLFW from not closing
		
		while (!GLFW.glfwWindowShouldClose(window)) {
			GLFW.glfwPollEvents();
			
		
		}
	}
		
	public static void render(){
		
		}
	}

