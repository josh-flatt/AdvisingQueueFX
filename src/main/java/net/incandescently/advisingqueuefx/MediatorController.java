package net.incandescently.advisingqueuefx;

public abstract class MediatorController {
    protected static MainController mainController;
    protected static AdvisorController advisorController;
    protected static TabRegisterController tabRegisterController;
    protected static TabAdvisorAlanController tabAdvisorAlanController;
    protected static TabAdvisorBrendanController tabAdvisorBrendanController;
    protected static TabAdvisorCJController tabAdvisorCJController;
    protected static TabAdvisorRyanController tabAdvisorRyanController;
    protected static TabDataController tabDataController;

    public static void setMainMenuController(MainController mainController) {
        MediatorController.mainController = mainController;
    }
    public static void setAdvisorController(AdvisorController advisorController) {
        MediatorController.advisorController = advisorController;
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
}
