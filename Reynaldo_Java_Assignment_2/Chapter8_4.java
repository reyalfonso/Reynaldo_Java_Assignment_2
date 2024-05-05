
public class Chapter8_4 {
    private double length;
    private double width;

    // constructor 
    public Chapter8_4() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // setting methods 
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Invalid length., Length should be greater than 0.0 and less than 20.0");
        }
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Invalid width., Width should be greater than 0.0 and less than 20.0");
        }
    }

    // Getting methods 
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // calculating perimeter of rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // calculating area of rectangle
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Chapter8_4 rectangle = new Chapter8_4();

        // length and width
        rectangle.setLength(25.64);
        rectangle.setWidth(-8.25);

        System.out.println();
        System.out.println("Length:\t\t " + rectangle.getLength());
        System.out.println("Width:\t\t " + rectangle.getWidth());
        System.out.println("Perimeter:\t " + rectangle.calculatePerimeter());
        System.out.println("Area:\t\t " + rectangle.calculateArea());
    }  // main
} // class
