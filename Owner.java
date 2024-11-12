public class Owner {
        private String name;
        private String CNIC;
        Car car1=new Car();
        Mobile m1=new Mobile();
        Owner()
        {
            name="null";
            CNIC="00";
        }
        public String getCNIC() {
            return CNIC;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getName() {
            return name;
        }
    
        public void setCNIC(String CNIC) {
            this.CNIC = CNIC;
        }
        public void showInfo()
        {
            System.out.println("Owner Name"+this.name);
            System.out.println("Owner CNIC:"+this.CNIC);
            car1.showCar();
            m1.showMobile();
        }
    
    
    }
    

