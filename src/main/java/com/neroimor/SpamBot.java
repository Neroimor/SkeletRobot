package com.neroimor;

import java.awt.*;
import java.io.IOException;

public class SpamBot {

    private RobotLib robotLib = new RobotLib();

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

    public void spamScreenshot(String name, int quantity) throws AWTException, IOException {
        for(int i =0; i < quantity; i++){
            robotLib.screenShot(name+String.valueOf(i));
        }
    }

}
