package core;

import graphics.Draw;
import graphics.Window;
import org.lwjgl.Version;

import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;

public class Game {

    private Draw draw;
    private Window window;

    private boolean running = true;

    private void run() {
        System.out.println("Hello LWJGL " + Version.getVersion() + "!");

        init();
        loop();

        // Free the window callbacks and destroy the window
        glfwFreeCallbacks(window.getWindow());
        glfwDestroyWindow(window.getWindow());

        // Terminate GLFW and free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    private void init() {
        running = true;
        window = new Window();
        draw = new Draw();
    }

    private void update() {
        // Checks for closing the window
        glfwPollEvents();
    }

    private void loop() {
        while (running) {
            update();
            draw.draw(window.getWindow());

            if (glfwWindowShouldClose(window.getWindow())) {
                System.out.println("I'm closing the application");
                running = false;
            }
        }
    }

    public static void main(String[] args) {
        new Game().run();
    }
}
