package net.incandescently.advisingqueuefx;

import javafx.fxml.FXML;
import advisingQueue.*;

/**
 * @author Josh Flatt
 * CS 200 Final Project
 * 10 December 2022
 */
public class MainController {

    protected AdvisingQueueSystem advisingQueueSystem = new AdvisingQueueSystem();
    protected AdvisorQueue cjAQ = advisingQueueSystem
            .CreateAdvisorQueueA(new Advisor("CJ", "Cron", "firstBaseman@rockies.com"));
    protected AdvisorQueue brendanAQ = advisingQueueSystem
            .CreateAdvisorQueueB(new Advisor("Brendan", "Rodgers", "secondBaseman@rockies.com"));
    protected AdvisorQueue alanAQ = advisingQueueSystem
            .CreateAdvisorQueueC(new Advisor("Alan", "Trejo", "shortstop@rockies.com"));
    protected AdvisorQueue ryanAQ = advisingQueueSystem
            .CreateAdvisorQueueD(new Advisor("Ryan", "McMahon", "thirdBaseman@rockies.com"));



    // Initialize

    private AdvisorController advisorController;
    @FXML
    private TabRegisterController tabRegisterController;
    @FXML
    private TabAdvisorAlanController tabAdvisorAlanController;
    @FXML
    private TabAdvisorBrendanController tabAdvisorBrendanController;
    @FXML
    private TabAdvisorCJController tabAdvisorCJController;
    @FXML
    private TabAdvisorRyanController tabAdvisorRyanController;
    @FXML
    private TabDataController tabDataController;

    public void initialize() {
        advisorController = new AdvisorController();
        MediatorController.setMainMenuController(this);
        MediatorController.setAdvisorController(advisorController);
        MediatorController.setTabRegisterController(tabRegisterController);
        MediatorController.setTabAdvisorAlanController(tabAdvisorAlanController);
        MediatorController.setTabAdvisorBrendanController(tabAdvisorBrendanController);
        MediatorController.setTabAdvisorCJController(tabAdvisorCJController);
        MediatorController.setTabAdvisorRyanController(tabAdvisorRyanController);
        MediatorController.setTabDataController(tabDataController);
        if (advisingQueueSystem.getMeetings().size() > 0) {
            MediatorController.tabDataController.setDataTableAttributes();
        }
    }

}
