/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footshape;

import java.util.Scanner;

/**
 *
 * @author CS Student
 */
public class FootShape {

    /**
     * @param args the command line arguments
     */
    private Foot foot;
    public void getDrawTypeFromUser(String drawType) {
        switch(drawType) {
            case "Ellipse":
                foot = new Ellipse();
                break;
            case "Rectangle":
                foot = new Rectangle();
                break;
        }
    }
    
     public String draw() {
        return foot.draw();
    }
     
    public static void main(String[] args) {
        FootShape foot = new FootShape();
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                foot.getDrawTypeFromUser("Ellipse");
                break;
            case 2:
                foot.getDrawTypeFromUser("Rectangle");
                break;
        }
        System.out.println(foot.draw());        
    }
}
    
