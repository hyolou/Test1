package chargame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MyChar {
	//����
	int x;
	int y;
	int size;
	Color charColor;
	char a;
	int speed;
	public MyChar(int x, int y, int size, Color charColor, char a,int speed) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.charColor = charColor;
		this.a = a;
		this.speed=speed;
	}
	//��Ϊ	
	public void drawChar(Graphics g){
		g.setColor(charColor);
		g.setFont(new Font("����",Font.BOLD,size));
		g.drawString(""+a, x, y);
	}
	public void move(){
		y+=speed;
		if(y>=600){
			//��������һ���µ���ĸ
			x=(int) (Math.random()*700);
			y=-50;
			speed=(int) (Math.random()*6+2);
			int r=(int)(Math.random()*256);
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			charColor=new Color
				(r,g,b);
			size=(int) (Math.random()*50+10);
			a=(char) (Math.random()*26+97);
		}
	}
}










