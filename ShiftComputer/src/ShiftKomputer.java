import java.util.Scanner;

public class ShiftKomputer {
    private Store store;
    private Cart cart;
    private Scanner scanner;

    public ShiftKomputer() {
        this.store = new Store();
        this.cart = new Cart();
        this.scanner = new Scanner(System.in);
    }

    public void buyPart() {
        System.out.println("===Daftar Part===");
        System.out.println("1. GPU");
        System.out.println("2. CPU");
        System.out.println("3. POWER SUPPLY");
        System.out.println("4. MOTHERBOARD");
        System.out.println("5. RAM");
        System.out.println("6. STORAGE");
        System.out.println("7. CASE");
        System.out.println("8. EXIT");
    
        Part[] parts = this.store.getParts();
        System.out.print("Pilih part yang ingin dibeli: ");
        int menu = scanner.nextInt();
    
        switch (menu) {
            case 1:
                System.out.println("===Daftar GPU===");
                for (Part part : parts) {
                    if (part instanceof GPU) {
                        part.displayDetails();
                    }
                }
    
                System.out.print("Pilih GPU yang ingin dibeli (1-" + parts.length + "): ");
                int gpuMenu = scanner.nextInt();
    
                if (gpuMenu >= 1 && gpuMenu <= parts.length && parts[gpuMenu - 1] instanceof GPU) {
                    Part selectedGPU = parts[gpuMenu - 1];
                    cart.addPart(selectedGPU);
                    System.out.println("GPU " + selectedGPU.getName() + " telah ditambahkan ke Cart.");
                } else {
                    System.out.println("Pilihan GPU tidak valid.");
                }
                break;
            case 2:
                System.out.println("===Daftar CPU===");
                for (Part part : parts) {
                    if (part instanceof CPU) {
                        part.displayDetails();
                    }
                }
    
                System.out.print("Pilih CPU yang ingin dibeli (1-" + parts.length + "): ");
                int cpuMenu = scanner.nextInt();
    
                if (cpuMenu >= 1 && cpuMenu <= parts.length && parts[cpuMenu - 1] instanceof CPU) {
                    Part selectedCPU = parts[cpuMenu - 1];
                    cart.addPart(selectedCPU);
                    System.out.println("CPU " + selectedCPU.getName() + " telah ditambahkan ke Cart.");
                } else {
                    System.out.println("Pilihan CPU tidak valid.");
                }
                break;
            case 3:
                break;
            case 8:
                break;
            default:
                System.out.println("Pilihan tidak valid. Silahkan coba lagi");
        }
    }

    public void buyComputer() {
    }

    public void viewCart() {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Cart Menu: ");
            System.out.println("1.View Cart");
            System.out.println("2.Checkout");
            System.out.println("Pilihlah Menu: ");
            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                displayCart();
                break;
                case 2:
                Checkout();
                break;
                case 3:
                clearCart();
                break;
            }
        }
    }

    public void displayCart(){
    System.out.println("=== Cart ===");
    Part[] cartItems = cart.getParts();

    if (cartItems.length == 0) {
        System.out.println("Cart is empty.");
    } else {
        for (Part part : cartItems) {
            if (part != null) {
                part.displayDetails();
            }
        }
    }
    }

    public void clearCart(){
    cart.clearCart();
}

public void Checkout() {
    System.out.println("=== Checkout ===");
    displayCart(); 
    double totalPrice = cart.calculateTotalPrice();
    System.out.println("Total Price: Rp." + totalPrice);
    System.out.println("Thank you for shopping!");
    clearCart(); 
}
    }
