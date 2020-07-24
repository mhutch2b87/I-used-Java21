class MarsRobot {
    String status; /* instance Variables*/
    int speed;
    float temperature;
    
    void checkTemperature() { /*instance method*/
        if (temperature < -80) {
            status = "returning home";
            speed = 5;
        }
    }
    
    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
        
    }
}