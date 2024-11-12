public class Car {
  
        private String car_no;
        private String make;
    
        Car()
        {
            this.car_no="null";
            this.make="null";
        }
        public String getCar_no() {
            return car_no;
        }
    
        public void setCar_no(String car_no) {
            this.car_no = car_no;
        }
    
        public String getMake() {
            return make;
        }
    
        public void setMake(String make) {
            this.make = make;
        }
        public void showCar()
        {
            System.out.println("Car number: "+this.car_no);
            System.out.println("Car make:"+this.make);
        }
        public void objCar(String num,String make )
        {
                 this.car_no=num;
                 this.make=make;
        }
    }
    

