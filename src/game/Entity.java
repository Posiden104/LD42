package game;

import graphics.Texture;

public abstract class Entity {

    protected final Texture texture;
    protected final int width;
    protected final int height;
    protected int filledAmount;

    public Entity(Texture texture, float x, float y, int width, int height, int filledAmount) {

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
     * @param alpha    Alpha value, needed for interpolation
     */
    public void render(float alpha) {
        // renderer.drawTextureRegion(texture, x, y, tx, ty, width, height, color);
    }

    public void setFilledAmount(int amount) {
        this.filledAmount = amount;
    }

    public int getFilledAmount() {
        return filledAmount;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
