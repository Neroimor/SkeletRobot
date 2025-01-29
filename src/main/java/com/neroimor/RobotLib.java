package com.neroimor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RobotLib {

    public void screenShot(String nameScreen) throws IOException, AWTException {
        Robot robot = new Robot();

        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

        BufferedImage screenCapture = robot.createScreenCapture(screenRect);

        ImageIO.write(screenCapture, "png", new File(nameScreen+".png"));
    }

    public void moveMouse(int x, int y) throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(x, y);

    }

    public void rollUp() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);

        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.delay(100);
    }

    public void enter() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(100);
    }

    public void upArrow() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);
        robot.delay(100);
    }
    public void downArrow() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.delay(100);
    }
    public void leftArrow() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_LEFT);
        robot.delay(100);
    }
    public void rightArrow() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_LEFT);
        robot.delay(100);
    }

    public void clickLeftMouse() throws AWTException {
        Robot robot = new Robot();
        robot.mousePress(java.awt.event.InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(java.awt.event.InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(100);
    }

    public void clickRightMouse() throws AWTException {
        Robot robot = new Robot();
        robot.mousePress(java.awt.event.InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(java.awt.event.InputEvent.BUTTON3_DOWN_MASK);
        robot.delay(100);
    }



    public void createText(String text) throws AWTException {
        pressText(text.toLowerCase().toCharArray());

    }


    private void pressText(char[] arrSymbols) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < arrSymbols.length; i++) {
            if (arrSymbols[i] == ' ') {
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyRelease(KeyEvent.VK_SPACE);
            } else {
                robot.keyPress(getKeyEvent(arrSymbols[i]));
                robot.keyRelease(getKeyEvent(arrSymbols[i]));
            }
        }
        robot.delay(100);
    }

    private int getKeyEvent(char c) {
        try {
            return KeyEvent.class.getField("VK_" + Character.toUpperCase(c)).getInt(null);
        } catch (Exception e) {
            return  KeyEvent.VK_TAB;
        }
    }

}
