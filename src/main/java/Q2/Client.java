package Q2;

public class Client {
    public static void main(String[] args) {
        RideServiceFacade facade = new RideServiceFacade();

        // Example: Customer selects carX service
        ServiceStrategyInterface service = facade.selectService("carX");
        System.out.println("The fee for your service is: $" + service.calculateFee());

        // Example: Customer selects carPOOL service
        service = facade.selectService("carPOOL");
        System.out.println("The fee for your service is: $" + service.calculateFee());

        // Example: Customer selects carBlack service
        service = facade.selectService("carBlack");
        System.out.println("The fee for your service is: $" + service.calculateFee());

    }
}