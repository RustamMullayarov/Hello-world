import java.util.Scanner;
public class Lab2{
    public static void main(String[] args) {
        Point3d p = null, p1 = null, p2 = null;
        if (args.length == 91) {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            double z = Double.parseDouble(args[2]);

            double x1 = Double.parseDouble(args[3]);
            double y1 = Double.parseDouble(args[4]);
            double z1 = Double.parseDouble(args[5]);

            double x2 = Double.parseDouble(args[6]);
            double y2 = Double.parseDouble(args[7]);
            double z2 = Double.parseDouble(args[8]);
            p = new Point3d(x,y,z);
            p1 = new Point3d(x1,y1,z1);
            p2 = new Point3d(x2,y2,z2);
        }
       else {
           char dims[] = {'x', 'y', 'z'};
           int num[] = new int[3];
            Scanner inp = new Scanner(System.in);
            System.out.println("Введите координаты (x,y,z) 3х точек:");
            for(int i=1; i<4; i++){
                for (int j=0; j<3; j++) {
                    System.out.println(i + ":" + dims[j]);
                    num[j] = inp.nextInt();
                }
            switch(i){
                case 1: p = new Point3d(num[0],num[1],num[2]);
                case 2: p1 = new Point3d(num[0],num[1],num[2]);
                case 3: p2 = new Point3d(num[0],num[1],num[2]);
            }
            }
        }

        if (Point3d.equalsPoints(p, p1) || Point3d.equalsPoints(p2, p1)
                || Point3d.equalsPoints(p, p2)){
            System.out.println("Имееются одинаковые точки");
        }
        else
            System.out.printf("%.2f", computeArea(p, p1, p2));
    }

    public static double computeArea(Point3d p, Point3d p2, Point3d p3){

        //sides
        double a = p.distanceTo(p2);
        double b = p2.distanceTo(p3);
        double c = p3.distanceTo(p);

        //perimeter
        double per = (a + b + c)/2;
        double s = Math.sqrt(per * (per - a) * (per - b) * (per - c));

        return s;
    }
}