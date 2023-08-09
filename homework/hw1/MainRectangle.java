class MainRectangle{
    public static void main(String[] args){
        if (args.length % 4 == 0 && args.length >= 4){
            Rectangle boundedRectangle = new Rectangle();
            boundedRectangle.x = Double.parseDouble(args[0]);
            boundedRectangle.y = Double.parseDouble(args[1]);
            boundedRectangle.width = Double.parseDouble(args[2]);
            boundedRectangle.height = Double.parseDouble(args[3]);

            if (args.length > 4){
                for (int i = 4; i<args.length;i+=4){
                    
                    Rectangle tempRectangle1 = new Rectangle();
                    tempRectangle1.x = Double.parseDouble(args[i]);
                    tempRectangle1.y = Double.parseDouble(args[i+1]);
                    tempRectangle1.width = Double.parseDouble(args[i+2]);
                    tempRectangle1.height = Double.parseDouble(args[i+3]);
                    
                    Rectangle tempRectangle2 = new Rectangle();
                    tempRectangle2.x = boundedRectangle.x;
                    tempRectangle2.y = boundedRectangle.y;
                    tempRectangle2.width = boundedRectangle.width;
                    tempRectangle2.height = boundedRectangle.height;

                    boundedRectangle.x = Double.min(tempRectangle2.bottomLeft().x, tempRectangle1.bottomLeft().x);
                    boundedRectangle.y = Double.min(tempRectangle2.bottomLeft().y, tempRectangle1.bottomLeft().y);
                    boundedRectangle.width = Double.max(tempRectangle2.topRight().x, tempRectangle1.topRight().x) - boundedRectangle.x;
                    boundedRectangle.height = Double.max(tempRectangle2.topRight().y, tempRectangle1.topRight().y) - boundedRectangle.y;
                }
            }
            Point leftBottom = boundedRectangle.bottomLeft();
            Point rightTop = boundedRectangle.topRight(); 
            System.out.println(leftBottom.x + " " + leftBottom.y + " - " + rightTop.x + " " + rightTop.y);
        } else {
            System.out.println("Wrong number of arguments!" + " (" + args.length + ")");
            System.exit(0);
        }
    }
}