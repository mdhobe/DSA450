class ParkingSystem {
    int bigParking = 0;
    int mediumParking = 0;
    int smallParking = 0;

    public ParkingSystem(int big, int medium, int small) {
        bigParking = big;
        mediumParking = medium;
        smallParking = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1 && bigParking > 0){
            bigParking -= 1;
            return true;
        }
        if(carType == 2 && mediumParking > 0){
            mediumParking -= 1;
            return true;
        }
        if(carType == 3 && smallParking > 0){
            smallParking -= 1;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
