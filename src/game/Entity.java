package game;

import graphics.Draw;
import graphics.Texture;

public abstract class Entity {

    protected final Texture texture;
    protected final int width;
    protected final int height;

    public Entity(Texture texture, float x, float y, int width, int height) {

        this.texture = texture;
        this.width = width;
        this.height = height;
    }

    public void input() {
        input(null);
    }

    /**
     * Handles the input of the entity
     *
     * @param entity The entity which is being input (red, yellow, blue)
     */
    public abstract void input(Entity entity);

    /**
     * Updates the entity.
     */
    public void update() {

    }

    /**
     * Renders the entity.
     *
     * param renderer Renderer for batching
     * @param deltaFilledAmount    The previous filled amount //probably won't work because this class isn't specific to vats
     */
    public void render(Draw drawer, int deltaFilledAmount) {
        drawer.drawTextureRegion(texture, width, height, deltaFilledAmount);
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
