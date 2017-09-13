package com.pack.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JEditorPane;

public class ConvertingHtmlToImage {

	 private static final int WIDTH = 1204;
	    private static final int HEIGHT = 768;

	    public static void main(String[] args) throws IOException {
	        // open HTML page
	        JEditorPane editorPane = new JEditorPane();
	        editorPane.setEditable(false);
	        URL urlToPage = new File("C:\\Users\\E002466\\Desktop\\emailable-report.html").toURI().toURL();
	        editorPane.setPage(urlToPage);
	        editorPane.setSize(WIDTH, HEIGHT);
 // render the page
	        BufferedImage renderedImage = new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
	        editorPane.print(renderedImage.getGraphics());

	        // write result to file
	        ImageIO.write(renderedImage, "PNG", new File("C:\\Users\\E002466\\Desktop\\emailable-report.png"));
	        
	        
	   
	    }
}
