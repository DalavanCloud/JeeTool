/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.muni.fi.crocs.EduHoc.Serial;

import cz.muni.fi.crocs.EduHoc.uploadTool.MoteList;

/**
 *
 * @author LukeMcNemee
 */
public class SerialPortWriter {
    
    private boolean silent = false;
    private boolean verbose = false;
    private String filePath;
    private MoteList motelist;
    
    
    public void setVerbose(){
        verbose = true;
    }
    
    public void setSilent(){
        silent = true;
    }
}