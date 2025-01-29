# Скелет робота управления ПК

## Методы управления

1) `screenShot(String nameScreen)` - создает скриншот рабочего стола
2) `moveMouse(int x, int y)` - управляет перемещением мыши
3) `rollUp()` - альтернатива ALT + TAB
4) `enter()` - нажатие на Enter
5) `upArrow()`, `downArrow()`, `leftArrow()` и `rightArrow()` - обрабатывает нажатие на стрелочки
6) `clickLeftMouse()` и `clickRightMouse()` - нажатие на правую и левую кнопку мыши
7) `createText(String text)` - метод для печати текста

## Методы спама

1) `spamLeftClick(int quantity)` и `spamRightClick(int quantity)` - нажатие на кнопку мыши N-число раз
2) `spamTextPlusEnter(String text,int quantity)` - спамит текст и нажимает enter после сообщения
3) `spamScreenshot(String name, int quantity)` - создает N-число скриншотов