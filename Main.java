import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.Jlabel;


class MarvellousMain
{
	public static void main(String[] args) 
	{
		try
		{
		Marvellouslogin frame=new Marvellouslogin();
		frame.setVisible(true);
		}
		catch
		{
			JOptionPane.showmessageDialogue(null,e.getMessage());
		}
	}

}