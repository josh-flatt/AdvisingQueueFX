package net.incandescently.advisingqueuefx;

public abstract class MediatorController {
    protected static MainMenuController mainMenuController;
    protected static TabRegisterController tabRegisterController;
    protected static TabAdvisorAlanController tabAdvisorAlanController;
    protected static TabAdvisorBrendanController tabAdvisorBrendanController;
    protected static TabAdvisorCJController tabAdvisorCJController;
    protected static TabAdvisorRyanController tabAdvisorRyanController;
    protected static TabDataController tabDataController;
    protected static TabTestController tabTestController;

    public static void setMainMenuController(MainMenuController mainMenuController) {
        MediatorController.mainMenuController = mainMenuController;
    }
    public static void setTabRegisterController(TabRegisterController tabRegisterController) {
        MediatorController.tabRegisterController = tabRegisterController;
    }
    public static void setTabAdvisorAlanController(TabAdvisorAlanController tabAdvisorAlanController) {
        MediatorController.tabAdvisorAlanController = tabAdvisorAlanController;
    }
    protected static void setTabAdvisorBrendanController(TabAdvisorBrendanController tabAdvisorBrendanController) {
        MediatorController.tabAdvisorBrendanController = tabAdvisorBrendanController;
    }
    protected static void setTabAdvisorCJController(TabAdvisorCJController tabAdvisorCJController) {
        MediatorController.tabAdvisorCJController = tabAdvisorCJController;
    }
    protected static void setTabAdvisorRyanController(TabAdvisorRyanController tabAdvisorRyanController) {
        MediatorController.tabAdvisorRyanController = tabAdvisorRyanController;
    }
    public static void setTabDataController(TabDataController tabDataController) {
        MediatorController.tabDataController = tabDataController;
    }
    public static void setTabTestController(TabTestController tabTestController) {
        MediatorController.tabTestController = tabTestController;
    }
}
