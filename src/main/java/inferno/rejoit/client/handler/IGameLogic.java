package inferno.rejoit.client.handler;

import inferno.rejoit.client.controls.MouseInput;
import inferno.rejoit.client.rendering.Window;

public interface IGameLogic {

    void init(Window window) throws Exception;

    void input(Window window, MouseInput mouseInput);

    void update(float interval, MouseInput mouseInput);

    void render(Window window);

    void cleanup();
}
