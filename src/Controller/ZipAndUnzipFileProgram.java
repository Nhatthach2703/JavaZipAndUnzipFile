/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.ZipAndUnzipFileRepository;
import View.Menu;
import java.util.ArrayList;

/**
 *
 * @author Xuan Vinh
 */
public class ZipAndUnzipFileProgram extends Menu<String>{
    static String[] mc = {"Compression", "Extraction", "Exit"};
    ZipAndUnzipFileRepository program;
    
    public ZipAndUnzipFileProgram() {
        super("\nZipper program", mc);
        program = new ZipAndUnzipFileRepository();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.zipFile();
                break;
            case 2:
                program.unzipFile();
                break;
            case 3:
                System.exit(0);
        }
    }
    
}
