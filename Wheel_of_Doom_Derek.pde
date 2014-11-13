/**
 this is a wheelofdoom with Siri built in(not yet)
 Made by  Derek Dai.
 */
int id=0;
boolean rolling;
boolean cheat;
Student[] honorsCS=new Student[12];
int play=0;


class Student {
  String name;
  int number;
  PImage picture;

  Student(String name_, String pic) {
    name=name_;
    number=id;
    id++;
    picture=loadImage(pic);
  }
}


void setup() {
  frameRate(8);
  size(800, 600);
  Student derek=new Student("Derek", "16jd.jpg");
  Student andrew=new Student("Andrew", "16hl.jpg");
  Student peter=new Student("Peter", "16hs.jpg");
  Student ben=new Student("Ben", "17bdg.jpg");
  Student chris=new Student("Chris", "17cre.jpg");
  Student dan=new Student("Dan", "16dt.jpg");
  Student edwin=new Student("Edwin", "16ehw.jpg");
  Student jason=new Student("Jason", "17jtl.jpg");
  Student joe=new Student("Joe", "18jey.jpg");
  Student megan=new Student("Megan", "17mev.jpg");
  Student chris_c=new Student("Chris Choi", "16mc.jpg");
  Student neal=new Student("Neal", "15nkp.jpg");
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


void display() {
  image(honorsCS[play].picture, 0, 0, width/2, height);
  textSize(20);
  text(honorsCS[play].name, 3*width/4.0-15, height/2);
  play=(play+1)%honorsCS.length;
}

void mousePressed() {
  if (rolling) {
    if(cheat){
     noLoop();
     background(0);
    image(honorsCS[8].picture,0,0,width/2,height);
    text(honorsCS[8].name, 3*width/4.0-15, height/2);
    textSize(20);
    }
    noLoop();
    rolling=false;
  } else {
    rolling=true;
    loop();
  }
}

void draw() {
  background(0);
  display();
  noCheat();
}

void noCheat() {


  if (keyPressed) {
    if (key == 'j' || key == 'J') {
      cheat=true;
    }
    if(key=='k'){
    cheat=false;
    }

  }}

