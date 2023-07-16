class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1) {
            if(getBig() > 0) {
                decreaseBig();
                return true;
            } else {
                return false;
            }
        } else if (carType == 2) {
            if(getMedium() > 0) {
                decreaseMedium();
                return true;
            } else {
                return false;
            }
        } else {
            if(getSmall() > 0) {
                decreaseSmall();
                return true;
            } else {
                return false;
            }
        }
    }

    public int getBig() {
        return this.big;
    }
    
    public int getMedium() {
        return this.medium;
    }

    public int getSmall() {
        return this.small;
    }

    public void decreaseBig() {
        this.big = this.big-1;
    }

    public void decreaseMedium() {
        this.medium = this.medium-1;
    }

    public void decreaseSmall() {
        this.small = this.small-1;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
