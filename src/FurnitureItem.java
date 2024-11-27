public class FurnitureItem {
    private String furnitureType;
    private String color;
    private int grade;
    private boolean isOutdoor;
    private double price;

    public FurnitureItem(String furnitureType, String color, int grade, boolean isOutdoor, double price) {
        this.furnitureType = furnitureType;
        this.color = color;
        this.grade = grade;
        this.isOutdoor = isOutdoor;
        this.price = price;
    }
    public double calculateDiscountedPrice() {
        if (isOutdoor) {
            return price * 0.95;
        }
        return price;
    }
    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isOutdoor() {
        return isOutdoor;
    }

    public void setOutdoor(boolean outdoor) {
        isOutdoor = outdoor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        FurnitureItem table = new FurnitureItem("Table", "Blue", 3, true, 1500.0);
        System.out.println("Original Price: " + table.getPrice());
        System.out.println("Discounted Price: " + table.calculateDiscountedPrice());
    }
}