package com.java.solid.lsp;

public class MainProg {

    public static void main(String[] args) {
        Details[] details = new Details[] {
          new Harsh(), new Shaili(),new Subham()
        };

        for(Details detail : details){
            detail.showInfo();
        }
    }
}
