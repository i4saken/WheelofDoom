import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Wheel_of_Doom_Derek extends PApplet {

/**
 this is a wheelofdoom with Siri built in(not yet)
 Made by  Derek Dai.
 */
int id=0;
boolean rolling;
Students[] honorsCS=new Students[12];
int play=0;

class Students {
  String name;
  int number;
  PImage picture;

  Students(String name_, String pic) {
    name=name_;
    number=id;
    id++;
    picture=loadImage(pic);
  }
}


public void setup() {
  frameRate(8);
  size(800, 600);
  Students derek=new Students("Derek", "16jd.jpg");
  Students andrew=new Students("Andrew", "16hl.jpg");
  Students peter=new Students("Peter", "16hs.jpg");
  Students ben=new Students("Ben", "17bdg.jpg");
  Students chris=new Students("Chris", "17cre.jpg");
  Students dan=new Students("Dan", "16dt.jpg");
  Students edwin=new Students("Edwin", "16ehw.jpg");
  Students jason=new Students("Jason", "17jtl.jpg");
  Students joe=new Students("Joe", "18jey.jpg");
  Students megan=new Students("Megan", "17mev.jpg");
  Students chris_c=new Students("Chris Choi", "16mc.jpg");
  Students neal=new Students("Neal", "15nkp.jpg");
  honorsCS[0]=derek;
  honorsCS[1]=andrew;
  honorsCS[2]=peter;
  honorsCS[3]=ben;
  honorsCS[4]=chris;
  honorsCS[5]=dan;
  honorsCS[6]=edwin;
  honorsCS[7]=jason;
  honorsCS[8]=joe;
  honorsCS[9]=megan;
  honorsCS[10]=chris_c;
  honorsCS[11]=neal;
}

//String numberToName(int i) {
//  if (i==0) return "Derek";
//  if (i==1) return "Andrew";
//  if (i==2) return "Peter";
//  if (i==3) return "Ben";
//  if (i==4) return "Chris";
//  if (i==5) return "Dan";
//  if (i==6) return "Edwin";
//  if (i==7) return "Jason";
//  if (i==8) return "Joe";
//  if (i==9) return "Megan";
//  if (i==10) return "Chris Choi";
//  if (i==11) return "Neal";
//  return "No name assiocates with this number";
//}
//void nameToNumber(String i) {
//
//}


public void display() {
  image(honorsCS[play].picture, 0, 0, width/2, height);
  textSize(20);
  text(honorsCS[play].name, 3*width/4.0f-15, height/2);
  play=(play+1)%12;
}

public void mousePressed(){
if(rolling){
noLoop();
rolling=false;
}
else{
  rolling=true;
  loop();
}
}
public void draw() {
  background(0);
  display();
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Wheel_of_Doom_Derek" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
