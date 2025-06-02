package _00_Blog.OOP;

public abstract class WheelButton implements Press, Up, Down {
    @Override
    public abstract void OnPressed();

    @Override
    public void OnDown() {

    }

    @Override
    public void OnUp() {

    }
}
