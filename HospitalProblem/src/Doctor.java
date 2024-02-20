public class Doctor extends Employee {
    private boolean isSurgeon;
    private double feePerSurgery;
    protected Doctor(String fullName, String employeeID, boolean isSurgeon, double feePerSurgery) {
        super(fullName, employeeID);
        this.isSurgeon = isSurgeon;
        this.feePerSurgery = feePerSurgery;
    }

    public void setSurgeon(boolean surgeon) {
        isSurgeon = surgeon;
    }

    public void setFeePerSurgery(double feePerSurgery) {
        this.feePerSurgery = feePerSurgery;
    }

    public double getFeePerSurgery() {
        return feePerSurgery;
    }

    public boolean isSurgeon() {
        return isSurgeon;
    }
}
