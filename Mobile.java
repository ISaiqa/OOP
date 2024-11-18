public class Mobile {
        private String screenSize;
        private String color;
        Mobile ()
        {
            this.screenSize="null";
            this.color="null";
        }
        Mobile(String c,String ss)
        {
            this.screenSize=ss;
            this.color=c;
         }
    
        public void setScreenSize(String screenSize) {
            this.screenSize = screenSize;
        }
    
        public String getColor() {
            return color;
        }
    
        public void setColor(String color) {
            this.color = color;
        }
    
        public String getScreenSize() {
            return screenSize;
        }
        public void showMobile()
        {
            System.out.println("Mobile Screen size:"+this.screenSize);
            System.out.println("Mobile color:"+this.color);
        }
        public void objMobile(String screen,String color )
        {
            this.color=color;
            this.screenSize=screen;
    
        }
    }
    

