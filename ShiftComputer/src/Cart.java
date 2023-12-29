public class Cart {
    public Part[] parts;
    public int size; 

    public Cart() {
        this.parts = new Part[15];
        this.size = 0;
    }

    public void addPart(Part part) {
        if (size < parts.length) {
            parts[size++] = part;
            System.out.println(part.getName() + " has been added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more parts.");
        }
    }

    public Part[] getParts(){
        return parts;
    }

    public void removePart(Part part) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (parts[i] == part) {
                shiftArrayToLeft(i);
                size--;
                found = true;
                System.out.println(part.getName() + " has been removed from the cart.");
                break;
            }
        }

        if (!found) {
            System.out.println(part.getName() + " not found in the cart.");
        }
    }

    private void shiftArrayToLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            parts[i] = parts[i + 1];
        }
        parts[size - 1] = null; 
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Part part : parts) {
            if (part != null) {
                totalPrice += part.getPrice();
            }
        }
        return totalPrice;
    }

    public void clearCart() {
        parts = new Part[15];
        size = 0;
        System.out.println("Cart has been cleared.");
    }
}
