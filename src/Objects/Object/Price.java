package Objects.Object;

import Objects.Enum.Currency;
import Objects.Enum.Rarity;

public class Price {
    private Country country;
    private Rarity rarity;
    private int price;
    private Currency currency;

    public Price() {
    }

    public Price(Country country, Rarity rarity, int price, Currency currency) {
        this.country = country;
        this.rarity = rarity;
        this.price = price;
        this.currency = currency;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
