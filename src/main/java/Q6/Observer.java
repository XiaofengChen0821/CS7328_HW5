package Q6;

import java.util.ArrayList;
import java.util.List;
// Observer Interface
interface RiderObserver {
    void update(String couponCode);
}

// Subject Interface
interface CouponSystem {
    void registerObserver(RiderObserver o);
    void removeObserver(RiderObserver o);
    void notifyObservers();
}

// Concrete Subject
class CouponDistributionSystem implements CouponSystem {
    private List<RiderObserver> observers = new ArrayList<>();
    private String couponCode;

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
        notifyObservers();
    }

    @Override
    public void registerObserver(RiderObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(RiderObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (RiderObserver observer : observers) {
            observer.update(couponCode);
        }
    }
}

// Concrete Observer
class Rider implements RiderObserver {
    private String name;

    public Rider(String name) {
        this.name = name;
    }

    @Override
    public void update(String couponCode) {
        System.out.println
                (name + " received a new coupon: " + couponCode);
    }
}

