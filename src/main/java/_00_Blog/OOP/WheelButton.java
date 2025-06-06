package _00_Blog.OOP;

public abstract class WheelButton implements Press, Up, Down {
    @Override
    public abstract String onPressed();

    @Override
    public abstract void OnDown();

    @Override
    public abstract void OnUp();
}
