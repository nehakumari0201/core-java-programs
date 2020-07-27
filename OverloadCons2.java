 class Box1{
	double width;
	double height;
	double depth;
	Box1(Box1 ob){
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	Box1(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	Box1(){
		width=-1;
		height=-1;
		depth=-1;
	}
	Box1(double len){
		width=height=depth=len;
	}
	double volume() {
		return width*height*depth;
	}
}
public class OverloadCons2 {

	public static void main(String[] args) {
		 Box1 mybox1=new Box1(10,20,15);
		 Box1 mybox2=new Box1();
		 Box1 Mycube =new Box1(7);
		 Box1 myclone =new Box1(mybox1);
		 double vol;
		 vol=mybox1.volume();
		 System.out.println("Volume of mybox1 is"+vol);
		 vol=mybox2.volume();
		 System.out.println("Volume of mybox2 is"+vol);
		 vol=Mycube.volume();
		 System.out.println("volume of cube is "+vol);
		 vol=myclone.volume();
		 System.out.println("volume of clone is "+vol);

	}

}
