package com.neroimor;

import java.awt.*;

public class SpamBot {

    RobotLib robotLib = new RobotLib();

    public void spamLeftClick(int quantity) throws AWTException {
        for(int i =0; i < quantity; i++){
            robotLib.clickLeftMouse();
        }
    }
    public void spamRightClick(int quantity) throws AWTException {
        for(int i =0; i < quantity; i++){
            robotLib.clickRightMouse();
        }
    }

    public void spamTextPlusEnter(String text,int quantity) throws AWTException {
        for(int i =0; i < quantity; i++){
            robotLib.createText(text);
            robotLib.enter();
        }
    }

}
