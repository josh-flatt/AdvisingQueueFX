package net.incandescently.advisingqueuefx;

public abstract class MediatorController {
    protected static MainMenuController mainMenuController;
    protected static TabRegisterController tabRegisterController;
    protected static TabDataController tabDataController;
    protected static TabTestController tabTestController;

    public static void setMainMenuController(MainMenuController mainMenuController) {
        MediatorController.mainMenuController = mainMenuController;
    }
    public static void setTabRegisterController(TabRegisterController tabRegisterController) {
        MediatorController.tabRegisterController = tabRegisterController;
    }
    public static void setTabDataController(TabDataController tabDataController) {
        MediatorController.tabDataController = tabDataController;
    }
    public static void setTabTestController(TabTestController tabTestController) {
        MediatorController.tabTestController = tabTestController;
    }
}
